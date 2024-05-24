package Com.Sohelshaikh;

public class SumOf_N_Numbers {
    public static void main(String[] args) {

        int sum = 0;
        int N = 100;

        for(int i = 1; i <= N; i++) {
           sum = sum + i;
        }
        System.out.println("The Sum of " + N + " Numbers is:" + sum );
    }
}

