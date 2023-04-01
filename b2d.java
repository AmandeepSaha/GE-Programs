import java.util.Scanner;

public class b2d {
    // binary to decimal conversion
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number is: ");
        long number = sc.nextInt();
        long sum = 0;
        for(int i=0;number!=0;i++){
            if(number%2==1 | number%2==0){
                long pow = (long) Math.pow(2,i);
                sum = sum + (number%2)*pow;
                number = number/10;
            }
            else{
                System.out.println("provide binary number, contains only 0 & 1");
                break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
