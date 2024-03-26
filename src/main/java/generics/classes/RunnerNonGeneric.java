package generics.classes;

import java.awt.image.AbstractMultiResolutionImage;

public class RunnerNonGeneric {
    public static void main(String[] args) {
        //2 farklı nesne: book, laptop

        NonGenericProduct book = new NonGenericProduct();
        book.setCode("advjava"); // code fieldını string data tipi ile set ettik

        NonGenericProduct laptop = new NonGenericProduct();
        laptop.setCode(123456);
        //laptop.setCode("Java");

        //--------------------------
        //1-CAST problemi!!!
        String str = (String) book.getCode();
        //2-ClassCastException Problemi!!!
        String str2 = (String) laptop.getCode();

        System.out.println(str);
        System.out.println(str2);

    }
}
