package atm;

public class ATM {
    private Tray firstTray;

    public ATM(){
        Tray tray50 = new Tray50();
        Tray tray20 = new Tray20();
        Tray tray10 = new Tray10();
        Tray tray5 = new Tray5();
        Tray lastTray = new LastTray();
        tray50.setNext(tray20);
        tray20.setNext(tray10);
        tray10.setNext(tray5);
        tray5.setNext(lastTray);

        this.firstTray  = tray50;
    }

    public void process(int amount){
        firstTray.process(amount);
    }
}
