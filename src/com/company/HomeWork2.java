package com.company;

import java.util.Arrays;

public class HomeWork2 {

    int[] nums = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

    public int[] change() {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        return nums;
    }

    int[] multiplicity = new int[8];

    public int[] fullIn() {
        for (int i = 0; i < multiplicity.length; i++) {
            multiplicity[i] = i * 3;
        }
        return multiplicity;
    }

    int[] raw = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4};

    public int[] multiplication() {
        for (int i = 0; i < raw.length; i++) {
            if (raw[i] < 6) {
                raw[i] = raw[i] * 2;
            }
        }
        return raw;
    }

    int[][] nums2 = new int[2][2];

    public int[][] fillInTheDiagonal() {
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (j == i) {
                    nums2[i][j] = 1;
                } else
                    nums2[i][j] = 0;
            }
            System.out.println(Arrays.toString(nums2[i]));
        }
        return nums2;
    }

    int[] raw2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4};

    public void foundMaxMin() {
        int max = raw2[0];
        int min = raw2[0];
        for (int i = 0; i < raw2.length; i++) {
            if (raw2[i] > max) {
                max = raw2[i];
            }
            if (raw2[i] < min) {
                min = raw2[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }

    int[] raw3 = new int[]{1, 1, 1, 1, 1};

    public boolean checkBalance() {
        float S = 0; //сумма элементов массива
        float d = 0; //доля суммы нескольких элементов (от левого края массива до заданного элемента) к сумме элементов массива
        boolean isBalanced = false;
        for (int i = 0; i < raw3.length; i++) {
            S = S + raw3[i];
        }
        for (int i = 0; i < raw3.length; i++) {
            d = d + (raw3[i] / S);
            if (d == 0.5) {
                isBalanced = true;
                System.out.println("Массив сбалансирован");
                return isBalanced;
            } else {
                isBalanced = false;
            }
        }
        System.out.println("Массив несбалансирован");
        return isBalanced;
    }
}