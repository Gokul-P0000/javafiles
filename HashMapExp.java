import java.util.*;

public class HashMapExp {
    public static void main(String[] args) {
        HashMap <Integer, Integer> h = new HashMap <Integer,Integer> ();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int g = sc.nextInt();
            if(!h.containsKey(g)){
                h.put(g,1);
            }
            else{
                h.put(g,h.get(g) + 1);
            }
        }
        for(int hash: h.keySet()){
            if(h.get(hash)>1){
                System.out.print(h.get(hash)+" ");
            }
        }sc.close();
    }
}
