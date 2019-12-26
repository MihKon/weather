package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button2);
        tv = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //вызов наследника AsyncTask
                MyWeather wth = new MyWeather();
                wth.execute();
            }
        });
    }
    private class MyWeather extends AsyncTask <Void, Void, String>{

        HttpURLConnection http;//null

        @Override
            protected String doInBackground(Void... voids) {
            try {
                URL url = new URL("http://api.weatherstack.com/current?access_key=bff4f4d7798ef7ae66a6469bf6eb45ca&query=London");
                http = (HttpURLConnection) url.openConnection();
                http.setRequestMethod("GET");
                http.connect();

                InputStream input = http.getInputStream();//ответ от нашего сервера
                Scanner scan = new Scanner(input);
                StringBuffer str1 = new StringBuffer();
                while (scan.hasNextLine()){
                    str1.append(scan.nextLine());
                }
                return str1.toString();
            } catch (java.io.IOException e) {
                Log.e("ERROR", e.toString());
                //e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Gson g = new Gson();
            Weather weather = g.fromJson(s, Weather.class);
            int temp = (int)weather.getCurrent().getTemperature();
            String s1 = weather.getLocation().getCountry();
            tv.setText(Integer.toString(temp));
        }
    }

}
