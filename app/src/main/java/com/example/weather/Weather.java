package com.example.weather;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Current {

    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("temperature")
    @Expose
    private long temperature;
    @SerializedName("weather_code")
    @Expose
    private long weatherCode;
    @SerializedName("weather_icons")
    @Expose
    private List<String> weatherIcons = null;
    @SerializedName("weather_descriptions")
    @Expose
    private List<String> weatherDescriptions = null;
    @SerializedName("wind_speed")
    @Expose
    private long windSpeed;
    @SerializedName("wind_degree")
    @Expose
    private long windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure")
    @Expose
    private long pressure;
    @SerializedName("precip")
    @Expose
    private double precip;
    @SerializedName("humidity")
    @Expose
    private long humidity;
    @SerializedName("cloudcover")
    @Expose
    private long cloudcover;
    @SerializedName("feelslike")
    @Expose
    private long feelslike;
    @SerializedName("uv_index")
    @Expose
    private long uvIndex;
    @SerializedName("visibility")
    @Expose
    private long visibility;
    @SerializedName("is_day")
    @Expose
    private String isDay;

    /**
     * No args constructor for use in serialization
     *
     */
    public Current() {
    }

    /**
     *
     * @param visibility
     * @param weatherCode
     * @param feelslike
     * @param observationTime
     * @param windDir
     * @param pressure
     * @param isDay
     * @param cloudcover
     * @param weatherDescriptions
     * @param precip
     * @param weatherIcons
     * @param temperature
     * @param humidity
     * @param windDegree
     * @param windSpeed
     * @param uvIndex
     */
    public Current(String observationTime, long temperature, long weatherCode, List<String> weatherIcons, List<String> weatherDescriptions, long windSpeed, long windDegree, String windDir, long pressure, double precip, long humidity, long cloudcover, long feelslike, long uvIndex, long visibility, String isDay) {
        super();
        this.observationTime = observationTime;
        this.temperature = temperature;
        this.weatherCode = weatherCode;
        this.weatherIcons = weatherIcons;
        this.weatherDescriptions = weatherDescriptions;
        this.windSpeed = windSpeed;
        this.windDegree = windDegree;
        this.windDir = windDir;
        this.pressure = pressure;
        this.precip = precip;
        this.humidity = humidity;
        this.cloudcover = cloudcover;
        this.feelslike = feelslike;
        this.uvIndex = uvIndex;
        this.visibility = visibility;
        this.isDay = isDay;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    public long getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(long weatherCode) {
        this.weatherCode = weatherCode;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    public long getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(long windSpeed) {
        this.windSpeed = windSpeed;
    }

    public long getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(long windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    public double getPrecip() {
        return precip;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public long getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(long cloudcover) {
        this.cloudcover = cloudcover;
    }

    public long getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(long feelslike) {
        this.feelslike = feelslike;
    }

    public long getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(long uvIndex) {
        this.uvIndex = uvIndex;
    }

    public long getVisibility() {
        return visibility;
    }

    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

}
class Location {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("timezone_id")
    @Expose
    private String timezoneId;
    @SerializedName("localtime")
    @Expose
    private String localtime;
    @SerializedName("localtime_epoch")
    @Expose
    private long localtimeEpoch;
    @SerializedName("utc_offset")
    @Expose
    private String utcOffset;

    /**
     * No args constructor for use in serialization
     *
     */
    public Location() {
    }

    /**
     *
     * @param localtime
     * @param country
     * @param utcOffset
     * @param localtimeEpoch
     * @param name
     * @param timezoneId
     * @param lon
     * @param region
     * @param lat
     */
    public Location(String name, String country, String region, String lat, String lon, String timezoneId, String localtime, long localtimeEpoch, String utcOffset) {
        super();
        this.name = name;
        this.country = country;
        this.region = region;
        this.lat = lat;
        this.lon = lon;
        this.timezoneId = timezoneId;
        this.localtime = localtime;
        this.localtimeEpoch = localtimeEpoch;
        this.utcOffset = utcOffset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTimezoneId() {
        return timezoneId;
    }

    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public long getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    public void setLocaltimeEpoch(long localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

}
class Request {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("unit")
    @Expose
    private String unit;

    /**
     * No args constructor for use in serialization
     *
     */
    public Request() {
    }

    /**
     *
     * @param unit
     * @param query
     * @param language
     * @param type
     */
    public Request(String type, String query, String language, String unit) {
        super();
        this.type = type;
        this.query = query;
        this.language = language;
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}

public class Weather {

    @SerializedName("request")
    @Expose
    private Request request;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("current")
    @Expose
    private Current current;

    /**
     * No args constructor for use in serialization
     *
     */
    public Weather() {
    }

    /**
     *
     * @param request
     * @param current
     * @param location
     */
    public Weather(Request request, Location location, Current current) {
        super();
        this.request = request;
        this.location = location;
        this.current = current;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

}
