import java.util.*;

public class AliceAndBobFact {

    public static int fact(int n){
        if(n==1){
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The ways: "+fact(n));
        sc.close();
    }
}
