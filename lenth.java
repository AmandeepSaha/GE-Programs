import java.util.Scanner;

public class lenth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int len = 0;
        while(n>0){
            n=n/10;
            len=len+1;
        }
        System.out.println("Number of digit/digits: "+len);
        sc.close();
    }
}
