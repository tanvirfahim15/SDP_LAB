package sdp_lab_04.AdapterPattern.StudentAdapter;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class StudentEntity {
    int id;
    String name;
    Date dob;
    float result;

    public StudentEntity(int id, String name, Date dob, float result) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.result = result;
    }
    public StudentEntity(Student student) throws ParseException {
        if(student==null){
            System.out.println("Null");
            return;
        }
        this.id = (int)student.id;
        this.name = student.name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(student.dob);
        this.result = Float.parseFloat(student.result);
    }

    @Override
    public String toString() {

        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", result=" + result +
                '}';
    }
}
