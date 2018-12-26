/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author David
 */
public class Car {
    
//Variables programmer creates. Declare, Allocate, Initilize.
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    public Car () {
        
    }
    
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn)    {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        
    }
    
    //Getters and Setters. Getters return the variable of the paticular instance.
    
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
  
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }
    
    
    
    
    public void printVariables()    {
       
        //Functions programmer creates.
        
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
 
    
        public void upgradeMaxSpeed()   {
            setMaxSpeed(getMaxSpeed() + 10);
        }
        
        public void getIn() {
            //numberOfPeopleInCar = numberOfPeopleInCar + 1;
            //If there aren't too many people in the car
            if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
                // then soeone can get in
                numberOfPeopleInCar++;
                System.out.println("Someone got in");
            } else {
                // otherwise print out that the car is full
                System.out.println("The car is full! " + numberOfPeopleInCar + " people in car.");
            }
        }
        
        public void getOut()    {
            //numberOfPeopleInCar = numberOfPeopleInCar - 1;
            // If there are people in the car
            if (numberOfPeopleInCar > 0) {
                // then tell one person to get out
                numberOfPeopleInCar--;
            } else {
                //otherwise no one car get out and print that
            System.out.println("No one is in the car." + numberOfPeopleInCar);
        }
            
        }
        
        public double howManyMilesTillOutOfGas( )   {
            return currentFuel * mpg;
        }
        
        public double maxMilesPerFillUp()   {
            return maxFuel * mpg;
        }
        
        public void turnTheCarOn() {
            // if the car ins't on...
            if (!isTheCarOn) {
                // turn it on
                isTheCarOn = true;
            } else {
                // otherwise print out the fact it's on
                System.out.println("The Car is already on.");
            }
        }
        
        
        
       
    public static void main(String[] args) {
        
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
        
        
//        Car birthdayPresent = new Car(500, 5000.545, true);
//        System.out.println("Birthday Car v1");
//        birthdayPresent.printVariables();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas());
//        System.out.println("Max miles: " + birthdayPresent.maxMilesPerFillUp());
//        System.out.println("Birthday Car v2");
//        birthdayPresent.printVariables();
//        birthdayPresent.getOut();
//        System.out.println("Birthday Car v3");
//        birthdayPresent.printVariables();
        
        
//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
    }
    
}
