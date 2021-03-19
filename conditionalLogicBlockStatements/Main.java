package conditionalLogicBlockStatements;

public class Main {

    public static void main(String[] args) {

        //If-else and Block Statements
        double val1 = 50;
        double val2 = 25;
        double result = 0;
        char ch = 'a';
        /*if(ch == 'a') { //Original If-else statement
            result = val1 + val2;
        }else if(ch == 'b'){
            result = val1 - val2;
        }else if(ch == 'c'){
            result = val1 * val2;
        }else if(ch == 'd') {
            if (ch != 0) {
                result = val1 / val2;
            } else {
                System.out.println("Error: " + ch);
                result = 0;
            }
        }*/
        switch (ch){
            case 'a':
                result = val1 + val2;
                break;
            case 'b':
                result = val1 - val2;
                break;
            case 'c':
                result = val1 * val2;
                break;
            case 'd':
                result = val2 != 0 ? val1 / val2 : 0;
                break;
            default:
                System.out.println("Error: " + ch);
                result = 0;
                break;
        }
        System.out.println(result);

        //Logical vs Conditional
        int students = 500;
        int rooms = 10;
        if(rooms != 0 && students/rooms > 30){
            System.out.println("Crowded");
        }
    }
}
