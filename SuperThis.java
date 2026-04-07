class Animal{
    String name;
    String sound;

    Animal(String name,String sound){
        this.name=name;         
        this.sound=sound;
    }

    void speak(){
        System.out.println(this.name+" says "+this.sound);
    }

    void info(){
        System.out.println("Animal name: "+this.name);
    }
}

class Dog extends Animal{
    String breed;

    Dog(String name,String sound,String breed){
        super(name,sound);      
        this.breed=breed;    
    }

    void info(){
        super.info();           
        System.out.println("Breed: "+this.breed);
    }

    void bark(){
        super.speak();         
        System.out.println(this.name+" is a "+this.breed+" dog");
    }
}

public class SuperThis{
    public static void main(String[] args){

        Dog d=new Dog("Tommy","Woof","Labrador");

        System.out.println(" speak() from Animal ");
        d.speak();

        System.out.println("bark() using super ");
        d.bark();

        System.out.println("info() using super");
        d.info();
    }
}