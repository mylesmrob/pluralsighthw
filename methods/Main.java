package methods;

public class Main {


    public static void main(String[] args) {

        //Declaring and Calling
        method();

        //Parameter Passing
        int val1 = 25;
        int val2 = 10;
        swap(val1,val2);
        System.out.println(val1);
        System.out.println(val2);

        //CalcEngine with Methods and Command-line Arguments
        double[] left = {25,70,64,120};
        double[] right = {90,15,3,99};
        char[] chList = {'a','b','c','d'};
        double[] results = new double[chList.length];
        if(args.length == 0) {
            for (int i = 0; i < chList.length; i++) {
                results[i] = execute(chList[i], left[i], right[i]);
            }
            for (double currentResult : results) {
                System.out.println(currentResult);
            }
        }else if(args.length == 3){
            handleCommandLine(args);
        }else{
            System.out.println("Please provide an operation code and 2 numeric values");
        }
    }

    private static void handleCommandLine(String[] args) {
        char ch = args[0].charAt(0);
        double left = Double.parseDouble(args[1]);
        double right = Double.parseDouble(args[2]);
        double result = execute(ch, left, right);
        System.out.println(result);
    }

    static void method(){
        System.out.println("This is in a method");
    }
    static void swap(int i, int j){
        int k = i;
        i = j;
        j = k;
    }

    static  double execute(char ch, double left, double right){
        double result;
        switch (ch) {
            case 'a':
                result = left + right;
                break;
            case 'b':
                result = left - right;
                break;
            case 'c':
                result = left * right;
                break;
            case 'd':
                result = right != 0 ? left / right : 0;
                break;
            default:
                System.out.println("Error: " + ch);
                result = 0;
                break;
        }
        return result;
    }

}
