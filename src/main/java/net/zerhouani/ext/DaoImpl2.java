package net.zerhouani.ext;

import net.zerhouani.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web service");
        return 41;
    }
}