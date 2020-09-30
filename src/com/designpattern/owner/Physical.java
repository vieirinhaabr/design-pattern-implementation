package com.designpattern.owner;

public class Physical implements OwnerInterface {

    private final OwnerDocType ownerDocType;

    public Physical() { this.ownerDocType = OwnerDocType.CPF; }

    @Override
    public OwnerDocType getOwnerDocType() {
        return ownerDocType;
    }
}
