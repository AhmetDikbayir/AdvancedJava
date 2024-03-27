package generics.interfaces.example;

//Uygulamadaki tüm repolar için standart oluşturuyorum
public interface Repo <T>{

    void save(T obj);

    T find();
}
