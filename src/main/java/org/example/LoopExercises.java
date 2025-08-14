package org.example;

public class LoopExercises {

    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // (use a for loop)
        int total = 0; // start with 0
        for (int i = 1; i <= n; i++) { // loop from 1 up to n
            total += i; // add i to total each time
        }
        return total; // return the sum
    }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        int total = 0;  // keep track of the running sum
        int counter = 1; // start counting from 1

        while (counter <= n) { // keep looping while counter is less than or equal to n
            total += counter; // add current counter to the total
            if (total % 2 == 0) { // if the sum becomes even, stop
                break;
            }
            counter++; // move to the next number
        }
        return total; // return the sum so far
    }
}
