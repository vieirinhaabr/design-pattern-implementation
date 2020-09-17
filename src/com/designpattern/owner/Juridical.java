package com.designpattern.owner;

public class Juridical implements Owner {

    private final OwnerDocType ownerDocType;

    public Juridical(){
        this.ownerDocType = OwnerDocType.CNPJ;
    }

    @Override
    public OwnerDocType getOwnerDocType() {
        return ownerDocType;
    }
}
