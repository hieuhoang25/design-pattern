package org.example.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);
        factory.createChair().create();
        factory.createTable().create();
    }
}
