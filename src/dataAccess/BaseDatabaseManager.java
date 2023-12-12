package dataAccess;

public class BaseDatabaseManager {

    private DatabaseDao databaseDao;
    public void add(DatabaseDao databaseDao){
        this.databaseDao = databaseDao;
        databaseDao.add();
    }

}
