package Uchastniki;

import Pregradi.*;


public interface FunnyStarts {
    public default void getStart(Pregradi pregrada){
        switch (pregrada.getAction()){
            case RUN -> this.run((Runable) pregrada);
            case JUMP -> this.jump((Jumpable) pregrada);
            case SWIM -> this.swim((Swimable) pregrada);
        }
    }

    public void jump(Jumpable pregrada);

    public void run(Runable pregrada);

    public void swim(Swimable pregrada);

    public boolean getStatus();

    public void introduce();
}
