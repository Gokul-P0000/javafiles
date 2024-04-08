import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int g = sc.nextInt();
            a[i] = g;
        }
        System.out.println("Enter shift value: ");
        int d = sc.nextInt();
        int j,f;
        for(int i=0;i<d;i++){
             f = a[0];
            for(j=0;j<n-1;j++){
                a[j] = a[j+1];
            }
            a[j] = f;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
