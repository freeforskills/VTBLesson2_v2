package Uchastniki;

import Pregradi.*;


public class Robot implements FunnyStarts {
    private String type;
    private String name;
    private int status;
    private int maxDistance;
    private int maxVisota;
    private int maxSwim;

    public Robot(String name,int maxDistance) {
        this.type = "Робот";
        this.name = name;
        this.status = 1;
        this.maxDistance = maxDistance;
        this.maxVisota = 0;
        this.maxSwim = 0;
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
        System.out.println("Робот не умеет плавать");
        this.status = 0;
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

    @Override
    public void introduce() {
        System.out.println(this.type + " по имени "+this.name+" может пробежать "+this.maxDistance
                +" м. и подпрыгнуть на высоту "+this.maxVisota+" см.");
    }
}
