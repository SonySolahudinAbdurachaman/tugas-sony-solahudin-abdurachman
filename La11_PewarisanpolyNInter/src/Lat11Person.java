/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MY PC
 */
public class Lat11Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
         protected String name;
 protected String address;
 /**
 * Default constructor
 */
 public Lat11Person(){
 System.out.println("Inside Person:Constructor");
 name = "";
 address = "";
 }
 /**
 * Constructor dengan dua parameter
 */
 public Lat11Person( String name, String address) {
 this.name = name;
 this.address = address;
 }
 /**

 * Method accessor
 */
 public String getName() { 
    
    
return name;
 }
 public String getAddress() {
 return address;
 }
 public void setName(String name) {
 this.name = name;
 }
 public void setAddress(String add) {
 this.address = add;
 }
 } 
