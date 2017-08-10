/*
    An array is said to be hollow if it contains 3 or more
    zeros in the middle that are preceded and followed by the same number
    of non-zero elements. Write a function named isHollow that accepts an
    integer array and returns 1 if it is a hollow array, otherwise it returns 0.
*/
public class IsHollow {
    public static void main(String args[]) {
        System.out.println("Is Hollow -----     " + isHollow(new int[]{1,0,0,0,0,1}));
    }

    private static int isHollow (int[] a) {
        int start = -1;
        int end = 0;

        // find the start and end indices of the zeros
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                if (start < 0) {
                    start = i;
                }

                end = i;
            }
        }

        // all the numbers between start and end are zeros
        for (int i = start; i < end; i++) {
            if (a[i] != 0) {
                return 0;
            }
        }

        // > 3 zeros
        if ( end - start < 2 ) {
            return 0;
        }

        // equal numbers before and after zero
        if ( start == (a.length - (end )-1) ) {
            return 1;
        }

        return 0;
    }
}