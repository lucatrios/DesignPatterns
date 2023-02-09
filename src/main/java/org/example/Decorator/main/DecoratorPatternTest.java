package org.example.Decorator.main;

import org.example.Decorator.patternImpl.BasicCar;
import org.example.Decorator.patternImpl.Car;
import org.example.Decorator.patternImpl.LuxuryCar;
import org.example.Decorator.patternImpl.SportsCar;

import java.io.BufferedReader;
import java.io.FileReader;


/**
 * Un esempio classico in cui vengono usati i decorator e la libreria Java IO per'esempio le classi BufferedReader e FileReader
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}