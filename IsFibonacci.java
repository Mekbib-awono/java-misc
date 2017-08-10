public class IsFibonacci {
    public static void main(String args[]) {
        int n = 196418;
        System.out.println("Is " + n + " a FIBONACCI -----  " + isFibonacci(n));
    }

    private static int isFibonacci (int a) {
        int x = 0;
        int y = 1;

        int n = 1;

        for(int i = 0; i < a; i++) {
            System.out.println("i: " + i + "  : " + n);
            n = x + y;

            x = y;
            y = n;

            if (n == a ) {
               return 1;
            }

            if (n > a ) {
               return 0;
            }
        }

        return 0;
    }
}