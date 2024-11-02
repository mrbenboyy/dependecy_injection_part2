package pres;

import ext.DaoImplv2;
import metier.MetierImpl;

public class Pres1 {

    //Instanciation statique
    public static void main(String[] args) {
        DaoImplv2 d= new DaoImplv2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); //Injection des dépendances
        System.out.println("RES = "+metier.calcul());
    }
}
