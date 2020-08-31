package OOP;

import java.util.Scanner;

public class Decimal {
    private float numerator;
    private float denominator;

    public Decimal(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }



     protected float addition(){
        return this.numerator + this.denominator;
    }

     float subtraction (){
        return numerator - denominator;
    }

    float multiplication (){
        return numerator * denominator;
    }

     float division(){
        return numerator / denominator;
    }

    public float getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}

