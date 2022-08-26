import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        char c;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            
            for(int i=2;i<n;++i){
                if(n%i==0){
                    flag = false;
                }
            }
            if(flag == true) {
                System.out.println(n+" is a prime number.");
            } else {
                System.out.println(n+" is not a prime number.");
            }
            System.out.print("Do you want to check another number? (Y/N): ");
            c = sc.next().charAt(0);
        } while(c == 'Y' || c == 'y');
        sc.close();
    }
}
