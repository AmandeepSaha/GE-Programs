import java.util.Scanner;

public class d2b {
    // decimal to binary conversion
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number is: ");
        long number = sc.nextInt();
        long sum = 0;
        for(int i=0;number!=0;i++){
            long pow = (long) Math.pow(10,i);
            sum = sum + (number%2)*pow;
            number = number/2;
        }
        System.out.println(sum);
        sc.close();
    }
}
