public class turnary {
    public static void main(String[] args) {
        int x = 3;
        int y = 13;
        int z = 30;
        System.out.println(x == y & y == z ? "Three numbers are equal"
                : x > y & x > z ? x + " is grater" : y > z ? y + " is grater" : z + " is grater");
    }
}