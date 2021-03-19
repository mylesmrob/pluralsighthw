package dataTypes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Formatting Dates
        LocalDate today = LocalDate.now();
        System.out.println(today);
        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern(("MM-dd-yyyy"));
        System.out.println(today.format(usDateFormat));

        //Date Arithmetic
        double[] left = {25, 70, 64, 120};
        double[] right = {90, 15, 3, 99};
        char[] chList = {'a', 'b', 'c', 'd'};
        double[] results = new double[chList.length];
        if (args.length == 0) {
            for (int i = 0; i < chList.length; i++) {
                results[i] = execute(chList[i], left[i], right[i]);
            }
            for (double currentResult : results) {
                System.out.println(currentResult);
            }
        }else if(args.length == 1 && args[0].equals("interactive")){
            executeInteractively();
        }else if (args.length == 3) {
            handleCommandLine(args);
        } else {
            System.out.println("Please provide an operation code and 2 numeric values");
        }
    }

    static void executeInteractively(){
        System.out.println("Enter an operations and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char ch = chFromString(parts[0]);
        if(ch == 'w'){
            handWhen(parts);
        }else {
            double left = valueFromWord(parts[1]);
            double right = valueFromWord(parts[2]);
            double result = execute(ch, left, right);
            displayResult(ch, left, right, result);
        }
    }

    private static void handWhen(String[] parts) {
        LocalDate startDate = LocalDate.parse(parts[1]);
        long daysToAdd = (long) valueFromWord(parts[2]);
        LocalDate newDate = startDate.plusDays(daysToAdd);
        String output = String.format("%s plus %d days is %s",startDate,daysToAdd,newDate);
        System.out.println(output);
    }

    private static void displayResult(char ch, double left, double right, double result) {
        char symbol = symbolFromCh(ch);
        String output = String.format("%.3f %c %.3f = %.3f", left, symbol, right, result);
        System.out.println(output);
    }

    private static char symbolFromCh(char ch) {
        char[] chList = {'a', 'b', 'c', 'd'};
        char[] symobls = {'+', '-', '*', '/'};
        char symbol = ' ';
        for (int index = 0; index < chList.length; index++) {
            if (ch == chList[index]) {
                symbol = symobls[index];
                break;
            }
        }
        return symbol;
    }

    private static void handleCommandLine(String[] args) {
        char ch = args[0].charAt(0);
        double left = Double.parseDouble(args[1]);
        double right = Double.parseDouble(args[2]);
        double result = execute(ch, left, right);
        System.out.println(result);
    }

    static double execute(char ch, double left, double right) {
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

    static char chFromString(String operationName) {
        char ch = operationName.charAt(0);
        return ch;
    }

    static double valueFromWord(String word) {
        String[] numberWords = {"zero", "one", "two", "Three", "four", "five", "six", "seven", "eight", "nine"};
        double val = -1;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                val = index;
                break;
            }
        }
        if(val == -1){
            Double.parseDouble(word);
        }
        return val;
    }
}
