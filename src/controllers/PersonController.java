package controllers;


import models.*;

public class PersonController {
    
    public void sortByName(Person[] personas){
        for (int i = 0; i < personas.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < personas.length; j++) {
                if (personas[j].getName().compareTo(personas[j+1].getName()) > 0){
                    Person temp = personas[j];
                    personas[j] = personas [j+1];
                    personas[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped){
                break;
            }
        }
    }
}
