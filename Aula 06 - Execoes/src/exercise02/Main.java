package exercise02;

public class Main {

    public static int[] arrayInstance(int length){
        return new int[length];
    }

    public static void main(String[] args){

        try {
            int arr[] = arrayInstance(-5);

            for (int i = 0; i< arr.length; i++){
                arr[i] = i + 10;
            }

            for (int value:arr) {
                System.out.println(value);
            }
        }catch (Exception error){
            System.out.println(error);
        }
    }
}
