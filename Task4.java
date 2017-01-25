/**
 * Created by Катя on 25.01.2017.
 */
public class Task4 {
    public static void f() throws NullPointerException {
    try{ g();}
    catch (MyException e){
        System.out.println("Exception in g()");
        throw new NullPointerException("New NullPointerException in task4");
    }

    }
    public static void g() throws MyException{
    throw new MyException("exception in task4");
    }
}
