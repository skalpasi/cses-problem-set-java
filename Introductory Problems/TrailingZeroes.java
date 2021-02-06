import java.util.Scanner;
public class TrailingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        // 20! = 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 = 2432902008176640000 ; Zeroes=4 
        int i=5;
        while (Math.floor(n/i)>0) {
            c+=Math.floor(n/i);
            i*=5;
        }
        System.out.println(c);
        sc.close();
    }
}
