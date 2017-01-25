import java.lang.*;
import java.lang.Exception;
import java.sql.SQLDataException;
import java.util.Random;


/**
 * Created by Катя on 24.01.2017.
 */
public class Main {
    static void throwsException() throws Exception1Task5, Exception2Task5, Exception3Task5{
        switch(new Random().nextInt(3)){
            case 0 : throw new Exception1Task5();
            case 1 : throw new Exception1Task5();
            case 2 : throw new Exception1Task5();

        }
    }

    public static void main(String[] args) throws Exception,Exception1Task5, Exception2Task5, Exception3Task5 {
        System.out.println("TASK1");
        Exception exception = new Exception("Some exception");
        try {
            throw exception;
        } catch (Exception e1) {
            System.out.println(e1);
        } finally {
            System.out.println("finally");
        }
        System.out.println("TASK2");

        MyException myException = new MyException("My new exception");
        try {
            throw myException;
        } catch (MyException e2) {
            System.out.println(e2);
        } finally {
            System.out.println("finally myException ");
        }

        //task3
        System.out.println("TASK3");
        try {
            MyException a = null;
            a.showSTR();
        } catch (Throwable e) {
            System.out.println("NullPointerException");
        }
        //task4
        System.out.println("TASK4");
        try {
            Task4.f();
            Task4.g();
        } catch (MyException ex1) {
            System.out.println("Main MyException");
        } catch (NullPointerException ex2) {
            System.out.println("Main NullPointerException");
        }
        //task5
        System.out.println("TASK5");
        try{
            throwsException();
        } catch(Exception1Task5| Exception2Task5| Exception3Task5 exceptionTask5){
            System.out.println("Exception appeared in task 5 "+ exceptionTask5);
        }
    }


}

