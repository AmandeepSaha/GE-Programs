import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        System.out.println("Number? "+input);
        int factorial;
        factorial = input;
        int i = 1;
        while(input!=0){
            factorial = factorial*input-i;
            i++;
        }
        System.out.println("Factorial is "+factorial);

    }
}
