package org.example.factory;

import java.util.Scanner;

public class ComputerFactory {
    public static Computer createComputer(String computerType, Integer ram, Integer hardDisk) {
        if ("PC".equalsIgnoreCase(computerType)) {
            return new PC(ram, hardDisk);
        }else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numarul de componente: ");
            Integer numberOfComponents = scanner.nextInt();
            return new Server(ram, hardDisk, numberOfComponents);
        }
    }
}
