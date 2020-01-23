/**
 * This program check the array on sorting.
 *
 * Created by Nriker - Alexander Buyanov
 */

public class cw_circleSorted {
    public static void main(String[] args) {
        /**
         * Program entry point.
         * @param arr is changed in this method.
         */
        circleSorted check = new circleSorted();
        int[] arr = {1, 2, 3, 4, 1, 1};
        System.out.println(check.isCircleSorted(arr));
    }
}