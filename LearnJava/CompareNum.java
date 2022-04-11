import java.util.*;
public class CompareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter two numbers (Separated by space): ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        if(a == b) {
            System.out.println(a+" and "+b+" are equal");
        } else {
            if(a>b) {
                System.out.println(a+" is greater than "+b);
            } else {
                System.out.println(b+" is greater than "+a);
            }
        }
    }
}
