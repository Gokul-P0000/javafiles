import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String rs = "";
        // for(int i=s.length()-1;i>=0;i--){
        //     rs+=s.charAt(i);
        // }
        // if(s.equalsIgnoreCase(rs)){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }

        int i = 0,j = s.length()-1;
        int flag = 0;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();


    }
}
