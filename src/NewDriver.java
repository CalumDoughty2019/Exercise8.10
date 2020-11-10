public class NewDriver {
    public static void main(String[] args){
        NewRecursion newRecursion = new NewRecursion();
        int[] A = {10, 15, 25};
        int[] B = {1, 5, 20, 30};
        int[] C = {};

        //newRecursion.arraySortUtil(A, B, C, true, 0, 0, -1);
        newRecursion.arraySortUtil(A, B, C, true, 0, 0);

    }
}
