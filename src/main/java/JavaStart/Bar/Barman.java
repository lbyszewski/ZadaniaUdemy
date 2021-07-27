package JavaStart.Bar;

import java.util.ArrayList;
import java.util.List;

public class Barman {



        public Drink creatDrink(String nameofDrink , int portionA, int portionB, int portionC){
                Drink drink = new Drink();
                drink.getIngregient().setName(nameofDrink);
                drink.getIngregient().setMininliters(portionA);
                drink.getIngregient().setMininliters(portionB);
                drink.getIngregient().setMininliters(portionC);

            return drink;


        }
        public  void printDrink(){
            System.out.println("podany drink nosi nazwę: "    );
        }
}
