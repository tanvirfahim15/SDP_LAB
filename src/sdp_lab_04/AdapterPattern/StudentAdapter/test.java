package sdp_lab_04.AdapterPattern.StudentAdapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test {
    public static void main(String[] args) throws ParseException {
        try{
            StudentEntity studentEntity = new StudentEntity(1,"name", new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"), (float) 2.00);
            Student student = new Student(studentEntity);
            System.out.println(student.toString());;
            studentEntity= new StudentEntity(student);
            System.out.println(studentEntity.toString());;
        }catch (NullPointerException n){
            System.out.println("Null pointer Exception");
        }
    }

}
