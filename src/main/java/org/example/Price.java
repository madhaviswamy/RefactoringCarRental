package org.example;

public abstract class Price {

    abstract int getPriceCode();

    abstract double getCharge(int numberOfDaysRented);

    int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
