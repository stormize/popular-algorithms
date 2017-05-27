import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
      int counter=0;
    	if(m >=10){
           counter=(m-(m%10))/10;
           m=m%10;
        }
        if (m>=5){
            counter+=(m-(m%5))/5;
            m=m%5;
        }
        if(m>=1){
           while (m >=1){
               m=m-1;
               counter ++;
           }
        }
        
        return counter;
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

