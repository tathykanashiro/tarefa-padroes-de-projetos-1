package br.com.tathykanashiro;

public class ContratosFactory extends Factory{
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorolaCar(100, "cheio", "azul");
        } else {
            return new CivicCar(110, "cheio", "cinza");
        }
    }
}
