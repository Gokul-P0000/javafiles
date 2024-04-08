import java.util.Scanner;

public class CountSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cs=0, ch=0;
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                cs+=1;
            }
            else{
                ch+=1;
            }
        }
        System.out.println(cs-ch);
        sc.close();
    }
    
}
