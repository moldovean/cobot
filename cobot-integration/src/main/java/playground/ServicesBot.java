package playground;

import bot.Cobot;
import nlp.Tokenizer;

/**
 * Created by avrabie on 12/21/2016.
 */
public class ServicesBot {
    public static String chat(String utterance) {
        Cobot cobot = new Cobot();
        utterance = utterance.toLowerCase();
        utterance = Tokenizer.lemmatizeParagraph(Tokenizer.lemmatizeParagraph(Tokenizer.lemmatizeParagraph(utterance)));
        return cobot.getResponse(utterance);
    }
}
