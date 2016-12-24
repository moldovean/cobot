package plain;

import org.junit.Test;
import playground.ServicesBot;

import static org.junit.Assert.assertEquals;

/**
 * Created by avrabie on 12/21/2016.
 */
public class TestPlainBot {


    @Test
    public void testBot(){

        ServicesBot servicesBot = new ServicesBot();
        String utterance = "ce este cna";
        String response = servicesBot.chat(utterance);
        assertEquals("cna  este  Centrul Național Anticorupție", response);
    }

}
