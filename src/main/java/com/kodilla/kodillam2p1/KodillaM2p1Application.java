package com.kodilla.kodillam2p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaM2p1Application {

    public static void main(String[] args) {
        SpringApplication.run(KodillaM2p1Application.class, args);

        int[] numbers = { 3, 5, 6, 8, 5, 3, 2, 1, 56, 32, 18, 85, 34, 23, 49, 44, 66, 88, 99, 1 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Liczba " + (i+1) + " równa " + numbers[i]);
            sum = sum + numbers[i];
        }

        double average = (double) sum/numbers.length;
        System.out.println("Średnia to: " + average);
    }
}
