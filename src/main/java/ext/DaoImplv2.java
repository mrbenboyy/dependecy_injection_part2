package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

//6 mois apres j'ai besoin d'une autre implémentation
@Component("dao2")
public class DaoImplv2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double data = 66;
        return data;
    }
}
