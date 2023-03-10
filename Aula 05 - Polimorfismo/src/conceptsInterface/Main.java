package conceptsInterface;

public class Main {
    public static void main(String[] args){
        Cat myCat = new Cat();
        Animal yourCat = new Cat();

        myCat.makeSound();
        myCat.jump();

        yourCat.makeSound();
    }
}
