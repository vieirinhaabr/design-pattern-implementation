package com.designpattern;

import com.designpattern.owner.Juridical;
import com.designpattern.owner.OwnerInterface;
import com.designpattern.owner.Physical;
import com.designpattern.property.Building;
import com.designpattern.property.House;
import com.designpattern.property.Property;
import com.designpattern.tax.Tax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Property property;
        boolean insertAnymore = true;
        Scanner insertion = new Scanner(System.in);

        while (insertAnymore) {
            System.out.println("Digite 'true' e Enter para cadastrar uma Casa, ou 'false' para cadastrar " +
                    "um Prédio...");
            boolean propertyStyle = insertion.nextBoolean();

            System.out.println("Digite o tamanho da propriedade em m2 (metros quadrados)...");
            float propertySize = insertion.nextFloat();

            System.out.println("Digite o valor da propriedade sem pontos...");
            float propertyValue = insertion.nextFloat();

            System.out.println("Digite 'true' e Enter para cadastrar uma propriedade comercial, ou 'false' " +
                    "para cadastrar uma propriedade residencial...");
            boolean propertyType = insertion.nextBoolean();

            if (propertyStyle){
                System.out.println("Digite a quantidade de quartos da casa...");
                int bedRoomsQuantity = insertion.nextInt();

                property = new House(propertySize, propertyValue, propertyType, bedRoomsQuantity);
            } else{
                System.out.println("Digite o tamanho da sala principal...");
                float mainRoomSize = insertion.nextFloat();

                property = new Building(propertySize, propertyValue, propertyType, mainRoomSize);
            }

            System.out.println("Proprietario: Digite 'true' para cadastrar um proprietario fisico e 'false' para" +
                    "cadastrar um proprietario juridico...");

            if (insertion.nextBoolean()){
                property.setOwnerType(new Physical());
            } else{
                property.setOwnerType(new Juridical());
            }

            property.getData();

            System.out.println("Deseja inserir mais alguma propriedade? Tecle 0 e Enter para inserir mais, ou " +
                    "1 para interromper...");
            if (insertion.nextInt() != 0) {
                insertAnymore = false;
            }

            System.out.println("\n\n\n\n");
        }
    }
}
