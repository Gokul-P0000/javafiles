import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter array1 Elements: ");
        for(int i=0;i<n1;i++){
            int g = sc.nextInt();
            a1[i] = g;
        }

        System.out.println("Enter array size2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter array2 Elements: ");
        for(int i=0;i<n2;i++){
            int g = sc.nextInt();
            a2[i] = g;
        }

        int[] tot = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                tot[k] = a1[i];
                i++;
            }
            else{
                tot[k] = a2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            tot[k] = a1[i];
            i++;
            k++;
        }
        while(j<n2){
            tot[k] = a2[j];
            j++;
            k++;
        }
        for(int i1=0;i1<k;i1++){
            System.out.print(tot[i1]+" ");
        }
        sc.close();

    }
}
