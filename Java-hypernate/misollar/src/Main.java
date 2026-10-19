/*
public class Main {
    public static void main(String[] args){
        int n = 10;
        long sum = 0;

        for(int i = 1; i <= n; i++){
            long num = 0;
            for (int j = 1; j<=i; j++ ){
               num = num * 10 + i;

            }
            System.out.print(num);
            sum += num;
            if(i != n){
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + sum);
    }
}*/


/*
public class Main {
    public static void main(String[] args){

        int n = 7;
        int x = 2;
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            int pow = 1;
            for (int j = 1; j <= i; j++) {
                pow *= x;
            }
            sum += pow;
        }
        System.out.print(sum);

    }
}*/

/*public class Main {
    public static void main(String[] args){

        int n = 15;
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

public class Main {
    public static void main(String[] args){

        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if(j < (n - i) - 1)  {
                    System.out.print(' ');
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
