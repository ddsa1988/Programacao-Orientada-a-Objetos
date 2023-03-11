package conceptsSingleton;
public class Singleton {
    public int number;
    private static Singleton instance = null;

    private Singleton(){
        number = 20;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
