package Uchastniki;

import Pregradi.Pregradi;
import Pregradi.Jumpable;
import Pregradi.Runable;

public interface FunnyStarts {
    public void getStart(Pregradi pregrada);

    public void jump(Jumpable pregrada);

    public void run(Runable pregrada);

    public boolean getStatus();
}
