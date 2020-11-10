public class NewDriver {
    public static void main(String[] args){
        NewRecursion newRecursion = new NewRecursion();
        int[] A = {10, 15, 25};
        int[] B = {1, 5, 20, 30};
        int[] C = {};

        //newRecursion.arraySortUtil(A, B, C, true, 0, 0, -1);
        //newRecursion.arraySortUtil(A, B, C, true, 0, 0);
        newRecursion.arraySort(A, B);


//        int[] A = {2, 25, 46, 47, 47, 55, 69/*nice*/, 75};
//        int[] B = {1, 7, 26, 30, 47, 59, 63, 89};
//        int[] C = {};
//
//        //newRecursion.arraySortUtil(A, B, C, true, 0, 0, -1);
//        newRecursion.arraySortUtil(A, B, C, true, 0, 0);

    }
}
