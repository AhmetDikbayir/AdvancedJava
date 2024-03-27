package generics.interfaces;

//1. SEÇENEK: Generic bir interface i implemente eden sınıf da generic olmalı
public class GenericInterfaceImpl <T> implements GenericInterface<T> {

    @Override
    public void print(T value) {

    }

    @Override
    public T find() {
        return null;
    }
}
