/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Date;

/**
 *
 * @author chrispasquali
 */
public class Fitness extends Person {
    private int steps;
    //number of floors climbed
    private int floors;
    private double bmi;
    private double fatRatio;
    private int heartRate;
    //hours slept
    private double hoursSlept;
    private Date fitnessDate;
    
    public Fitness (int steps, int floors, double bmi, double fatRatio, int heartRate,
                    double hoursSlept, Date fitnessDate, String name, String gender, int memberNumber, double weight, double height) {
        super(name, gender, memberNumber, weight, height);
        this.steps = steps;
        this.floors = floors;
        this.bmi = bmi;
        this.fatRatio = fatRatio;
        this.heartRate = heartRate;
        this.hoursSlept = hoursSlept;
        this.fitnessDate = fitnessDate;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = weight/(height*height);
    }

    public double getFatRatio() {
        return fatRatio;
    }

    public void setFatRatio(double fatRatio) {
        this.fatRatio = fatRatio;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getHoursSlept() {
        return hoursSlept;
    }

    public void setHoursSlept(double hoursSlept) {
        this.hoursSlept = hoursSlept;
    }

    public Date getFitnessDate() {
        return fitnessDate;
    }

    public void setFitnessDate(Date fitnessDate) {
        this.fitnessDate = fitnessDate;
    }
    
    
}
