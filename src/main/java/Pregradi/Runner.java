package Pregradi;

public class Runner implements Runable{
    private String description;
    private Activities action;
    private int dlinna;

    public Runner(int dlinna) {
        this.description = "Беговая дорожка";
        this.dlinna = dlinna;
        this.action = Activities.RUN;
    }

    public Activities getAction() {
        return action;
    }

    @Override
    public void getinfo() {
        System.out.println("Препятствие типа: "+this.description+" длинной "+this.dlinna+" м.");
    }

    @Override
    public int getValue() {
        return dlinna;
    }
}
