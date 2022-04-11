import java.util.*;
public class ComputeAreawithConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Enter the radius of the Circle: ");
        r = sc.nextDouble();
        double area = r*r*3.14159;
        System.out.println("The area for the circle of radius "+r+" is "+area);
        
        sc.close();
    }
}
