import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class ReizigerOracleDaoImpl {
    private Session session;
    private Transaction transaction;

    public Session openSession(){
        session = OracleBaseDao.getSessionFactory().openSession();
        return session;
    }

    public Session openSessionTransaction(){
        session = OracleBaseDao.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        return session;
    }

    public void closeSession(){
        session.close();
    }

    public  void closeSessionTransaction(){
        transaction.commit();
        session.close();
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public void create(Reiziger reiziger){
        getSession().save(reiziger);
    }
    public void update(Reiziger reiziger){
        getSession().update(reiziger);
    }
    public void delete(Reiziger reiziger){
        getSession().delete(reiziger);
    }
    public Reiziger findById(int id){
        return getSession().get(Reiziger.class, id);
    }
}
