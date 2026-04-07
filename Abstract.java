 abstract class Human {
    void eat() {
        System.out.println("Human is eating");
    }
    abstract void sing();
}

class Suri extends Human {
    void sing() {
        System.out.println("Suri is singing");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Human h = new Suri();
        h.eat();
        h.sing();
    }
}
