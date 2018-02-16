/*
 Sina Tuy 
 Co Sci 290
 
 Demo topics on:
   - increment/decrement operators
   - augmented assignment operators
*/
public class DemoBoolean{
public static void main(String[] args){
  //line 17 and line 18 are equivalent
  int num = 1;
  num = num + 1;//increment num by 1
  num++;//post-increment
  ++num;//pre-increment
  
  num = 1;
  int count = ++num;//pre-increment,count 2,num 2
  System.out.println("count" + count +" num "+num);
  num =1;
  count = num++;//post-increment, count 1,num 2
  System.out.println("count" + count +" num "+num);
  
  count = num--;//post-decrement
  count = --num;//pre-decrement
  
  //examples of augmented assignment operators
  num += 2;//equivalent to => num = num +2;
  num *= 2;//equivalent to => num = num *2;
  num /= 2;//num = num / 2;
  num -= 2;//num = num - 2;
  num = 2;
  double num2;
  num2 =3.0;
  System.out.println("double wins: " + num * num2);
  System.out.println("Casting a double to int : "+(int) num2);//lose the decimal part
  System.out.println("Casting an int to a double "+(double)num);//truns the 2 into 2.0
  System.out.println("Casting a char to an int "+(int)'c');//truns the c into 99 because of ASCLL
       
  
  int numberOfZombies = 3;
  if (numberOfZombies < 5){  //evaluates true
    System.out.println("You might survive this apocalypse.");
  }
  else{
    System.out.println("You might NOT survive this apocalypse. ");
  }
  
  //Generating a random number
  //Math.pow(3,2);3^2
  System.out.println(Math.random());//random number between 0 and 1
  //minimum + Math.random()* maxium
  System.out.println(1+(int)(Math.random()*10));
  
  
  //formula for any range use ==> Min + (Math.random()*(Max-Min))
  int chanceOfSurviving = 1 + (int)(Math.random()*(10-1));
  
  if(chanceOfSurviving <= 3){
    System.out.println("You made it alive");
  }
  else{
    System.out.println("Game over!");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
  
}