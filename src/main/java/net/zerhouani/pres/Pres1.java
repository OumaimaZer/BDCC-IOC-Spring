package net.zerhouani.pres;

import net.zerhouani.dao.DaoImpl;
import net.zerhouani.ext.DaoImpl2;
import net.zerhouani.dao.IDao;
import net.zerhouani.metier.IMetier;
import net.zerhouani.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        //IDao dao = new DaoImpl(); // Instanciation statique
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao); // Injection des dépendances via le setter
        System.out.println("RES=" + metier.calcul());
    }
}