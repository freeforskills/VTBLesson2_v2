package Pregradi;

public class Wall implements Jumpable{
    private Activities action;
    private int visota;

    public Wall(int visota) {
        this.visota = visota;
        this.action = Activities.JUMP;
    }

    public Activities getAction() {
        return action;
    }

    @Override
    public int getValue() {
        return visota;
    }
}
