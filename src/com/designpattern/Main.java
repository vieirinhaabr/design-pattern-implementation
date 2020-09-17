package com.designpattern;

import com.designpattern.owner.Juridical;
import com.designpattern.owner.Owner;
import com.designpattern.owner.OwnerDocType;
import com.designpattern.owner.Physical;
import com.designpattern.tax.Tax;

public class Main {
    public static void main(String[] args) {

        // OWNER USE SAMPLE
        Owner owner;

        owner = new Juridical();
        System.out.println(owner.getOwnerDocType());

        owner = new Physical();
        System.out.println(owner.getOwnerDocType());


        // TAX USE SAMPLE
        Tax tax;

        tax = new Tax(false);
        System.out.println(tax.getTaxValue(1000000));

        tax = new Tax(true);
        System.out.println(tax.getTaxValue(1000000));

    }
}
