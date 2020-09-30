package com.designpattern.tax.propertytype;

public class Residential implements PropertyTypeInterface {

    @Override
    public float getPropertyTaxValue() {
        return 10;
    }
}
