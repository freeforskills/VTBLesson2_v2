import Pregradi.*;
import Uchastniki.*;


public class MainApp {
    public static void main(String[] args) {
        Pregradi[] msvPrgrd = {
                new Runner(3000),
                new Wall(30),
                new Water(300),
                new Wall(150),
                new Runner(8000)
        };

        FunnyStarts[] msvUchtnkv = {
                new Cat("Мурзик",5000,200),
                new Robot("Бендер",100000),
                new Human("Васян",10000,80,500)
        };


        for (FunnyStarts uchastnik : msvUchtnkv) {
            uchastnik.introduce();
            for (Pregradi pregrada : msvPrgrd) {
                if (uchastnik.getStatus()) {
                    System.out.println();
                    pregrada.getInfo();
                    uchastnik.getStart(pregrada);
                } else break;
            }
            System.out.println();
        }
    }
}
