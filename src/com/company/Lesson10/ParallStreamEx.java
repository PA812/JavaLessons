package com.company.Lesson10;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParallStreamEx {
    public static void main(String[] args) {
        parallelStreamsExample();
    }

    private static void parallelStreamsExample() {
        int max = 300_000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        System.out.format("%nSequence%n-------%n");
        List<String> cpy = new ArrayList<>(values);
        Instant start = Instant.now();
        cpy.stream()
                .sorted()
                .count();
        Instant end = Instant.now();
        long seq = Duration.between(start, end).getNano();
        System.out.println("seq: " + seq);

        System.out.format("%nParallel%n-------%n");
        start = Instant.now();
        values.parallelStream()
                .sorted()
                .count();
        end = Instant.now();
        long par = Duration.between(start, end).getNano();
        System.out.println("\npar: " + par);
        System.out.println("seq/par: " + ((double) seq / par));
    }
}
