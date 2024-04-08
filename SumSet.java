import java.util.Arrays;
import java.util.Scanner;

public class SumSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int g = sc.nextInt();
            a[i] = g;
        }
        System.out.println("Enter K value: ");
        int k = sc.nextInt();
        int count = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(a[i]+a[j] == k){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
        int i=0,j=n-1;
        Arrays.sort(a);
        while(i<j){
            if(a[i]+a[j] == k){
                count++;
                i++;
                j--;
            }
            else if(a[i]+a[j] < k){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
