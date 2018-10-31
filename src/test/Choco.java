package test;

import exam.Singleton.ChocolateBoiler;

public class Choco {
    private boolean empty;
    private boolean boiled;
    private static volatile Choco instance;

    private Choco() {
        empty = true;
        boiled = false;
    }

    public static Choco getInstance(){
        if(instance==null){
            synchronized (Choco.class){
                if(instance==null){
                    instance = new Choco();
                }
            }

        }
        return instance;
    }

    public static void main(String[] args) {
        ChocolateBoiler c = ChocolateBoiler.getInstance();
        System.out.println(c);
        System.out.println(ChocolateBoiler.getInstance());
    }
}
