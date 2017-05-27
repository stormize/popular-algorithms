import java.util.*;

public class DifferentSummands {
 private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        //write your code here
     for(int i =1; i<=n; i++){
         if(n>=i){
             summands.add(i);
             n=n-i;
         }
     }
       if(n !=0 ){
        
     summands.add(n+summands.get(summands.size()-1));
     summands.remove(summands.size()-2);
     
     }
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }}

