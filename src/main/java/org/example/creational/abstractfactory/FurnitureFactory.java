package org.example.creational.abstractfactory;

public class FurnitureFactory {
    public FurnitureFactory() {
    }
    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) throws UnsupportedOperationException {
        switch (materialType){
            case WOOD : return new WoodFactory();
            case FLASTIC : return new FlasticFactory();
            default : throw new UnsupportedOperationException("This furniture is unsupported ");

        }
    }
}
