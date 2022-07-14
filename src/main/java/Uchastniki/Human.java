package Uchastniki;

import Pregradi.*;


public class Human implements FunnyStarts {
    private String type;
    private String name;
    private int status;
    private int maxDistance;
    private int maxVisota;
    private int maxSwim;

    public Human(String name, int maxDistance, int maxVisota, int maxSwim) {
        this.type = "Чел";
        this.name = name;
        this.status = 1;
        this.maxDistance = maxDistance;
        this.maxVisota = maxVisota;
        this.maxSwim = maxSwim;
    }
    @Override
    public void jump(Jumpable pregrada) {
        int visota = pregrada.getValue();
        if (visota>this.maxVisota){
            System.out.println(this.type+ " не в силах перепрыгнуть такую высоту "+visota);
            this.status = 0;
        } else if (visota<this.maxVisota) {
            System.out.println(this.type+ " перепрыгнул стену высотой "+ visota +", а мог бы прыгнуть выше еще на "+(this.maxVisota-visota));
        } else {System.out.println(this.type+ " перепрыгнул стену высотой "+ visota);}
    }

    @Override
    public void run(Runable pregrada) {
        int distance = pregrada.getValue();
        if (distance>this.maxDistance){
            System.out.println(this.type+ " не в силах пробежать расстояние "+distance);
            this.status = 0;
        } else if (distance<this.maxDistance) {
            System.out.println(this.type+ " пробежал "+ distance +" и мог бы пробежать еще "+(this.maxDistance-distance));
        } else {System.out.println(this.type+ " пробежал "+ distance);}
    }

    @Override
    public void swim(Swimable pregrada) {
        int distance = pregrada.getValue();
        if (distance>this.maxSwim){
            System.out.println(this.type+ " не в силах проплыть расстояние "+distance);
            this.status = 0;
        } else if (distance<this.maxSwim) {
            System.out.println(this.type+ " проплыл "+ distance +" и мог бы проплыть еще "+(this.maxSwim-distance));
        } else {System.out.println(this.type+ " проплыл "+ distance);}
    }

    @Override
    public boolean getStatus() {
        return (this.status==1);
    }

    @Override
    public void introduce() {
        System.out.println(this.type + " по имени "+this.name+" может пробежать "+this.maxDistance
                +" м. и подпрыгнуть на высоту "+this.maxVisota+" см.");
    }
}
