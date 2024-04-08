import java.util.*;

public class RepeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int g = sc.nextInt();
            a[i] = g;
        }
        Arrays.sort(a);
        int temp = a[n-1];
        for(int i=1;i<n;i++){
            if(a[i] == a[i+1]){
                if(temp != a[i]){
                    System.out.print(a[i]+" ");
                }
                temp = a[i-1];
            }

        }
        sc.close();
        
    }
}
