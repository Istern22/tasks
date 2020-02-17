package com.github.istern22.algorithm;

public class Algorithm {

    public int searchBinary(int[] array, int item) {

        int head = 0;
        int tail = array.length - 1;

        while (head <= tail) {
            int mid = (head + tail) / 2;
            int guess = array[mid];
            if (guess == item) {
               return mid;
            }
            if (guess > item) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        return -1;
    }
}
