public class OVChipkaartService {
    private static OVChipkaartService service;
    private OVChipkaartOracleDaoImpl dao;

    public static OVChipkaartService getService(){
        if(service == null)
            service = new OVChipkaartService();
        return service;
    }

    public OVChipkaartService(){
        dao = new OVChipkaartOracleDaoImpl();
    }

    public void create(OVChipkaart ovChipkaart){
        dao.openSessionTransaction();
        dao.create(ovChipkaart);
        dao.closeSessionTransaction();
    }
    public void update(OVChipkaart ovChipkaart){
        dao.openSessionTransaction();
        dao.update(ovChipkaart);
        dao.closeSessionTransaction();
    }
    public void delete(OVChipkaart ovChipkaart){
        dao.openSessionTransaction();
        dao.delete(ovChipkaart);
        dao.closeSessionTransaction();
    }
}
