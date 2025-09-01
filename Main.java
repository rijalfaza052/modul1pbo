/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan3;

/**
 *
 * @author faza
 */
public class Main {
    static void myStaticMethod(){
        System.out.println("Static metods can be called without creating obbjects");
    }
    //Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creatting objects");
    }
    
    //Main metod
    public static void main(String [] args){
        myStaticMethod();//call the static method
        //myPublicMethod(); this would output an error
        
        Main myObj = new Main();//create an object of Main
        myObj.myPublicMethod();//call the public method
    }
}