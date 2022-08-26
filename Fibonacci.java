public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Printing a Fibonacci Series");
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<8;i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}