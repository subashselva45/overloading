package io.pragra.learning.sep;

import java.util.Scanner;

public class Car {
    private String carMake;
    private String carModel;
    private double carPrice;

    public Car(String carMake) {
        this.carMake = carMake;
    }

    public Car(String carMake, String carModel) {
        this.carMake = carMake;
        this.carModel = carModel;
    }

    public Car(String carModel, double carPrice) {
        this.carModel = carModel;
        this.carPrice = carPrice;
    }
    public void startCar(){
        System.out.println(" The car is not in starting Mode");
    }
    public void startCar(Boolean startMode) {
        System.out.println("The car is now on" + startMode);
    }

    public static void main(String[] args) {
        System.out.println("think of a number between 1 to 10");
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("my guess is :"+(int)(Math.random()*10));
            System.out.println("y/n");
            String ch=  sc.nextLine();
            if(ch.equals("y")){
                System.out.println("correct !!!!!!!!!!");
                break;}

        }

    }
}
