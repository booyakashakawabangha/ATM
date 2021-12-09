package atm;

public class LastTray extends DefaultTray{
    String message;

    public LastTray(){
        super(0);
    }

    @Override
    public void process(int amount){
        if (amount > 0){
            message = "I still owe you " + amount + ".";
        } else {
            message = "I gave you the full sum.";
        }
        System.out.println(message);
    }
}
