package br.com.tathykanashiro;

public class SemContratosFactory extends Factory {
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new OnixCar(90, "cheio", "prata");
        } else {
            return new CivicCar(110, "cheio", "cinza");
        }
    }
}
