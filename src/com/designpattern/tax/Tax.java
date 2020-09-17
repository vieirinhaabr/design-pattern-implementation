package com.designpattern.tax;

import com.designpattern.tax.propertytype.Commercial;
import com.designpattern.tax.propertytype.PropertyType;
import com.designpattern.tax.propertytype.Residential;

public class Tax {
    private final PropertyType propertyType;

    public Tax(Boolean selection){
        if(selection){
            propertyType = new Commercial();
        }
        else{
            propertyType = new Residential();
        }
    }

    public float getTaxValue(float propertyValue){
        return propertyValue * (propertyType.getPropertyTaxValue() / 100);
    }
}
