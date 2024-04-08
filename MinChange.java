import java.util.*;
public class MinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int g = sc.nextInt();
            a[i] = g;
        }
        for(int i=0;i<n;i++){
            if(a[i]<0){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    a[j] = a[j] + 1;
                }
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                continue;
            }
            else{
                sum+=a[i];
            }
        }
        System.out.println(sum);
        sc.close();

    }
}
