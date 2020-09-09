package lab1;
import java.util.Scanner;

public class Input {
    public String inpval="default";
   
    public void Inp(){
    /*Подключение метода консольного ввода
    и присваивание введенной строки объекту
    "inpval"*/
    Scanner in = new Scanner(System.in);
    System.out.print("Input a password: ");
    inpval = in.nextLine();
    
    }
    public void Sum(){
    /*Подключение метода консольного ввода
    и присваивание суммы двух введенных
    строк объекту "inpval"*/
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        inpval = in.next();
        System.out.print("Input a number 2: ");
        inpval = Integer.toString(Integer.parseInt(inpval)+in.nextInt());
       
    }
    public void Ver(){
        /*вызов метода VerOut класса Output для проверки введенного пароля*/
    Output out = new Output();
    out.VerOut(inpval);
 
    }
    public void Result(){
        /*вызов метода ResOut класса Output для вывода результата*/
        Output out = new Output();
    out.ResOut(inpval);
    }
}
