import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumberSpiral{
    public static void main(String[] args) throws IOException{
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        int t=Integer.parseInt(bufferedReader.readLine());
        long res,i;
        res=i=0;
        while(i<t){
            String[] input=bufferedReader.readLine().split(" ");
            long x=Long.parseLong(input[0]);
            long y=Long.parseLong(input[1]);
            if(x<y){if(y%2==0)res=((y-1)*(y-1)+1)+(x-1);else{res=(y*y)-(x-1);}}
            else{if(x%2==0)res=(x*x)-(y-1);else{res=((x-1)*(x-1)+1)+(y-1);}}
            i++;
            System.out.println(res);
        }
    }
}