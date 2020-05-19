import org.hibernate.Session;
import org.hibernate.Transaction;

public class OVChipkaartOracleDaoImpl {
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

    public void create(OVChipkaart ovChipkaart){
        getSession().save(ovChipkaart);
    }
    public void update(OVChipkaart ovChipkaart){
        getSession().update(ovChipkaart);
    }
    public void delete(OVChipkaart ovChipkaart){
        getSession().delete(ovChipkaart);
    }
}
