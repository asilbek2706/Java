import static EightProgram.Eight.gradesDisplay;
import static FifthProgram.FifthProgram.passOrNot;
import static FirstProgram.FirstProgram.positiveNegative;
import static FourthProgram.FourthProgram.greatestNumber;
import static Menu.Menu.menu;
import static MenuNumber.MenuNumber.getMenuNumber;
import static NinethProgram.Nine.weeks;
import static SecondProgram.SecondProgram.evenOdd;
import static SeventhProgram.Seven.greatestTree;
import static SixthProgram.SixthProgram.zeroOrNot;
import static ThirdProgram.ThirdProgram.vote;
import static calculator.Ten.calculator;

public class Exercises {
    public void start(){
        boolean b = true;
        while (b) {
            menu();
            int n = getMenuNumber();

            switch (n) {
                case 1:
                    positiveNegative();
                    break;
                case 2:
                    evenOdd();
                    break;
                case 3:
                    vote();
                    break;
                case 4:
                    greatestNumber();
                    break;
                case 5:
                    passOrNot();
                    break;
                case 6:
                    zeroOrNot();
                    break;
                case 7:
                    greatestTree();
                    break;
                case 8:
                    gradesDisplay();
                    break;
                case 9:
                    weeks();
                    break;
                case 10:
                    calculator();
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("Mazgi, invalid input!");
            }
            System.out.println("You are leaving the program, Mazgi");
        }
    }
}
