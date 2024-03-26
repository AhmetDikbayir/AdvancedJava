package generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArr={2,3,8,99,55};
        Double[] doubleArr={1.3,35.6,99.9,0.5};
        String[] stringArr={"Java","generics","hayatımızı","kolaylaştırır"};

        System.out.println("---printArray metodu ile yazdırma");
        printArray(intArr);
        printArray(doubleArr);
        printArray(stringArr);
    }

    //arrayleri yazdırmak için metod tanımlayalım
    //farklı parametreler için : overload
//    public static void printArray(Integer[] arr){
//        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
//        System.out.println();
//    }

//    public static void printArray(Double[] arr){
//        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
//        System.out.println();
//    }

    //keşke generic bir metodumuz olsa
    public static <T> void printArray(T[] arr){
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    //keşke generic metodumuz geriye generic bir data tipi döndürse
    //NOT : geriye dönüş data tipi T olmak zorunda değil
    public static <T> T getFirst(T[] arr){
        T first = arr[0];
        return first;
    }
}
