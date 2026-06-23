package Day02;

import java.util.ArrayList;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int h=ob.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<h;i++){
            arr.add(ob.nextInt());
        }
        int sum=0;
        for(int i=0;i<h;i++){
            sum+=arr.get(i);
        }
        int mean=sum/arr.size();
        System.out.println(mean);
        ob.close();
    }
}
