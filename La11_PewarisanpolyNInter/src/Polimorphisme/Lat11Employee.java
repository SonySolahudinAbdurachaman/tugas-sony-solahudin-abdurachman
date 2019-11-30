/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphisme;

/**
 *
 * @author MY PC
 */
public class Lat11Employee extends Lat11Person {
public String getName() {
 System.out.println("Employee Name:" +name);
 return name;
}
    public static void main(String[] args) {
        // TODO code application logic here
    
    Lat11Person ref;
 Lat11Student studentObject = new Lat11Student();
 Lat11Employee employeeObject = new Lat11Employee();

 ref = studentObject; //Person menunjuk kepada object Lat11Student

 String temp = ref.getName(); //getName dari Lat11Student class dipanggil
 System.out.println(temp);

 ref = employeeObject; //Person menunjuk kepada object Lat11Employee

 temp = ref.getName(); //getName dari Lat11Employee class dipanggil
 System.out.println(temp);
 }
}

