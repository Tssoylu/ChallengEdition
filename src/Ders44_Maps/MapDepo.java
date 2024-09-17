package Ders44_Maps;

import java.util.*;

public class MapDepo {

    // ogrenci map olusturup bize donduren bir method olusturun

    public static Map<Integer,String>ornekMapOlustur(){
        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;

    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {



        String ogrenciValue=ogrenciMap.get(ogrenciKey); // Ayse-Cem-11-M-TM,

        String [] valueArr= ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

        String isimSoyisim = valueArr[0]+ " " + valueArr[1]; // Ayse , Cem

        return isimSoyisim;
    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {




        // ogrenciKey map'de var mi ?


        if (ogrenciMap.containsKey(ogrenciKey)){

            // istenen Key, varsa update edip yeni Map'i dondurucez
            String istenenKeyinValuesu= ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
            String [] istenenKeyValueArr= istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H, MF]
            // yeni sube degerini atayalim
            istenenKeyValueArr[3]= yeniSube; // [Ayse, Can, 10, K, MF]

            String istenenKeyinYeniValuesu = istenenKeyValueArr[0]+"-"+
                                             istenenKeyValueArr[1]+"-"+
                                             istenenKeyValueArr[2]+"-"+
                                             istenenKeyValueArr[3]+"-"+
                                             istenenKeyValueArr[4];
            ogrenciMap.put(ogrenciKey,istenenKeyinYeniValuesu);

        }
            return ogrenciMap;
    }

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {

        Collection<String> valueCollection = ogrenciMap.values();

        /*
        [Ali-Can-10-H-MF,
        Veli-Cem-11-M-Soz,
        Ali-Cem-11-H-TM,
        Ayse-Can-10-H-MF,
        Ayse-Cem-11-M-TM,
        Fatma-Han-10-K-Soz]
         */
        System.out.println("Isim      Soyisim     Sinif");
        System.out.println("============================");
        for (String eachValue : valueCollection){

            // value'yu parcalara ayir
            String[] valueArr = eachValue.split("-"); // [Ayse, Can, 10, H, MF]

            // sube ismini kontrol et, istenen sube ise isim soyisim sinif yazdir.

            if (valueArr[3].equals(subeAdi)){
                System.out.println(valueArr[0]+" "+valueArr[1]+" "+valueArr[2]);
            }

        }

    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int baslangicNo, int bitisNo) {

        // hem Key hem de Value lazim oldugundan keySet'i olusturup
        // sonra o Key uzerinden value'yu map'den aldik
        Set<Integer> ogrenciKeySet =ogrenciMap.keySet();

        // dondurecegimiz listeyi olusturalim
        List<String > isimListesi=new ArrayList<>();

        // Key degerlerini tek tek elden gecirip
        // istenen aralikta olanlari bulalim


        String value;
        String[] valueArr;
        String istenenIsim;

        for (Integer eachKey : ogrenciKeySet){
            if (baslangicNo<= eachKey && eachKey<=bitisNo){
                // buraya verilen sinir degerlerine uyan
                // eachKey'ler gelicek

                // sinira uygun key'in value'sunu alalim
                value=ogrenciMap.get(eachKey); // Ayse-Can-10-H-MF

                // value'yu parcalara ayiralim
                valueArr=value.split("-"); // [Ayse,Can,10,H,MF]

                // value array'inden listeye eklenecek bilgileri alalim
                istenenIsim=valueArr[0]+" "+valueArr[1]+" "+valueArr[4];

                // istenen ismi olusturduk bunu listeye ekleyelim
                isimListesi.add(istenenIsim);

            }
        }
        return isimListesi;
    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {


        Set<Integer> keySet=ogrenciMap.keySet();

        String value;
        String [] valueArr;

        for (Integer eachKey : keySet){

            value=ogrenciMap.get(eachKey);
            valueArr=value.split("-"); // [Ayse,Can,10,H,MF]

            System.out.println(eachKey + " " + valueArr[0] + " " + valueArr[1]);

        }
    }
}