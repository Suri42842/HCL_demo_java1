import java.util.Scanner;

class Gym{
    String name;
    int age;
    String phone;
    boolean subscription;

    Gym(String name,int age,String phone,boolean subscription){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.subscription=subscription;
    }

    void access(String location){
        if(subscription){
            System.out.println("Welcome "+name+"!");
            System.out.println("You can access gym at "+location);
        }
        else{
            System.out.println("Sorry "+name+"!");
            System.out.println("Please buy subscription first");
        }
    }

    void facilities(){
        System.out.println("General Gym Facilities");
    }
}

class GymA extends Gym{
    GymA(String name,int age,String phone,boolean subscription){
        super(name,age,phone,subscription);
    }

    void facilities(){
        System.out.println("Gym A facilities: Treadmill, Weights");
    }
}

class GymB extends Gym{
    GymB(String name,int age,String phone,boolean subscription){
        super(name,age,phone,subscription);
    }

    void facilities(){
        System.out.println("Gym B facilities: Swimming, Yoga");
    }
}

public class Polymorphism{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Gym Subscription");
        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone=sc.nextLine();

        System.out.print("Do you have subscription? (yes/no): ");
        String sub=sc.nextLine();

        boolean subscription = sub.equalsIgnoreCase("yes");

        System.out.println("\nChoose Gym:");
        System.out.println("1. Gym A - Chennai");
        System.out.println("2. Gym B - Bangalore");
        System.out.print("Enter choice: ");
        int choice=sc.nextInt();

        Gym g;

        if(choice==1){
            g = new GymA(name,age,phone,subscription);
            g.access("Chennai");
        }
        else if(choice==2){
            g = new GymB(name,age,phone,subscription);
            g.access("Bangalore");
        }
        else{
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        g.facilities();

        sc.close();
    }
}