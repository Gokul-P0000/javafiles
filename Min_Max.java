import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int g = sc.nextInt();
            a[i] = g;
        }
        int min = a[0];
        int max = a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(min+" "+max);
        sc.close();
    }
}
