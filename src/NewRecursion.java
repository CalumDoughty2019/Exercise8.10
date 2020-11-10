import java.lang.reflect.Array;
import java.util.Arrays;

public class NewRecursion {

    public static int[] add(int n, int arr[], int target) {
        int i;

        int tempArr[] = new int[n + 1];

        for (i = 0; i < n; i++) {
            tempArr[i] = arr[i];
        }

        tempArr[n] = target;
        return tempArr;

    }

//// ALL TENS CORRECT
    public void arraySortUtil(int[] arrA, int[] arrB, int[] arrC, boolean flag, int indexA, int indexB) {

        int k = arrC.length;

        if (flag) {
            if(k == 0){
                arrC = add(arrC.length, arrC, arrA[indexA]);
                //flag = false;
                arraySortUtil(arrA, arrB, arrC, false, indexA+1, indexB);
            }
            else if (arrA[indexA] > arrC[k-1]){
                arrC = add(arrC.length, arrC, arrA[indexA]);
                arraySortUtil(arrA, arrB, arrC, false, indexA+1, indexB);
            }
            arraySortUtil(arrA, arrB, arrC, true, indexA+1, indexB);
        }
        else{
            if(arrB[indexB] > arrC[k-1]){
                arrC = add(arrC.length, arrC, arrB[indexB]);
                System.out.println(Arrays.toString(arrC));
                if((indexB >= arrB.length-1)){
                    if((indexB >= arrB.length-1) && (indexA == 1)){
                        int[] updatedA = Arrays.copyOfRange(arrA, 1, arrA.length);
                        int[] arrTemp = {};
                        indexA = 0;
                        indexB = 0;
                        if(updatedA.length == 0){
                            //return 0;
                            System.exit(0);
                        }
                        arraySortUtil(updatedA, arrB, arrTemp, true, indexA, indexB);
                    }
                    indexA = 0;
                    int[] arrTemp = {};
                    arraySortUtil(arrA, arrB, arrTemp, true, indexA, indexB);
                }
                arraySortUtil(arrA, arrB, arrC, true, indexA, indexB);
            }
            else{
                arraySortUtil(arrA, arrB, arrC, false, indexA, indexB+1);
            }
        }
        //return 0;
    }



//    void arraySortUtil(int[] arrA, int[] arrB, int[] arrC, boolean flag, int indexA, int indexB, int place) {
//
//        int k = arrC.length;
//
//        if (flag) {
//            for(place = indexA; place < arrA.length; place++){
//                if(k == 0){
//                    arrC = add(arrC.length, arrC, arrA[indexA]);
//                    //flag = false;
//                    arraySortUtil(arrA, arrB, arrC, false, indexA+1, indexB, place);
//                }
//                else if (arrA[indexA] > arrC[k-1]){
//                    arrC = add(arrC.length, arrC, arrA[indexA]);
//                    arraySortUtil(arrA, arrB, arrC, false, indexA+1, indexB, place);
//                }
//                arraySortUtil(arrA, arrB, arrC, true, indexA+1, indexB, place);
//            }
//        }
//        else{
//            for(int holdB = indexB; holdB < arrB.length; holdB++){
//                if(arrB[indexB] > arrC[k-1]){
//                    arrC = add(arrC.length, arrC, arrB[indexB]);
//                    System.out.println(Arrays.toString(arrC));
//                    if((indexB >= arrB.length-1)){
//                        //indexA = 0;
//                        int[] arrTemp = {};
//                        place++;
//                        arraySortUtil(arrA, arrB, arrTemp, true, indexA, indexB, place);
//                    }
//                    arraySortUtil(arrA, arrB, arrC, true, indexA, indexB, place);
//                }
//                else{
//                    arraySortUtil(arrA, arrB, arrC, false, indexA, indexB+1, place);
//                }
//            }
//        }
//    }


    //WRAPPER METHOD
    public void arraySort(int[] A, int[] B){
        int[] C = {};
        boolean flag = true;
        int indexA = 0;
        int indexB = 0;

        arraySortUtil(A, B, C, flag, indexA, indexB);
    }



    void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            //System.out.println("");
        }
    }
}
