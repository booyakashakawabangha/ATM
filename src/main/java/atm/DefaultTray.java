package atm;

public abstract class DefaultTray implements Tray{
    private final int bill;
    private Tray nextTray;

    public DefaultTray(int bill){
        this.bill = bill;
    }

    public void process (int amount){
        System.out.println("Extracted " + amount / bill + " bills with nominal of " + bill + ".");
        if (nextTray != null){
            nextTray.process(amount % bill);
        }
    }

    public void setNext(Tray tray){
        this.nextTray = tray;
    }
}
