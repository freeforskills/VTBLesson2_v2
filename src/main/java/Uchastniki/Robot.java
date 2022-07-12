package Uchastniki;

import Pregradi.Pregradi;
import Pregradi.Runable;
import Pregradi.Jumpable;

public class Robot implements FunnyStarts {
    private String type;
    private String name;
    private int status;
    private int maxDistance;
    private int maxVisota;

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
            case JUMP -> this.jump((Jumpable) pregrada);
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

    @Override
    public void jump(Jumpable pregrada) {
        System.out.println("Робот не умеет прыгать");
        this.status = 0;
    }

    @Override
    public boolean getStatus() {
        return (this.status==1);
    }
}
