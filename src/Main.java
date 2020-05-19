import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
  private static SessionFactory factory;

  public static void main(String[] args) throws SQLException, ParseException {
    Reiziger reiziger1 = new Reiziger(102,"E.M.","","Hosman", java.sql.Date.valueOf("1998-03-15"));
    //ReizigerService.getService().create(reiziger1);

    OVChipkaart ov = new OVChipkaart(100, java.sql.Date.valueOf("2021-05-20"), 2, 5000.00,reiziger1);


    reiziger1.addChipkaart(ov);

    OVChipkaartService.getService().create(ov);
  }
}
