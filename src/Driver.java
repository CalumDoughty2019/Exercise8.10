public class Driver {
    static int[] A = {10, 15, 25};
    static int[] B = {1, 5, 20, 30};
    static int[] C = {};


    ///////************************************ THIS ONE DOESNT WORK. ITS MADNESS
    public static void main(String[] args){
        ArraySortRecursion arraySortRecursion = new ArraySortRecursion();

        long start = System.nanoTime();
        //System.out.println("Value is at index " + arraySortRecursion.sortSortedArrays(A, B));
        arraySortRecursion.sortSortedArrays(A, B, C, true, 0, 0, 0);
        //arraySortRecursion.sortSortedArrays(A, B,true);
        //System.out.println("Recursive Binary Search took = " + (System.nanoTime() - start) + " ns");
    }
}
