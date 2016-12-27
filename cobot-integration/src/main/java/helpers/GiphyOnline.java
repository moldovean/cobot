package helpers;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONException;

import java.util.List;

public class GiphyOnline {

    public String get(String word) {
        StringBuilder response = new StringBuilder();
        try {
            Translator translator = new Translator();

            String gifUrl = Unirest.get("http://api.giphy.com/v1/gifs/random")
                    .queryString("api_key", "dc6zaTOxFJmzC")
                    .queryString("tag", translator.en(word))
                    .asJson().getBody().getObject()
                    .getJSONObject("data")
                    .getString("fixed_height_small_url");

            response.append("<img src=\"" + gifUrl + "\">");
        } catch (UnirestException | JSONException e) {
            response.append("Sau terminat toate imaginile cu " + word);
        }

        return response.toString().trim();
    }

    public String get(List<String> words) {
        StringBuilder response = new StringBuilder();
        try {
            Translator translator = new Translator();

            String gifUrl = Unirest.get("http://api.giphy.com/v1/gifs/random")
                    .queryString("api_key", "dc6zaTOxFJmzC")
                    .queryString("tag", translator.en(words))
                    .asJson().getBody().getObject()
                    .getJSONObject("data")
                    .getString("fixed_height_small_url");

            response.append("<img src=\"" + gifUrl + "\">");
        } catch (UnirestException | JSONException e) {
            response.append("Sau terminat toate imaginile cu " + words.get(0));
        }

        return response.toString().trim();
    }
}
