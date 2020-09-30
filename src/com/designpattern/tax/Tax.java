package com.designpattern.tax;

import com.designpattern.tax.propertytype.Commercial;
import com.designpattern.tax.propertytype.PropertyTypeInterface;
import com.designpattern.tax.propertytype.Residential;

public class Tax {
    private final PropertyTypeInterface propertyType;

    public Tax(Boolean selection){
        if(selection){
            this.propertyType = new Commercial();
        }
        else{
            this.propertyType = new Residential();
        }
    }

    public float getTaxValue(float propertyValue){
        return propertyValue * (propertyType.getPropertyTaxValue() / 100);
    }
}
