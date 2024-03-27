package generics.bounding;

//Generic yapılarda parametre olarak alınan data tipini üstten sınırlandırabiliriz
//T: sadece Number classının alt sınıfları ile sınırlandıralım
//T: BYTE, SHORT, INTEGER, DOUBLE, LONG, FLOAT, NUMBER
public class GenericUpperBound<T extends Number> {
    public T[] numberArray;

    //numberArray içindeki elemanların ortalamasını hesaplayan method
    public Double getAverage(){
        double sum=0;
        for(T t : this.numberArray){
            sum+=t.doubleValue();
        }
        double avg = sum/this.numberArray.length;

        return avg;
    }

    public static void main(String[] args) {
        Integer[] integers = {2,3,6,9,8,7};
        Double[] doubles = {0.3, 99.3, 10.0,2.3};
        String[] strings = {"generics", "üstten", "sınırlandırılabilir"};
        GenericUpperBound<Integer> obj1 = new GenericUpperBound<>();
        obj1.numberArray = integers;

        System.out.println(obj1.getAverage());

        GenericUpperBound<Double> obj2 = new GenericUpperBound<>();
        obj2.numberArray = doubles;

        System.out.println(obj2.getAverage());

        //   GenericUpperBound<String> obj3=new GenericUpperBound<>();//T:String
    }
}
