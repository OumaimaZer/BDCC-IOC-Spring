package net.zerhouani.metier;

import net.zerhouani.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Dependency

    // Constructor-based dependency injection
    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDAO
     * au moment del'instanciation
     **/
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData(); // Uses the injected DAO
        double res = t * 12 *Math.PI/2 * Math.cos(t);
        return res;
    }

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDAO
     * après instanciation
     **/
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}