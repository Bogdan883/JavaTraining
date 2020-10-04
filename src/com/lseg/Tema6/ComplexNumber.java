package com.lseg.Tema6;

public class ComplexNumber {

    private double real;
    private double imaginary;

    //constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //getReal
    public double getReal() {
        return real;
    }

    //getImaginary
    public double getImaginary() {
        return imaginary;
    }

    //add with two parameters
    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    //add with one parameter
    public void add(ComplexNumber other){
        this.real = this.real + other.real;
        this.imaginary = this.imaginary + other.imaginary;
    }

    //subtract with two parameters
    public void subtract(double real, double imaginary){
        this.real = this.real-real;
        this.imaginary = this.imaginary - imaginary;
    }

    //subtract with one parameter
    public void subtract(ComplexNumber other){
        this.real = this.real - other.real;
        this.imaginary = this.imaginary - other.imaginary;
    }

    //
}
