import java.util.*;
public class Oddoreven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.err.println(checkoddoreven(num));

    }
    static String checkoddoreven(int n){
        if(n/2==0){
            return "even" ;
        }else{
            return "odd";
        }

    }
}