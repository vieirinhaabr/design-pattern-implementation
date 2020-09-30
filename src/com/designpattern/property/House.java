package com.designpattern.property;

public class House extends Property{
    int bedRoomsQuantity;

    public House(float size, float propertyValue, boolean propertyType, int bedRoomsQuantity) {
        super(size, propertyValue, propertyType);
        this.bedRoomsQuantity = bedRoomsQuantity;
    }

    @Override
    public void getData() {
        System.out.println("\n\n\n");

        System.out.println("-- TIPO DE PROPRIEDADE: CASA --");
        super.getData();
        System.out.println("QUANTIDADE DE QUARTOS: " + this.bedRoomsQuantity);

        System.out.println("\n\n");
    }
}
