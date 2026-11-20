package ss.week1;

import java.util.Arrays;

public class UniqueArray {
    public static void main(String[] args) {

        int[] values = {
                4, 7, 4, 3, 7, 9, 3, 2, 9, 1, 2
        };

        int[] A = new int[values.length];
        int idx = 0;;
        values = Arrays.stream(values).sorted().toArray();
        int tmp = -1;

        for(int i = 0; i < values.length; i++){

            if (values[i] > tmp){
                A[idx] = values[i];
                idx++;
                tmp = values[i];

            }
        }
        int[] secondArr = new int[idx];
        for (int i = 0; i < secondArr.length; i++){
            secondArr[i] = A[i];
        }
        System.out.println(Arrays.toString(secondArr));


    }
}
