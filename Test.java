/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author User
 */

public class Test {
    public static void main (String[]args){
        
        for(int i=0;i<100;i++){
            SingletonTest test=SingletonTest.getInstance();
            test.hello();
        }
    }
    
}
