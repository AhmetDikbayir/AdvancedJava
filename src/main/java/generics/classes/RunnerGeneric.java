package generics.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnerGeneric {
    public static void main(String[] args) {

        //generic yapıları kullanırken data tipine karar verilir.
        //2 farklı nesne:Laptop, book

        GenericProduct<String> book = new GenericProduct<>(); // T:String
        book.setCode("advjava");
        //yanlış kullanıma baştan izin vermiyor
        //book.setCode(123);

        GenericProduct<Integer> laptop = new GenericProduct<>(); // T:Integer
        laptop.setCode(12345);
        //laptop.setCode("laptop"); sıkı bir tür denetimi

        String str = book.getCode(); //CAST problemi kalmadı

        //String str2 = laptop.getCode(); //ClassCastException alma riski de çözülmüş oldu

        Integer code = laptop.getCode();
        //-------------------------------------
        ArrayList<String> list = new ArrayList<>();

        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Advance Java", 99.9);
        //hashMap.put(12, 23); -->CTE

        //---------------------ÇOK PARAMETRELİ GENERIC CLASS-------------------

        //S : String , U : Integer
        GenericClassTwoParam<String, Integer> obje = new GenericClassTwoParam<>("generic", 12);
        //S : String , U : Sting
        GenericClassTwoParam<String, String> obje2 = new GenericClassTwoParam<>("generics", "harika");

        //S : Double , U : Boolean
        GenericClassTwoParam<Double, Boolean> obje3 = new GenericClassTwoParam<>(12.3, Boolean.TRUE);
        System.out.println(obje.getAnahtar());







    }
}
