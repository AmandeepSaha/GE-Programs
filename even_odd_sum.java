import java.util.Scanner;

public class even_odd_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int duplicate = n;
        int odd_sum = 0;
        int even_sum = 0;
        while(duplicate>0){
            int r =duplicate%10;
            if(r%2==0){
                even_sum = even_sum +r;
            }
            else{
                odd_sum = odd_sum + r;
            }
            duplicate = duplicate/10;
        }
        System.out.println("Sum of odd and even numbers are respectively "+ odd_sum + " and " + even_sum);
        sc.close();
    }
}
