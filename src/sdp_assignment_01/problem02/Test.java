package sdp_assignment_01.problem02;

public class Test {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.addEmail("Email 001");
        User u1 = new User("User 1");
        h.registerObserver(u1);
        h.addEmail("Email 002");
        User u2 = new User("User 2");
        h.registerObserver(u2);
        h.addEmail("Email 003");

    }
}
