import business.CourseManager;
import dataAccess.BaseDatabaseManager;
import dataAccess.HibernateDatabaseManager;
import dataAccess.JdbcDatabaseManager;
import dataAccess.log.BaseLogger;
import dataAccess.log.MailLogger;
import entities.Courses;

//this code's purpose is homework with the description of "Simulate a little backend program of udemy,
//but only has one function as adding course with only one condition that while adding course, it should be
//higher price 0 and course name should not be blank"

public class Main {
    public static void main(String[] args) {


        CourseManager courseManager = new CourseManager();
        BaseDatabaseManager databaseManager = new BaseDatabaseManager();

        //adding course
        Courses courses = new Courses();
        courses.setId(1);
        courses.setName("Java");
        courses.setPrice(10);

        if (courses.getPrice() > 0 &&!courses.getName().isEmpty()) {
            courseManager.add();
            databaseManager.add(new HibernateDatabaseManager()); //this is a polimorphism. You can change this wheter 'JdbcDatabaseManager()' or 'HibernateDatabaseManager()'
            BaseLogger logger = new BaseLogger(new MailLogger()); //this is a polimorphism. You can change this wheter 'MailLogger()' or 'FileLogger()'
        }else {
            System.out.println("Course settings is not valid");
        }




    }
}