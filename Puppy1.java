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
    int puppyAge;// SRP: atribut hanya menyimpan data usia anak anjing

    
    public Puppy1(String name) {
        // SRP: konstruktor hanya bertugas menginisialisasi/mencetak nama
        System.out.println("Name chosen is:" + name );
    }
    
    public void setAge( int age ) {
        // SRP: method ini khusus untuk mengubah umur (mutator)
        puppyAge = age;
    }
    
    public int getAge( ){
        // SRP: method ini khusus untuk mengambil umur (accessor)
        // OCP: bisa ditambah fitur yang lain tanpa mengubah method
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }
    
    public static void main(String [] args) {
        //object creation
        Puppy1 myPuppy = new Puppy1( "Tommy" );
        
        myPuppy.setAge( 2 );
       
        myPuppy.getAge( );
        // OCP: jika ditambah atribut lain (misalnya berat), kode ini tidak perlu diubah
        System.out.println("Variable value :" + myPuppy.puppyAge );
    }
}
