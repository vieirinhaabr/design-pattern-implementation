package com.designpattern.owner;

public enum OwnerDocType {
    CNPJ("cnpj owner"), CPF("cpf owner");

    private final String ownerDoc;

    OwnerDocType(String ownerDoc){
        this.ownerDoc = ownerDoc;
    }

    @Override
    public String toString() {
        return ownerDoc;
    }
}
