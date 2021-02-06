import java.util.Scanner;
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n-1];
        int arr2[] = new int[n];
        for (int i=0; i<n-1; i++) {
            arr1[i] = sc.nextInt();
        }
        int j=0;
        while (j<n) {
            arr2[j]=j+1;
            j++;
        }
        Arrays.sort(arr1);
        for (int k=0; k<arr1.length; k++) {
            if (arr1[k]!=arr2[(int) k]) {
                System.out.println(arr2[k]);
                break;
            } else if (k==arr1.length-1) {
                System.out.println(n);
            }
        }
        sc.close();
    }
}
