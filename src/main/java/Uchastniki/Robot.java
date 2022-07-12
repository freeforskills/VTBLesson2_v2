package Uchastniki;

import Pregradi.Pregradi;
import Pregradi.Runable;

public class Robot implements Run{
    String type;
    String name;
    private int status;
    int maxDistance;
    int maxVisota;

    public Robot(String name,int maxDistance) {
        this.type = "Робот";
        this.name = name;
        this.status = 1;
        this.maxDistance = maxDistance;
        this.maxVisota = 0;
    }

    @Override
    public void getStart(Pregradi pregrada) {
        switch (pregrada.getAction()){
            case RUN -> this.run((Runable) pregrada);
            case JUMP -> this.jump();
        }
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

    private void jump(){
        System.out.println("Робот не умеет прыгать");
        this.status = 0;
    }

    @Override
    public boolean getStatus() {
        return (this.status==1);
    }
}
