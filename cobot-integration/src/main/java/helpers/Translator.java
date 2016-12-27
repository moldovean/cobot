package helpers;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.List;

public class Translator {
    public String en(String word) {
        StringBuilder response = new StringBuilder();
        try {
            String body = Unirest.get("https://translate.googleapis.com/translate_a/single")
                    .queryString("client", "gtx")
                    .queryString("sl", "ro")
                    .queryString("tl", "en")
                    .queryString("dt", "t")
                    .queryString("q", String.join(" ", word))
                    .asString()
                    .getBody();

            String translate = (new JSONArray(body))
                    .getJSONArray(0)
                    .getJSONArray(0)
                    .getString(0);

            response.append(translate);
        } catch (UnirestException | JSONException e) {
            response.append(String.join(" ", word));
        }

        return response.toString().trim();
    }

    public String en(List<String> words) {
        StringBuilder response = new StringBuilder();
        try {
            String body = Unirest.get("https://translate.googleapis.com/translate_a/single")
                    .queryString("client", "gtx")
                    .queryString("sl", "ro")
                    .queryString("tl", "en")
                    .queryString("dt", "t")
                    .queryString("q", String.join(" ", words))
                    .asString()
                    .getBody();

            String translate = (new JSONArray(body))
                    .getJSONArray(0)
                    .getJSONArray(0)
                    .getString(0);

            response.append(translate);
        } catch (UnirestException | JSONException e) {
            response.append(String.join(" ", words));
        }
        return response.toString().trim();
    }
}
