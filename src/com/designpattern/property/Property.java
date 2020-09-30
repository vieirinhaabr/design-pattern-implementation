package com.designpattern.property;

import com.designpattern.owner.OwnerInterface;
import com.designpattern.tax.Tax;

public class Property implements PropertyInterface{
    OwnerInterface owner;
    Tax tax;
    float size, propertyValue;

    public Property(float size, float propertyValue, boolean propertyType){
        this.size = size;
        this.propertyValue = propertyValue;

        this.tax = new Tax(propertyType);
    }

    @Override
    public void setOwnerType(OwnerInterface owner) {
        this.owner = owner;
    }

    @Override
    public String getOwnerDocType() {
        return String.valueOf(this.owner.getOwnerDocType());
    }

    @Override
    public float getTaxValue() {
        return this.tax.getTaxValue(this.propertyValue);
    }

    public void getData() {
        System.out.println("TAMANHO DA PROPRIEDADE: " + this.size);
        System.out.println("VALOR DA PROPRIEDADE: " + this.propertyValue);
        System.out.println("TIPO DE DOCUMENTO DO PROPRIETARIO: " + getOwnerDocType());
        System.out.printf("VALOR DA TAXA DE IMPOSTO: %.2f \n", getTaxValue());
    }
}
