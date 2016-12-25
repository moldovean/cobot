package playground.old;

import java.util.ArrayList;
import java.util.List;

import static helpers.DexOnline.get;



/**
 * Created by adri on 12/9/16.
 */
public class DexOnlineTest {

    public static void main(String[] args) {
        List<String> iaka = new ArrayList<>();
        iaka.add("cartier");
        iaka.add("infractiune");
        System.out.println(get("cartier"));

    }

}
