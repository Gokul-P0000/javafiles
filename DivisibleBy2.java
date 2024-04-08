import java.util.Scanner;

public class DivisibleBy2 {
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
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int count = 0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int g = sc.nextInt();
            a[i] = g;
            if(a[i]%2==0){
                count++;
            }
        }
        System.out.println(fact(n-1)*count);    // (n-1)!*count of even numbers
        sc.close();
    }
}
