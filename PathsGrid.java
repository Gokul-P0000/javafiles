import java.util.Scanner;

public class PathsGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int r = sc.nextInt();
        System.out.println("Enter coloumn size: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++){
            a[i][0] = 1;
        }
        for(int i=0;i<c;i++){
            a[0][i] = 1;
        }

        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j] = a[i][j-1]+a[i-1][j]; //before col + before row addition
            }
            System.out.println();
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
