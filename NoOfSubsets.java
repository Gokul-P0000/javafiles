import java.util.ArrayList;
import java.util.Scanner;

public class NoOfSubsets {

    public static void find(int a[], ArrayList<Integer> l, int k, int ind){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int g = sc.nextInt();
            a[i] = g;
        }
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        find(a,l,k,0);
        sc.close();
    }
}
