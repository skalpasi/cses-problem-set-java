import java.util.Scanner;
public class MissingNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s1=0, s2=0;
        for (int j=1; j<n; j++) {
            int x=sc.nextInt();
            s1+=x;
        }
        for (int i=1; i<=n; i++) {
            s2+=i;
        }
        System.out.print(s2-s1);
        sc.close();
    }
}
