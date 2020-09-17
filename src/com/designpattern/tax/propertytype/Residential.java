package com.designpattern.tax.propertytype;

public class Residential implements PropertyType{

    @Override
    public float getPropertyTaxValue() {
        return 10;
    }
}
