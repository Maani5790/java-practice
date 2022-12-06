import java.util.Scanner;

/**
 * hello
 */
public class hello {

    // static int sum(int a, int b){
    // return a + b;
    // }

    public static void main(String[] args) {
        // System.out.println("test");
        // String name = "maani";
        // System.out.println(name);

        // int a = 23 , x=23, y=89;
        // System.out.println(a);
        // System.out.println(x);
        // System.out.println(y);

        // boolean name = true;
        // System.out.println(name);

        // double d = 12344.23333d;
        // System.out.println(d);

        // int num1 = 23 , num2 = 20;
        // System.out.println("the value of num1 and num2 is");
        // System.out.println(num1 + num2);
        // System.out.println(num1++);
        // System.out.println(++num1);
        // System.out.println(num1);

        // int num3 = 20;
        // num3 +=20;
        // System.out.println(num3);

        // int num1 = 30;
        // num1 *= 2;
        // num1 /= 15;
        // num1 %= 15;
        // System.out.println(num1);

        // Scanner scan = new Scanner(System.in);
        // System.out.println("enter input");
        // System.out.println("enter age");
        // String input = scan.nextLine();
        // String input = scan.next();
        // int input = scan.nextInt();
        // System.out.println(input);

        // String name = "rehman";
        // System.out.println(name.length());
        // System.out.println(name);
        // System.out.println("hello my name is" + " " + name);
        // System.out.println(name.contains("r"));
        // System.out.println(name.contains("v"));
        // System.out.println(name.charAt(3));
        // System.out.println(name.endsWith("an"));
        // System.out.println(name.endsWith("xx"));
        // System.out.println(name.indexOf("man"));

        // int num1 = 20, num2 = 40;
        // System.out.println(Math.max(num1, num2));
        // System.out.println(Math.min(num1, num2));
        // System.out.println(Math.sqrt(40));
        // System.out.println(Math.sqrt(81));
        // System.out.println(Math.abs(-81));
        // System.out.println(Math.abs(81));
        // System.out.println(Math.random());
        // System.out.println(4+(4-8)*Math.random());

        // Scanner scan = new Scanner(System.in);
        // System.out.println("enter ur age");
        // int age = scan.nextInt();

        // if(age>20){
        // System.out.println("ur adult");
        // }
        // else if(age>5){
        // System.out.println("ur not kid");
        // }
        // else{
        // System.out.println("ur kid");
        // }

        // switch(age){
        // case 12 :
        // System.out.println("ur 12 years old");
        // break;

        // case 30 :
        // System.out.println("ur adult");
        // break;

        // case 2 :
        // System.out.println("ur kid");

        // default :
        // System.out.println("thats it");

        // }

        // Scanner scan = new Scanner(System.in);
        // System.out.println("enter ur day");
        // int days = scan.nextInt();

        // switch(days){
        // case 1 :
        // System.out.println("monday");
        // break;

        // case 2 :
        // System.out.println("tuesday");
        // break;

        // case 3 :
        // System.out.println("wednesday");
        // break;

        // case 4 :
        // System.out.println("thursday");
        // break;
        // case 5 :
        // System.out.println("friday");
        // break;

        // case 6 :
        // System.out.println("saturday");
        // break;

        // case 7 :
        // System.out.println("sunday");

        // default :
        // System.out.println("thats it");

        // }

        // int i = 0;
        // while(i<10){
        // System.out.println(i);
        // i += 1;
        // }
        // int j = 0;
        // do{
        // System.out.println(j);
        // j += 1;
        // }while(j<10);

        // String[] name = { "rehman", "maani", "azlan", "hamid" };
        // name[1] = "abdul";
        // System.out.println(name[1]);
        // for (int i = 0; i < name.length; i++) {
        // System.out.println(name[i]);
        // }

        // System.out.println("this is for each loop");
        // for (String value : name) {
        // System.out.println(value);

        // }

        // int [] [] matrix = {{1,2,3,4}, {6,7,8,0}};
        // System.out.println(matrix[0][1]);
        // String [] cars = {"ferrari", "mclaren","lamborgini"};
        // try{
        // System.out.println(cars[4]);
        // }
        // catch(Exception e){
        // System.out.println(e);
        // }
        // System.out.println("maani");
        // System.out.println(sum(5, 7));
        float number_1, number_2;
        System.out.println("Enter first number");

        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();

        System.out.println("Enter second number");
//        Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for " +
                        "subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Invalid input");

        }
    }
}
