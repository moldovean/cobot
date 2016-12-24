package helpers;

/**
 * Created by adri on 12/24/16.
 */
public class WebAddresses {
    public String getWebAddress(String keyword){
        if (keyword.equals("denunț"))
            return "http://cna.md/denunt.php?l=ro&idc=141&t=/Denuntam-un-caz-de-coruptie/On-line/Caz-de-coruptie";
        return "";
    }
}
