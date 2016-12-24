package playground;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by avrabie on 12/21/2016.
 */
public class TestPlainBot {
    @Test
    public void testBot(){

        ServicesBot servicesBot = new ServicesBot();

        Map<String,String> qa = new HashMap<>();
        qa.put("ce este cna","cna  este  Centrul Național Anticorupție");
        qa.put("pe cine aș putea contacta?","De cine aveti neoie? Centrul de Combatere a Corupției // Linia Fierbinte // Relații cu Publicul");

        for (String question : qa.keySet()) {
            String response = servicesBot.chat(question);
            assertEquals(qa.get(question), response);
        }




    }
}
