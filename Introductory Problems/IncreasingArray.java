import java.util.Scanner;
public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        long c=0;
        for (int j=0; j<arr.length; j++) {
            long x=sc.nextInt();
            arr[j]=x;
        }
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                long k=arr[i]-arr[i+1];
                arr[i+1]+=k;
                c+=k;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
