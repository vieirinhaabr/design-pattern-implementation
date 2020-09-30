package com.designpattern.property;

public class Building extends Property {
    float mainRoomSize;

    public Building(float size, float propertyValue, boolean propertyType, float mainRoomSize) {
        super(size, propertyValue, propertyType);
        this.mainRoomSize = mainRoomSize;
    }

    @Override
    public void getData(){
        System.out.println("\n\n\n");

        System.out.println("-- TIPO DE PROPRIEDADE: PREDIO --");
        super.getData();
        System.out.println("TAMANHO DA SALA PRINCIPAL: " + this.mainRoomSize);

        System.out.println("\n\n");
    }
}
