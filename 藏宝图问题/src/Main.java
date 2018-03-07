import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        char[] brr = s2.toCharArray();
        String result = "Yes";
        for (int i = 0; i < brr.length; i++) {
            int m = s1.indexOf(brr[i]);
            if (m != -1) {
                s1 = s1.substring(m + 1);
                continue;
            }
            result = "No";
        }
        System.out.println(result);
    }
}
