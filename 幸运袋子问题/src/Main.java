import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);//顺序排列袋子
            System.out.println(find(arr,0,0,1));
        }
    }
    private static int find(int[] arr, int index, long sum, long mul) {
        int count=0;
        for(int i=index;i<arr.length;i++){
            sum+=arr[i];
            mul*=arr[i];
            if(sum>mul)
                count+=1+find(arr,i+1,sum,mul);
            else if(arr[i]==1)
                count+=find(arr,i+1,sum,mul);
            else
                break;
            sum-=arr[i];
            mul/=arr[i];
            while(i<arr.length-1&&arr[i]==arr[i+1])
                i++;
        }
        return count;
    }
    
}
