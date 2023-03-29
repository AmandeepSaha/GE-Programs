import java.util.*;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int duplicate1 = n;     // to find lenght, used in 1st while loop
        int duplicate2 = n;     // to execute reversed, used in 2nd while loop
        int j = 0;                     
        int sum = 0;
        while(duplicate1>0){
            duplicate1 = duplicate1/10;
            j=j+1;
        }
        while(j>0){
            j = j-1;
            int r = duplicate2%10;
            int dsk = (int) Math.pow(10, j);
            sum = sum + r*dsk;
            duplicate2 = duplicate2/10;
        }
        System.out.print("Reversed number of "+ n +" is "+ sum);
        sc.close();
    }
}
