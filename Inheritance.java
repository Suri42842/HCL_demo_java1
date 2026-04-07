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
        if(subscription==true){
            System.out.println("Welcome "+name+"!");
            System.out.println("You can access gym at "+location);
        }
        else{
            System.out.println("Sorry "+name+"!");
            System.out.println("Please buy subscription first");
        }
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

public class Inheritance{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("=== Gym Subscription ===");
        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone=sc.nextLine();

        System.out.print("Do you have subscription? (yes/no): ");
        String sub=sc.nextLine();

        boolean subscription=false;
        if(sub.equals("yes")){
            subscription=true;
        }

        System.out.println("\nChoose Gym:");
        System.out.println("1. Gym A - Chennai");
        System.out.println("2. Gym B - Bangalore");
        System.out.print("Enter choice: ");
        int choice=sc.nextInt();

        System.out.println("\n--- User Info ---");
        System.out.println("Name    : "+name);
        System.out.println("Age     : "+age);
        System.out.println("Phone   : "+phone);
        System.out.println("Sub     : "+sub);
        System.out.println("-----------------");

        if(choice==1){
            GymA g1=new GymA(name,age,phone,subscription);
            g1.access("Chennai");
            g1.facilities();
        }
        else if(choice==2){
            GymB g2=new GymB(name,age,phone,subscription);
            g2.access("Bangalore");
            g2.facilities();
        }
        else{
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}