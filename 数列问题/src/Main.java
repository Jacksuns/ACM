import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int k=in.nextInt();
            a=new int[n];
            ma=new boolean[n+1];
            vis=new boolean[n+1];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
                vis[a[i]]=true;
            }
            count=0;
            dfs(0,n,k,0);//深度遍历
            System.out.println(count);
        }
    }
    static int a[]=null;
    static boolean vis[]=null;
    static boolean ma[]=null;
    static int count=0;
    static void dfs(int p,int n,int k,int curk){
        if(p==n-1){
            if(curk==k){
                count++;
            }
            return;
        }
        if(a[p]!=0){
            int sum=0;
            for(int i=a[p]+1;i<=n;i++){
                if(!ma[i]){
                    sum++;
                }
            }
            if(curk+sum<=k){
                ma[a[p]]=true;
                dfs(p+1,n,k,curk+sum);
                ma[a[p]]=false;
            }
        }
        else{
            for(int i=1;i<=n;i++){
                if(ma[i]||vis[i]) continue;
                int sum=0;
                for(int j=i+1;j<=n;j++){
                    if(!ma[j]){
                        sum++;
                    }
                }
                if(curk+sum<=k){
                    ma[i]=true;
                    dfs(p+1,n,k,curk+sum);
                    ma[i]=false;
                }
            }
        }
    }
}
