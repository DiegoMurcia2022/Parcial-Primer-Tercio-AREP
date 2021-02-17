package edu.eci.arep;

import edu.eci.arep.exceptions.WeatherServiceException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherServiceImpl {
    public static String getCityWeather(String city) throws WeatherServiceException {
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5"+"/weather?q="+city+"&appid=e628c368c1c5532a4149b93c361ab853");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            StringBuffer response = null;
            int responseCode = connection.getResponseCode();

            if (responseCode==HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine = in.readLine();
                response = new StringBuffer();
                while (inputLine!=null) {
                    response.append(inputLine);
                    inputLine = in.readLine();
                }

                in.close();
            } else {
                throw new WeatherServiceException("City not found.");
            }

            return String.valueOf(response);
        } catch (Exception e) {
            throw new WeatherServiceException(e.getMessage());
        }
    }
}
