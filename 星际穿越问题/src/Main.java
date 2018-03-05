import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        long n;
        long i;
        while((str=bf.readLine())!=null){
            n=Long.parseLong(str);
            i=(long)Math.sqrt(n);
            if(i*(i+1)<=n){
                System.out.println(i);
            }else{
                System.out.println(i-1);
            }
        }
        
    }
    
}
