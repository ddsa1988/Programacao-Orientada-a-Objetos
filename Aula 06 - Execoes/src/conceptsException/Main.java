package conceptsException;

public class Main {
    public static void main(String[] args){
        int [] numbers = {10,20,30};

        try{
            System.out.println(numbers[10]);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }finally {
            System.out.println("Everything went fine!");
        }
    }
}
