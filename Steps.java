import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n==1){
            System.out.println(n);
        }
        else if(n==2){
            System.out.println(n);
        }
        else{
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 2;
            for (int i=2;i<n;i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
            System.out.println(arr[n-1]); 
        }
        sc.close();
         
    }
}
