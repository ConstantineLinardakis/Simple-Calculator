import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("Welcome to a Simple Calculator!");
    
    Scanner scan = new Scanner(System.in);
    //Scanner restartScan = new Scanner(System.in); 

    int a,b,c,selection;
    //String restart = ""; 
    //restart = restartScan.nextLine();
    System.out.println("Please Enter Two Numbers Here:");
    a=scan.nextInt();
    b=scan.nextInt();
//Printing Selections
    System.out.println("Make Your Selection (Type the number.) :");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Division");
    System.out.println("4. Multiplication");

//Picking Selection
    selection=scan.nextInt();
    while(selection>4){
      System.out.println("Please Enter Correct Selection.");
      selection=scan.nextInt();
    }
//Calling Calculator 
    Main2 calc =new Main2();
//Addition
    if(selection==1){
    c=calc.add(a,b);
    System.out.println("Your Total Is :"+c);
//Subtraction
    }else if(selection==2){
    c=calc.sub(a,b);
    System.out.println("Your Total Is :"+c);
//Division
    }else if(selection==3){
    c=calc.div(a,b);
    System.out.println("Your Total Is :"+c);
//Multiplication
    }else if(selection==4){
    c=calc.multi(a,b);
    System.out.println("Your Total Is :"+c);
    }
//Asking to play again.
    System.out.println("Would you like to play again? (1=Yes) or (2=No)");
    selection=scan.nextInt();
    if(selection==1){
      
    }else if(selection==2){
      System.out.println("Okay thankyou for testing out my calculator!");
    }
  }
}
