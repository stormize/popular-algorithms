import java.util.*;

class EditDistance {
  public static int min(int x, int y,int z){
        if(x<y&&x<z)
        return x;
        if(y<x&&y<z)
        return y;
        else
    return z;
    }
        public static int EditDistance(String s, String t,int x,int y) {
    //write your code here
           int dy[][]= new int[x+1][y+1];
           for(int i =0 ; i<=x;i++)
            dy[i][0] = i;
          for(int j=0;j<=y;j++)
            dy[0][j] = j;
           for(int i =1;i<=x;i++){
               for(int j =1; j<=y;j++){
                   
                   
                    if(s.charAt(i-1)==t.charAt(j-1))
                       dy[i][j]=dy[i-1][j-1];
               
               else 
                    dy[i][j]=1+min(dy[i][j-1],dy[i-1][j],dy[i-1][j-1]);
           }}
           
    return dy[x][y];
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t,s.length(),t.length()));
  }

}
