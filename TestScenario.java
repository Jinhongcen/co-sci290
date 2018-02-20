/*
  jinhong cen
  Co Sci 290
*/  

public class TestScenario{
    public static void main(String[] args){
    
    int minimun = 1;
      int maximun = 100;
      int randomNum = minimun + (int)(Math.random() * maximun);
      if(randomNum >= 90){
        System.out.println("You get a Hamburger!");}
        else if(randomNum <=80 && randomNum >=70){
          System.out.println("You get a Biscuits.");
        }
      else if(randomNum <=60 && randomNum >=50){
          System.out.println("You get a water.");
        }
      else if(randomNum <=40 && randomNum >=30){
          System.out.println("You get a bug.");
        }
        else{
          System.out.println("You're hungry,gonna die,go to find something eat.");
        }
      
      }
      }
    

