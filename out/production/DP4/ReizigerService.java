public class ReizigerService {
    private static ReizigerService service;
    private ReizigerOracleDaoImpl dao;

    public static ReizigerService getService() {
        if(service == null)
            service = new ReizigerService();
        return service;
    }

    public ReizigerService() {
        dao = new ReizigerOracleDaoImpl();
    }

    public void create(Reiziger reiziger){
        dao.openSessionTransaction();
        dao.create(reiziger);
        dao.closeSessionTransaction();
        System.out.println("succes");
    }

    public void update(Reiziger reiziger){
        dao.openSessionTransaction();
        dao.update(reiziger);
        dao.closeSessionTransaction();
    }

    public void delete(Reiziger reiziger){
        dao.openSessionTransaction();
        dao.delete(reiziger);
        dao.closeSessionTransaction();
    }
    public Reiziger findById(int id){
        dao.openSession();
        Reiziger reiziger = dao.findById(id);
        dao.closeSession();
        return reiziger;
    }
}
