package plain;

import org.junit.Test;
import playground.PlainBot;

import static org.junit.Assert.assertEquals;

/**
 * Created by avrabie on 12/21/2016.
 */
public class TestPlainBot {


    @Test
    public void testBot(){

        PlainBot plainBot = new PlainBot();
        String utterance = "ce este cna";
        String response = plainBot.chat(utterance);
        assertEquals("cna  este  Centrul Național Anticorupție", response);
    }

}
