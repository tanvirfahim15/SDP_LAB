package sdp_assignment_01.problem02;

import java.util.Vector;

public class Hotel implements Subject {

    Vector<Observer> observerList=new Vector<>();
    Vector<String> emailList = new Vector<>();

    public void addEmail(String email){
        emailList.add(email);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i =0;i<observerList.size();i++){
            observerList.get(i).update(this);
        }
    }
}
