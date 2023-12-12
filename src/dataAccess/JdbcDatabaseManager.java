package dataAccess;

public class JdbcDatabaseManager implements DatabaseDao{
    @Override
    public void add() {
        System.out.println("Added to database via JDBC");
    }
}
