/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarManagement;

import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.nio.Buffer;
import java.util.Scanner;

/**
 *
 * @author uinic
 */
public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

//Contructor
    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

// Getter and Setter
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

//    Methods
    public void pressStartButton() {
        System.out.println("You have pressed the Start button");
    }

    public  void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void inputCar() {
        Scanner input = new Scanner(System.in);
        colour = input.nextLine();
        enginePower = input.nextInt();
        convertible = input.nextBoolean();
        parkingBrake = input.nextBoolean();
    }
    public void output() {
        System.out.format("|%s|%d|%s|%s|\n", colour, enginePower, convertible, parkingBrake);
    }



}
