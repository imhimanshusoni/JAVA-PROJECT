import java.util.*;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, area;
        System.out.print("Enter the radius: ");
        r = sc.nextInt();
        sc.close();
        area = r * r * 3.14159;
        System.out.println(area);
    }
}
