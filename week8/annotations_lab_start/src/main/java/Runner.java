import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Level;
import models.Student;

public class Runner {

    public static void main(String[] args) {

        Lesson reading = new Lesson("Reading", 101, )//"yyyy.MM.dd G 'at' HH:mm:ss z"


        Course english = new Course("English", Level.BA);
        DBHelper.save(english);
        Course physics = new Course("Physics", Level.BSC);
        DBHelper.save(physics);
        Course engineering = new Course("Engineering", Level.BENG);
        DBHelper.save(engineering);


        Student student1 = new Student("Peter", "Whittle", 31, english);
        DBHelper.save(student1);
        Student student2 = new Student("Jennifer", "Whittle", 29, english);
        DBHelper.save(student2);
        Student student3 = new Student("Matt", "Lloyd", 28, engineering);
        DBHelper.save(student3);
        Student student4 = new Student("Becky", "Drinkwater", 25, physics);
        DBHelper.save(student4);




    }
}
