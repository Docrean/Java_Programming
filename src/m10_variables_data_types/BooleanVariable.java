package m10_variables_data_types;

import java.util.Arrays;

public class BooleanVariable {
    public static void main(String[] args){

        boolean isMarried = true;

        System.out.println(isMarried);

        boolean isEmployed = true;

        System.out.println(isEmployed);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arr.length);
        System.out.println(arr[0]);

        arr[0] = 100;
        System.out.println(arr[0]);

        System.out.println(Arrays.toString(arr));

    }
}
