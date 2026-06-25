package Day03;
import java.util.Scanner;
import java.lang.Math;
public class Kriya {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int N=ob.nextInt();
        int M=ob.nextInt();
        int sum=0;
        if(N%2==0){
            sum=(N/2)*((N/2)+1);
        }
        else{
            sum=(int) Math.pow(((N+1)/2),2) -1;
        }
        System.out.println(sum*M);
    }
}