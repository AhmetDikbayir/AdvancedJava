package generics.bounding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//wildcard(?): joker, bilinmeyen data tipi
public class GenericWithWildCard {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();


        System.out.println("-------------alttan sınırlama--------------------");
        addElement(integers);
        System.out.println("integers = " +integers);
        //addElement(doubles);
        //addElement(strings);
        addElement(numbers);
        System.out.println("numbers = " + numbers);
        addElement(objects);
        System.out.println("objects = " + objects);

        System.out.println("-------------üstten sınırlama--------------------");
        multiplyByTwo(integers);
        multiplyByTwo(doubles);
        //multiplyByTwo(strings);
        multiplyByTwo(numbers);
        //multiplyByTwo(objects);

        System.out.println("-------------sadece wildcard--------------------");
        System.out.println(integers);


    }

    //alttan sınırlayan
    //listeye 1 den 10' a kadar integer elemanları ekleyen bir metod
    //list: Integer, Number,Object
    public static void addElement(List<? super Integer> list) {
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }

    }

    //generic yapıyı kullanırken üstten sınırlama
    //listedeki elemanları 2 ile çarpan bir method
    public static void multiplyByTwo(List<? extends Number> list){
        list.stream().map(t->2*t.doubleValue());

    }

    //?: bilinmeyen data tipi
    //wildcard: read-only
    //yani sadece data tipinden bağımsız işlemler yapılabilir
    //örn: remove,size,...
    public static void printElement(List<?> list){//List<T> generic yapısına benzer

        //list.add(2);//HATA verir çünkü data tipi bilimediği için hata verir.
        list.remove(2);

        for(Object obj : list){
            System.out.println(obj + " ");
        }
    }
    //!!! NOT: List<T> ve List<?> benzer, fakat tamamen aynı değildir.

    public static <T> void addElementsToList(List<T> list, T element){

        list.add(element);
    }

    //CTE verir çünkü listenin eleman türü ile eklenecek eleman aynı tür mü bilinemez.
//    public static void addElementsToList(List<?> list, ? element){
//
//        list.add(element);
//    }
}
