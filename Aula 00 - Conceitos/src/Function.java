public class Function {

    public static float sum(float a, float b){
        return a + b;
    }

    public static float sum(float a, float b, float c){
        return a + b + c;
    }

    public static void main(String args[]){
        System.out.println(sum(2f,10.5f));
        System.out.println(sum(2f,10.5f,20.2f));

    }
}
