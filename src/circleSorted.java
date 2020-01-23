/**
 * This class contain the method (public boolean isCircleSorted(int[] a)) that check the array on sorting.
 */

public class circleSorted {
    public boolean isCircleSorted(int[] a) {
        int numTran = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] > a[(i+1) % a.length]) numTran++;
        }
        return numTran <= 1;
    }
}
