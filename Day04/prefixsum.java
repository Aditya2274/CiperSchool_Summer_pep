package Day04;

import java.util.Scanner;

public class prefixsum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int sum=0;
        while(t>0){
            int left=ob.nextInt();
            int right=ob.nextInt();
            for(int j=left;j<=right;j++){
            sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
