package Day01;
import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int run1=ob.nextInt();
        int run2=ob.nextInt();
        int track=ob.nextInt();int c=0;
        do{
             System.out.println("run1 = " + run1 + ", run2 = " + run2);
            run1=(run1+1)%track;
            run2=(run2+2)%track;
            c++;
        }while(run2!=run1);
            System.out.println("they met at position "+run1+" after time "+c+" seconds");
    }
}
