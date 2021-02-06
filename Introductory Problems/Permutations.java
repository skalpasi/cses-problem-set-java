import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n!=1 && n>3) {for (int i=0; i<n/2; i++) System.out.print(2*(i+1)+" ");for (int j=0; j<=n/2; j++) System.out.print(2*j+1+" ");}
        else if (n==1) System.out.println("1");
        else System.out.println("NO SOLUTION");
        sc.close();
    }
}