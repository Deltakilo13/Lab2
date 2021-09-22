
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkuzm
 */
public class Utils {
    
 
   public static int getcube(int num)
   {
      return num * num * num;
   }
public static boolean isPrime(int x){
    
    for(int i=2; i<x;i++){
        if(x%i == 0){
            return false;
        }
    }
    return true;
   
}

public int getIntFromFIle(String flName){ throws FIleNotFOundExecption{
    
    int num;
    
    Scanner sc = new Scanner(new File(flName));
    num = sc.nextint();
    return num;
}
}

           
    
    

