package Dsa_VN.Day_1_problem;

import java.util.*;

public class findDuplicate {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 1, 2, 4, 5 };

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
