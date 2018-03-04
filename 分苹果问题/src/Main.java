import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = br.readLine()) != null){
            int n = Integer.parseInt(line);
            int[] a = new int[n];
            line = br.readLine();
            String[] s = line.trim().split(" ");
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(s[i]);
            }
            int sum = 0;
            for(int i=0;i<n;i++){
                sum += a[i];
            }
            if(sum % n !=0){
                System.out.println(-1);
                return ;
            }
            int avg = sum / n;
            for(int i=0;i<n;i++){
                if(Math.abs(a[i]-avg) % 2 !=0){
                    System.out.println(-1);
                    return ;
                }
            }
            int count = 0;
            for(int i=0;i<n;i++){
                if(a[i] < avg){
                    count += (avg-a[i]) / 2;
                }
            }
            System.out.println(count);
        }
    }
    
}
