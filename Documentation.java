import java.util.Scanner;
public class Documentation{
  
  public static String weapon(int i){
    switch(i){
      case 1:
        System.out.println("You got a knife!");
        return "knife";
        
      case 2:
        System.out.println("You got a sword!");
        return "sword";
        
      case 3:
        System.out.println("You got a guy!");
        return "guy";
        
      default:
        System.out.println("default");
        return "wrong";
        
    }
  }
  public static int monster(String yourweapon){
    if(yourweapon == "knife"){
      return 20;
    }
    else if(yourweapon == "sword"){
      return 50;
    }
    else if(yourweapon == "guy"){
      return 100;
    }
    else{
      return 0;
    }
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please tell me your name ,adventurer!");
    
    String name;String g;
    name = input.next();
    System.out.println("Hello, "+ name +" now you maybe will save this world !");
    System.out.println("ok,now you should give me your lunck number!input a number 1-9!");
      int n;
    n = input.nextInt();
    int mynum = 1 + (int)(Math.random()*(10-1));
    if(n>mynum){
     g = weapon(1);
    }
    else if(n < mynum){
     g = weapon(2);
    }
    else if(n == mynum){
      g = weapon(3);
    }
    else{
     g = weapon(0);
    }
    int m;
    m = monster(g);
    if(m == 20){
      System.out.println("You just drop it " + m + "% " + "blood!" );
    }
    else if(m == 50){
      System.out.println("You  drop it " +m+ "% " + "blood! Come on" );
    }
    else{
    System.out.println("You just drop it " + m + "% " + "blood!You save the world" );
    }
    }
  
}