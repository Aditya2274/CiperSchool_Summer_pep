package Day02;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Q2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        @SuppressWarnings("unchecked")
        List<Integer>[] arr1=new ArrayList[6];
        for(int i=0;i<n;i++){
            int c=arr[i]/100;
            if(arr1[c]==null){
                arr1[c]=new ArrayList<>();
            }
            arr1[c].add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
             if (arr1[i] != null) {
                    System.out.println("Frequency " + i + " : " + arr1[i]);
                }
        }
    }
}
