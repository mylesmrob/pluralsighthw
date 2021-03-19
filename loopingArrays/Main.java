package loopingArrays;

public class Main {

    public static void main(String[] args) {

        //Do-while loop
        int val = 5;
        do{
            System.out.print(val);
            System.out.print(" * 2 = ");
            val *= 2;
            System.out.println(val);
        }while(val < 25);

        //While loop
        int i = 1;
        while(i < 100){
            System.out.println(i);
            i *= 2;
        }

        //For loop
        for(i = 1; i < 100; i *= 2){
            System.out.println(i);
        }

        //Arrays and For-each loop
        double[] left = {25,70,64,120};
        double[] right = {90,15,3,99};
        char[] chList = {'a','b','c','d'};
        double[] results = new double[chList.length];
        for(i = 0; i < chList.length; i++) {
            switch (chList[i]) {
                case 'a':
                    results[i] = left[i] + right[i];
                    break;
                case 'b':
                    results[i] = left[i] - right[i];
                    break;
                case 'c':
                    results[i] = left[i] * right[i];
                    break;
                case 'd':
                    results[i] = right[i] != 0 ? left[i] / right[i] : 0;
                    break;
                default:
                    System.out.println("Error: " + chList[i]);
                    results[i] = 0;
                    break;
            }
        }
        for(double currentResult : results){
            System.out.println(currentResult);
        }
    }
}
