package com.designpattern.property;

import com.designpattern.owner.OwnerInterface;

public interface PropertyInterface {
    void setOwnerType(OwnerInterface owner);
    String getOwnerDocType();

    float getTaxValue();
}
