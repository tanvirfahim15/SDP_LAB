package sdp_assignment_01.problem02;

import java.util.Vector;

public class User implements Observer, DisplayElement {
    String userName=null;
    Vector<String> emailList = new Vector<>();



    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(Subject s) {
        if(s instanceof Hotel){
            Hotel h = (Hotel) s;
            emailList.add(h.emailList.get(h.emailList.size()-1));
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("Inbox of: "+userName );
        emailList.stream().forEach(e->{
            System.out.println(e);;
        });
    }
}
