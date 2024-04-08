import java.util.*;
public class RemoveVowel {

    public static boolean isVowel(char c){
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!isVowel(c)){
                s1 += String.valueOf(c);
            }
        }
        System.out.println(s1);
        sc.close();
    }
}
