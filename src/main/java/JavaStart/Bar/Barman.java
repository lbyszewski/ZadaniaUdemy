package JavaStart.Bar;

import java.util.ArrayList;
import java.util.List;

public class Barman {



        public Drink creatDrink(String nameofDrink , int portionA, int portionB, int portionC){
                Drink drink = new Drink();
                drink.getIngregient().getName();
                drink.getIngregient().getMininliters(portionA);
                drink.getIngregient().getMininliters(portionB);
                drink.getIngregient().getMininliters(portionC);

            return drink;


        }
        public  void printDrink(){
            System.out.println("podany drink nosi nazwę: "    );
        }
}
