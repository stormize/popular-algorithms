import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
       
        int n = numbers.length;
        
      int firstindex = -1;
     
      for(int i =0 ; i<n ; i++){
         
          if(firstindex==-1 ||(numbers[i] > numbers[firstindex])){
              firstindex=i;
          }
      }
      int secondindex=-1;
      for(int j =0 ; j<n ; j++){
          
        if( (j!=firstindex )&& (secondindex==-1 || numbers[j]>numbers[secondindex])){
            secondindex =j;
        }
    }
     
      return (long)numbers[firstindex]*numbers[secondindex];  
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
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