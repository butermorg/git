package lab1;
public class Output {
    /*метод, сравнивающий исходную строку с полученной*/
    public void VerOut(String s){
    System.out.printf("\nyou entered: %s as password\n",s);
    if("password".equals(s))
        {
        System.out.printf( "password verification successful \n\n");
        }
    else
        {
        System.out.printf( "password verification faild \n\n");
        }
    }
    /*метод, выводящий результат с полученной строки*/
    public void ResOut(String s){
        System.out.printf("\nResult = %s\n",s);
    }
}    
