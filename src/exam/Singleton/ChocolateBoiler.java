package exam.Singleton;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static volatile ChocolateBoiler uniqueChocolateBoiler;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (uniqueChocolateBoiler == null){
            synchronized (ChocolateBoiler.class){
                if(uniqueChocolateBoiler==null){
                    uniqueChocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueChocolateBoiler;
    }

    public void boil(){
        if(isEmpty() && ! isBoiled()){
            setBoiled(true);
        }
    }

    public void fill(){
        if(isEmpty()){
            setEmpty(false);
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            setEmpty(true);
            setBoiled(false);
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private void setEmpty(boolean empty) {
        this.empty = empty;
    }

    private boolean isBoiled() {
        return boiled;
    }

    private void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }
}
