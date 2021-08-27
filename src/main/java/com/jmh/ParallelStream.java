package com.jmh;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author MortonShaw
 * @date 2021/8/25 23:27
 */
public class ParallelStream {

    static List<Integer> nums = new ArrayList<>();

    static {
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            nums.add(1000000 + r.nextInt(1000000));
        }
    }

    static void foreach() {
        nums.forEach(ParallelStream::isPrime);
    }

    static void parallel() {
        nums.parallelStream().forEach(ParallelStream::isPrime);
    }


    private static boolean isPrime(Integer num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
