import java.util.*;
public class Covid_19 {

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
        System.out.println(fact(n)/(fact(n-2) * 2));  // another formula n*(n-1)/2 (without function)
        sc.close();
        
    }
}
