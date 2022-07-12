package Pregradi;

public class Wall implements Jumpable{
    private String description;
    private Activities action;
    private int visota;

    public Wall(int visota) {
        this.description = "Стена";
        this.visota = visota;
        this.action = Activities.JUMP;
    }

    public Activities getAction() {
        return action;
    }

    @Override
    public void getinfo() {
        System.out.println("Препятствие типа: "+this.description+" высотой "+this.visota+" cм.");
    }

    @Override
    public int getValue() {
        return visota;
    }
}
