package conceptsSingleton;

public class Main {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1.number);
        System.out.println(s2.number);
        System.out.println();

        s1.number = 30;
        System.out.println(s1.number);
        System.out.println(s2.number);
        System.out.println();

        s2.number = 100;
        System.out.println(s1.number);
        System.out.println(s2.number);
        System.out.println();

    }
}
