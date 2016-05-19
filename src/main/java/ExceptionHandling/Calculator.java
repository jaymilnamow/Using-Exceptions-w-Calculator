package ExceptionHandling;

/**
 * Created by jaymilnamow on 5/18/16.
 */
public class Calculator {

    public static double add(double a,double b){

        return a+b;
    }

    public static double subtract(double a,double b){

        return a-b;
    }

    public static double multiply(double a, double b){

        return a*b;
    }

/*
    public static double divide(double a, double b) throws Exception{
        if(b == 0) {
            throw new Exception();
        }
            return a/b;
    }

    //previous code showing exception
*/
    public static double divide(double a, double b) throws DivisionByZeroException{
        if(b == 0) {
            throw new DivisionByZeroException();
        }
        return a/b;
    }


}

