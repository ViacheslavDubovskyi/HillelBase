package org.hillel.lessons.objectstart;

public class CompareArray {

    public static void main(String[] args) {

        int[] first = {1,2,3,5};
        int[] second = {1,2,4};
        //second = first;

        boolean result = compareArray(first, second);
        System.out.println(result);

    }

    public static boolean compareArray (int[] first, int[] second){

        if (first == second) {
            return true;
        }

        if (first.length!=second.length){
            return false;
        }

        for (int i=0; i<first.length; i++){
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
}
