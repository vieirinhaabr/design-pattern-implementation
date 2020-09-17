package com.designpattern.tax.propertytype;

public class Commercial implements PropertyType{

    @Override
    public float getPropertyTaxValue() {
        return 15;
    }
}
