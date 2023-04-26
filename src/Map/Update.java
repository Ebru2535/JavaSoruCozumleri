package Map;

import java.util.Map;

public class Update {
    public static void main(String[] args) {

        // VERİLEN MAP DE SUBE İSMİ M OLANLARIN SUBESİNİ N YAPIN

        Map<Integer, String> okulMap = MapMethotDepo.ornekMapOlustur();
        System.out.println(okulMap);
        //{101=Ali-Cem-10-H-MF,
        // 102=Veli-Can-10-M-TM,
        // 103=Ali-Can-11-M-Soz,
        // 104=Ayse-Cem-11-H-TM,
        // 105=Ayse-Han-10-H-MF,
        // 106=Veli-Han-10-H-MF}

        System.out.println(okulMap.get(101));  // Ali-Cem-10-H-MF
        okulMap.put(101,"Ali-Cem-10-M-MF");
        okulMap.put(102,"Kemal-Can-11-M-Soz");
        System.out.println(okulMap);  // {101=Ali-Cem-10-M-MF,

        okulMap=MapMethotDepo.topluSubeDegistirme(okulMap,"M","N");
        System.out.println(okulMap);


    }
}
