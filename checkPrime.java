public class checkPrime {
    public static void main(String[] args) {
        int n;
        boolean flag = true;

        for(int j=2;j<=100;j++){
            flag = true;
            n=j;
            for(int i=2;i<n;++i){
                if(n%i==0){
                    flag = false;
                }
            }
            if(flag == true){
                System.out.print(n+" ");
            }
        }
    }
}
