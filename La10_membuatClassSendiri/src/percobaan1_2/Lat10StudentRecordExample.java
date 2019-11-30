/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1_2;

/**
 *
 * @author MY PC
 */
public class Lat10StudentRecordExample {

     
 public static void main( String[] args ){
 //membuat 3 object Lat10StudentRecord
 Lat10StudentRecord annaRecord = new Lat10StudentRecord();

 Lat10StudentRecord beahRecord = new Lat10StudentRecord();

 Lat10StudentRecord crisRecord = new Lat10StudentRecord();

 //Memberi nama siswa
 annaRecord.setName("Anna");
 beahRecord.setName("Beah");
 crisRecord.setName("Cris");
 //Menampilkan nama siswa “Anna”
 System.out.println( annaRecord.getName() );
 //Menampilkan jumlah siswa
 System.out.println("Count="+Lat10StudentRecord.getStudentCount()
 );
 }
 } 
   