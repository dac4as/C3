package it.unicam.cs.ids2021.project.interaction;

import it.unicam.cs.ids2021.project.InteractionManager;
import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.users.Commerciante;

import java.util.Set;

public class ICommerciante {

    public void init(Set<Commerciante> setCommerciante){
        for(Commerciante c : setCommerciante){
            System.out.println(c);
        }
    }
}