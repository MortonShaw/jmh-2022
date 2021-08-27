package com.jmh;

import org.openjdk.jmh.annotations.*;

/**
 * @author MortonShaw
 * @date 2021/8/25 23:36
 */
public class Test {

    @Benchmark
    @Warmup(iterations = 1, time = 3)
    @Measurement(iterations = 1, time = 3)
    @Fork(5)
    public void test() {
        ParallelStream.parallel();
    }

}
