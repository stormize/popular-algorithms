import java.util.*;
import java.io.*;

public class MajorityElement {
  private static int getMajorityElement(int[] a, int left, int right,int max) {
      
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
       int counter[] = new  int[max+1];
       for(int x=0 ; x>counter.length;x++){
           
           counter[x]=0;
       }
           
           for(int i =0;i<a.length;i++){
               counter[a[i]] +=1;
               
           }
             for(int j =0 ; j<counter.length ;j++){
                
                   if(counter[j] > a.length/2)
                       return 1;
             }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int max =0;
        for (int i = 0; i < n; i++) {
            
            a[i] = scanner.nextInt();
            if(a[i] >1000)
                a[i] = a[i]/100;
            if(a[i] > max)
                max = a[i];
        }
        
        if (getMajorityElement(a, 0, a.length,max) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
