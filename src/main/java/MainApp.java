import Pregradi.Pregradi;
import Uchastniki.FunnyStarts;
import Uchastniki.Cat;
import Uchastniki.Human;
import Uchastniki.Robot;
import Pregradi.Wall;
import Pregradi.Runner;

public class MainApp {
    public static void main(String[] args) {
        Pregradi[] msvPrgrd = {
                new Runner(3000),
                new Wall(30),
                new Wall(150),
                new Runner(8000)
        };

        FunnyStarts[] msvUchtnkv = {
                new Cat("Мурзик",5000,200),
                new Robot("Бендер",100000),
                new Human("Васян",10000,80)
        };

        for (FunnyStarts uchastnik : msvUchtnkv) {
            for (Pregradi pregrada : msvPrgrd) {
                if (uchastnik.getStatus()) {
                    uchastnik.getStart(pregrada);
                } else break;
            }
            System.out.println();
        }
    }
}
