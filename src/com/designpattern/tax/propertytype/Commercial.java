package com.designpattern.tax.propertytype;

public class Commercial implements PropertyTypeInterface {

    @Override
    public float getPropertyTaxValue() {
        return 15;
    }
}
