package net.zerhouani.ext;

import net.zerhouani.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web service");
        double t = 12;
        return t;
    }
}