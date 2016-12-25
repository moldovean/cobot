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
        qa.put("ce este cna","cna, conform definiției www.cna.md : Centrul Național Anticorupție");
        qa.put("pe cine aș putea contacta?","De cine aveti neoie? Centrul de Combatere a Corupției // Linia Fierbinte // Relații cu Publicul");
        qa.put("ce este corupție", "corupție, conform definiției www.cna.md : fapta ilegală care afectează exercitarea normală a funcției și care constă fie în folosirea de către subiectul actelor de corupție sau al faptelor de comportament corupțional a funcției sale pentru solicitarea, primirea sau acceptarea, direct sau indirect, pentru sine sau pentru o altă persoană, a unor foloase materiale sau a unui avantaj necuvenit, fie în promisiunea, oferirea sau acordarea ilegală a unor asemenea foloase sau avantaje necuvenite subiectilor actelor de coruptie");

        for (String question : qa.keySet()) {
            String response = servicesBot.chat(question);
            assertEquals(qa.get(question), response);
        }




    }
}
