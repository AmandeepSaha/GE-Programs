import java.util.*;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number? ");
        int inp = sc.nextInt();
        int factorial;
        factorial = inp;
        int i = 1;
        while(inp!=1){
            inp = inp -i;
            factorial = factorial*(inp);
        }
        System.out.println("Factorial is "+factorial);
        sc.close();
    }
}