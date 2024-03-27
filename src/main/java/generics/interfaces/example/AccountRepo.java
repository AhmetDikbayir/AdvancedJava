package generics.interfaces.example;

public class AccountRepo implements Repo<Account>{
    @Override
    public void save(Account obj) {

    }

    @Override
    public Account find() {
        return null;
    }
}
