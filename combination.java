import java.util.*;

public class combination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate nCr");
        System.out.print("n: ");
        long n = sc.nextInt();
        System.out.print("r: ");
        long r = sc.nextInt();
        long a = n-r;
        long n_mul = 1;
        long r_mul = 1;
        long a_mul = 1;
        if(a>0){
            for(int i=1;i!=n+1;i++){
                n_mul = n_mul*i;
            }
            for(int i=1;i!=r+1;i++){
                r_mul = r_mul*i;
            }
            for(int i=1;i!=a+1;i++){
                a_mul = a_mul*i;
            }
            long comb = n_mul/(r_mul*a_mul);
            System.out.print("nCr is: "+comb);
        }
        else{
            System.out.println("Your datas are not valid for combination");
        }
        sc.close();
    }
}
