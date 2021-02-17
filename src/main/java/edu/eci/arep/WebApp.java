package edu.eci.arep;

import edu.eci.arep.WeatherServiceImpl;

import static spark.Spark.*;
import com.google.gson.Gson;

public class WebApp {
    public static void main(String[] args) {
        Gson gson = new Gson();

        port(getPort());

        get("/clima", (req, res) -> {
            String city = req.queryParams("lugar");
            String json = WeatherServiceImpl.getCityWeather(city);

            return gson.toJson(json);
        });
    }

    static int getPort() {
        if (System.getenv("PORT")!=null) {
            return Integer.parseInt(System.getenv("PORT"));
        }

        return 4567;
    }


}
