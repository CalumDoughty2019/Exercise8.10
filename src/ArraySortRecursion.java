import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Arrays;



///////************************************ THIS ONE DOESNT WORK. ITS MADNESS
public class ArraySortRecursion {

//    public void sortSortedArrays(int[] arrA, int[] arrB, boolean flag){
//        int i = 0;
//        for(int a : arrA){
//            int[] arrC = {};
//            arrC = add(arrC.length, arrC, a);
//            for(int b : arrB){
//                if((b > a) && (b != i)){ // && (b > i)
//                    i = 0;
//                    //arrC = {a, b};
//                    arrC = add(arrC.length, arrC, b);
//                    System.out.println(Arrays.toString(arrC));
//                    //sortSortedArrays(arrC, arrB, false);
//                    for(int a2 : arrA){
//                        for(int b2 : arrB){
//                            if((a2 > b) && (b2 > a2)){
//                                arrC = add(arrC.length, arrC, a2);
//                                arrC = add(arrC.length, arrC, b2);
//                                i = b2;
//                                System.out.println(Arrays.toString(arrC));
//                            }
//                        }
//
//                    }
//                }
//            }
//        }
//    }

    public static int[] add(int n, int arr[], int target){
        int i;

        int tempArr[] = new int[n + 1];

        for(i=0; i<n; i++){
            tempArr[i] = arr[i];
        }

        tempArr[n] = target;
        return tempArr;

    }

//    public void sortSortedArrays(int[] arrA, int[] arrB, int i){
//
//        if(arrA.length == 0){
//            int[] arrC = arrA[i];
//            System.out.println(Arrays.toString(arrC));
//        }
//
//    }

//    int i = 0;
//    int j = 0;
//    static int arrC[] = {};
//    public void sortSortedArrays(int[] arrA, int[] arrB, boolean flag) {
//
////        if(i >= arrA.length){
////            System.exit(0);
////        }
//
//        for (i = 0; i < arrA.length; i++) {
//            int arrC[] = {};
//            int arrD[] = arrC;
//
//            arrC = add(arrC.length, arrC, (int) Array.get(arrA, i));  //*********
//            //sortSortedArrays(arrC, arrB);
//            //if()
//            //System.out.println(Arrays.toString(arrA));
//            //System.out.println(Arrays.toString(arrC));  //********
//            for (j = 0; j < arrB.length; j++) {
//                //System.out.println(Arrays.toString(arrB));
//                //sortSortedArrays();
//                if ((int) Array.get(arrA, i) < (int) Array.get(arrB, j)) {
////                    if(flag){
////                        arrC = add(arrC.length, arrC, (int)Array.get(arrA, i));
////                    }
//                    arrC = add(arrC.length, arrC, (int) Array.get(arrB, j));
//                    System.out.println(Arrays.toString(arrC));
//                    //sortSortedArrays(arrB, arrC, true);
//                }
////                arrC = add(arrC.length, arrC, (int)Array.get(arrB, j));
////                System.out.println(Arrays.toString(arrC));
////                //sortSortedArrays(arrB, arrC);
//            }
//        }
//    }


    //flag = true : Add current element from A
    //flag = false : Add current element from B
    public void sortSortedArrays(int[] arrA, int[] arrB, int[] arrC, boolean flag, int indexA, int indexB, int k) {

//        int[] arrTemp = arrC;

        if(indexA >= arrA.length && indexB == 0){
            flag = false;
        }

        if(flag){
            if(((int)Array.get(arrA, indexA) > (int)Array.get(arrB, indexB)) || (indexA == 0)){
                arrC = add(arrC.length, arrC, (int)Array.get(arrA, indexA));
                //flag = false;
                //int tempA = indexA=+1;
//                if(indexA < arrA.length-1){
//                    sortSortedArrays(arrA, arrB, arrC, false, indexA+1, indexB);
//                }
//                else if(indexA < arrA.length){
//                    sortSortedArrays(arrA, arrB, arrC, false, indexA, indexB);
//                }
                sortSortedArrays(arrA, arrB, arrC, false, indexA+1, indexB, k);
                //System.out.println(Arrays.toString(arrC));
            }
            else{
                sortSortedArrays(arrA, arrB, arrC, true, indexA+1, indexB, k);
            }
        }
//        else if(indexA == 0){
//            indexA++;
//        }
        else{
            //int anotherTempA = indexA-1;
            if((int)Array.get(arrB, indexB) > (int)Array.get(arrA, indexA-1)){
//                if(indexA >= arrA.length && indexB >=  arrB.length){
//                    return;
//                }
                arrC = add(arrC.length, arrC, (int) Array.get(arrB, indexB));
                if(indexA >= arrA.length && indexB >=  arrC[indexB]){
                    return;
                }
                System.out.println(Arrays.toString(arrC));
                if((indexB >= arrB.length-1)){
                    k++;
                    indexA = k;
                    indexB = 0;
                    int[] arrTemp = {};
                    //arrC = arrTemp;
                    sortSortedArrays(arrA, arrB, arrTemp, true, indexA, indexB, k);
                }
                sortSortedArrays(arrA, arrB, arrC, true, indexA, indexB, k);
            }
            else{
                sortSortedArrays(arrA, arrB, arrC, false, indexA, indexB+1, k);
            }
        }
    }

}
