package ru.netology.sqr.services;

public class SQRService {

    public int calcSqr(int lowerRangeLimit, int upperRangeLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerRangeLimit <= i * i && upperRangeLimit >= i * i) {
                System.out.print(" i= " + i + ", i**2 = " + i * i + "\n");
                count++;
            }
        }
        return count;
    }
}