package conceptsReferenceTypeEquality;

public class Main {
    public static void main(String[] args){
        String s1 = new String("msg");
        String s2 = new String("msg");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
