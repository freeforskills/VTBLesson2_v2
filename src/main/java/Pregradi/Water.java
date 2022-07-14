package Pregradi;

public class Water implements Swimable{
    private String description;
    private Activities action;
    private int distance;

    public Water(int distance) {
        this.description = "Вода";
        this.distance = distance ;
        this.action = Activities.SWIM;
    }

    @Override
    public int getValue() {
        return distance;
    }

    @Override
    public Activities getAction() {
        return action;
    }

    @Override
    public void getInfo() {
        System.out.println("Препятствие типа: "+this.description+" с дистанцией "+this.distance+" м.");
    }
}
