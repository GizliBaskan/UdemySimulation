package dataAccess;

public class HibernateDatabaseManager implements DatabaseDao{


    @Override
    public void add() {
        System.out.println("Added to database via Hibernate");
    }
}
