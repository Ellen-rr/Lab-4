/*
Lab 4
Partners: Mengying Yu and Ted Henschen
Date: 9/18/2020
*/
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random originalRandomNum = new Random();//create random class
    int randomNum = originalRandomNum.nextInt(50) + 1;//generate a whole number between 1 and 50
    System.out.println(" The Random number is: " + randomNum);//printline
  if ( randomNum < 25 ) {
    while ( randomNum >= 0) {
      System.out.println(randomNum);
      randomNum --;
    }
    System.out.println("Ahoy mateys!");
  }
  else if (randomNum > 25 && randomNum < 42) {
    while ( randomNum >= 0) {
      System.out.println(randomNum);
      randomNum --;
    }
    System.out.println("Cannonball!");
        }
  else {
    while ( randomNum >= 0) {
      System.out.println(randomNum);
      randomNum --;
    }
    System.out.println("Blast off!");
    }
    
    



  }
}