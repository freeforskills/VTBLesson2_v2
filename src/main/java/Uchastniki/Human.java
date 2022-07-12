package Uchastniki;

import Pregradi.Pregradi;
import Pregradi.Jumpable;
import Pregradi.Runable;


public class Human implements Run, Jump {
    String type;
    String name;
    private int status;
    int maxDistance;
    int maxVisota;

    public Human(String name, int maxDistance, int maxVisota) {
        this.type = "Чел";
        this.name = name;
        this.status = 1;
        this.maxDistance = maxDistance;
        this.maxVisota = maxVisota;
    }

    @Override
    public void getStart(Pregradi pregrada) {
        switch (pregrada.getAction()){
            case RUN -> this.run((Runable) pregrada);
            case JUMP -> this.jump((Jumpable) pregrada);
        }
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
    public boolean getStatus() {
        return (this.status==1);
    }
}
