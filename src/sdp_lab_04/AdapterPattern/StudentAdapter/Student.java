package sdp_lab_04.AdapterPattern.StudentAdapter;

public class Student {
    long id;
    String name;
    String dob;
    String result;

    public Student(long id, String name, String dob, String result) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.result = result;
    }

    public Student(StudentEntity studentEntity){
        if(studentEntity==null){
            System.out.println("Null");
            return;
        }
        this.id = (long) studentEntity.id;
        this.name = studentEntity.name;
        this.dob = studentEntity.dob.getDate()+"/"+studentEntity.dob.getMonth()+1+"/"+studentEntity.dob.getYear();
        this.result = Float.toString(studentEntity.result);
    }

    @Override
    public String toString() {

        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
