/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puppy;

/**
 *
 * @author faza
 */
public class Puppy1 {
    int puppyAge;
    
    public Puppy1(String name) {
        System.out.println("Name chosen is:" + name );
    }
    
    public void setAge( int age ) {
        puppyAge = age;
    }
    
    public int getAge( ){
        System.out.println("Puppy's age is :" + puppyAge );
        return 0;
    }
    
    public static void main(String [] args) {
        //object creation
        Puppy1 myPuppy = new Puppy1( "Tommy" );
        //call class method to set puppy's age
        myPuppy.setAge( 2 );
        //call another class method to get puppy's age
        myPuppy.getAge( );
        
        System.out.println("Variable value :" + myPuppy.puppyAge );
    }
}
