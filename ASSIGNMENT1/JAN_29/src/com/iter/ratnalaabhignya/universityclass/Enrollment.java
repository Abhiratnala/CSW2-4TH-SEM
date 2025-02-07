package com.iter.ratnalaabhignya.universityclass;

public class Enrollment implements EntrollmentSystem {
    private course[] c1; // Array to hold Course objects
    private int maxSize; // Maximum size of the array
    private int count; // Current count of enrolled courses

    public Enrollment(int maxSize) {
        this.maxSize = maxSize;
        c1 = new course[maxSize]; // Initialize the array
        count = 0; // Initialize count
    }

    public void enroll(course s1) {
        if (count < maxSize) {
            c1[count++] = new course(s1.getName(), s1.getRoll(), s1.getBranch());
        } else {
            System.out.println("Cannot enroll more courses, maximum size reached.");
        }
    }

    public void drop(course s2) {
        for (int i = 0; i < count; i++) {
            if (s2.getRoll() == c1[i].getRoll()) { // Use == for int comparison
                // Shift elements to the left to fill the gap
                for (int k = i; k < count - 1; k++) {
                    c1[k] = c1[k + 1];
                }
                c1[count - 1] = null; // Clear the last element
                count--; // Decrease the count
                i--; // Decrement i to check the new element at this index
            }
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(c1[i].getName() + " " + c1[i].getRoll() + " " + c1[i].getBranch());
        }
    }
}