import java.util.Scanner;
public class Repetitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c, res;
        c=res=1;
        for (int i=1;i<str.length();i++) {
            if (str.charAt(i)==str.charAt(i-1)) {
                c++;
            } else {
                c=1;
            }
            res = Math.max(c, res);
        }
        System.out.println(res);
        sc.close();
    }
}
