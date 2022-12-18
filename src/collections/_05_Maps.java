package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _05_Maps {
    public static void main(String[] args) {
        /*
        KEY               VALUES

        IL                Illinois
        WI                Wisconsin
        CA                California

        1                 Vlad
        2                 Andrii
        3                 Filiz
        4                 Vlad

        Altay             [Valentina, Aya, Bashar]
         */
        HashMap<String, String> map = new HashMap<>();
        map.put("IL", "Illinois");
        map.put("WI", "Wisconsin");
        map.put("CA", "California");
        map.put(null, "xxx");
        map.put(null, "yyy");
        map.put("A", null);
        map.put("B", null);
        map.put("C", null);
        System.out.println(map); // {null=yyy, A=null, WI=Wisconsin, B=null, IL=Illinois, C=null, CA=California}

        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("IL", "Illinois");
        map1.put("WI", "Wisconsin");
        map1.put("CA", "California");
        map1.put(null, "xxx");
        map1.put(null, "yyy");
        map1.put("A", null);
        map1.put("B", null);
        map1.put("C", null);
        System.out.println(map1); // {IL=Illinois, WI=Wisconsin, CA=California, null=yyy, A=null, B=null, C=null}
    }
}
