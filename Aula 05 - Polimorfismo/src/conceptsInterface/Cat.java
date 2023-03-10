package conceptsInterface;

public class Cat implements Animal, Activity {
    @Override
    public void makeSound() {
        System.out.println("Making sound...");
    }

    @Override
    public void sleep() {
        System.out.println("zzz...");
    }

    @Override
    public void run() {
        System.out.println("running...");
    }

    @Override
    public void jump() {
        System.out.println("Jumping...");
    }
}
