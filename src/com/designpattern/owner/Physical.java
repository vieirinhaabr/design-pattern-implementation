package com.designpattern.owner;

public class Physical implements Owner{

    private final OwnerDocType ownerDocType;

    public Physical() { this.ownerDocType = OwnerDocType.CPF; }

    @Override
    public OwnerDocType getOwnerDocType() {
        return ownerDocType;
    }
}
