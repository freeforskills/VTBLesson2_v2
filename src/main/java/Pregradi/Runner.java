package Pregradi;

public class Runner implements Runable{
    private Activities action;
    private int dlinna;

    public Runner(int dlinna) {
        this.dlinna = dlinna;
        this.action = Activities.RUN;
    }

    public Activities getAction() {
        return action;
    }

    @Override
    public int getValue() {
        return dlinna;
    }
}
