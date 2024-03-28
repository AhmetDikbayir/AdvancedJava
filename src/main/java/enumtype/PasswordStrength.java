package enumtype;

public enum PasswordStrength {

    FAIL(0),//0
    LOW(10),//0 --> 1
    MEDIUM(50),//1 --> 2
    HIGH(100);//2 --> 3

    private final int level;

    private PasswordStrength(int level){
        this.level = level;
    }//default : private

    public int getLEvel(){
        return this.level;
    }
}
