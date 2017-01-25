/**
 * Created by Катя on 25.01.2017.
 */
public class MyException extends Throwable{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public MyException(String str) {
        this.str = str;
    }

    public void showSTR(){
        System.out.println(str);
    }

}
