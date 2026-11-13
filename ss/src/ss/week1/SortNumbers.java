package ss.week1;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Ask user to input numbers separated by whitespaces
 * Store the list in a variable
 * Perform operations on the input
 * task 1.16
 */
public class SortNumbers {
    public static void main(String[] args) {


        System.out.println("Please enter some numbers: ");
        Scanner input = new Scanner(System.in);
        String nums = input.nextLine();

        String[] split = nums.trim().split("\\s+");
        int[] split1 = new int[split.length];
        for (int o = 0; o < split.length; o++) {
            split1[o] = Integer.parseInt(split[o]);
        }
        int i, j, temp;
        temp = 0;
        for (i = 0; i < split1.length; i++ ){
            for (j = 0; j < split1.length-1-i; j++){
                if(split1[j+1] < split1[j]){

                    temp = split1[j+1];
                    split1[j+1] = split1[j];
                    split1[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(split1));

    }
    //bubble sort:
    // first for loop; from 0 to length -1
    // nested loop:
}
