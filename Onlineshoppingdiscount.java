import java.util.*;
public class Onlineshoppingdiscount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if(a>5000){
            a=a-((a/100)*20);
        }
        if(a<2000){
            a=a-((a/100)*10);
        }
        System.out.println(a);
    }
}