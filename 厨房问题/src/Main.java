import java.util.Scanner;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        HashSet<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while(str!=null){
            String[] arr = str.trim().split(" ");
            for(String s:arr){
                set.add(s);
            }
            str = br.readLine();
        }
        System.out.println(set.size());
        
    }
}
