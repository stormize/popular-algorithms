import java.util.*;

public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
       List<Integer> sequence = new ArrayList<Integer>();
        int [] a = new int[n+1];
        for(int i =1; i< a.length; i++){
            a[i] = a[i-1]+1;
            if (i%2 == 0) {
                
            if(a[i] > 1+a[i/2])
                a[i]= 1+a[i/2];
}
            if (i%3 == 0) {
            if(a[i]>1+a[i/3])
                a[i]=1+a[i/3];
}

        }
        int i = n;
        while (i>1) {
            sequence.add(i);
            if (a[i-1] == a[i]-1)
                i = i-1;
            else if (i%2 == 0 && (a[i/2] == a[i]-1))
                i = i/2;
            else if (i%3 == 0 && (a[i/3] == a[i]-1))
                i = i/3;
        }
        sequence.add(1);
        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}

