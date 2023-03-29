import java.util.Scanner;

public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int dublicate1 = n;         // to get length of number
        int dublicate2 = n;         // to check lastly
        int sum = 0;
        int i = 0;
        while(dublicate1>0){
            dublicate1 = dublicate1/10;
            i=i+1;
        }
        while(n>0){
            int r = n%10;
            int add = (int) Math.pow(r,i);
            sum = sum + add;
            n = n/10;
        }
        System.out.print(dublicate2 == sum);
        sc.close();
    }
}