import java.util.*;

public class DigToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        String s1 = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='0'){
                s1 = s1 + String.valueOf('1');
            }
            else{
                s1 = s1 + String.valueOf('0');
            }
        }
        System.out.println(s1);
        System.out.println(Integer.parseInt(s1,2));
        sc.close();

    }
    
}
