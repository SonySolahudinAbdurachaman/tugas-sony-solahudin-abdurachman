/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MY PC
 */
public class Lat10StudentRecordExample {

     public static void main(String[] args) {
 //membuat 3 object Lat10StudentRecord
 Lat10StudentRecord annaRecord = new Lat10StudentRecord();
 Lat10StudentRecord beahRecord = new Lat10StudentRecord();
 Lat10StudentRecord crisRecord = new Lat10StudentRecord();
 //versi baru
 Lat10StudentRecord recordAnna = new Lat10StudentRecord("Candra");
 Lat10StudentRecord recordBeah = new Lat10StudentRecord("Bagus",
 "Malang");
 Lat10StudentRecord recordCris = new Lat10StudentRecord(80,90,100);
 //memberi nama siswa
 annaRecord.setName("Anna");
 beahRecord.setName("Beah");
 crisRecord.setName("Cris");
 //menampilkan nama siswa "Anna"
 System.out.println(annaRecord.getName());
 //menampilkan jumlah siswa
 System.out.println("Count="+Lat10StudentRecord.getStudentRecord());
 Lat10StudentRecord anna2Record = new Lat10StudentRecord();
 anna2Record.setName("Anna");
 anna2Record.setAddress("Philipina");
 anna2Record.setAge(15);
 anna2Record.setMathGrade(80);
 anna2Record.setEnglishGrade(95.5);
 anna2Record.setScienceGrade(100);
 //overload method
 anna2Record.print(anna2Record.getName());
 anna2Record.print(anna2Record.getEnglishGrade(),
 anna2Record.getMathGrade(),
 anna2Record.getScienceGrade());
 recordAnna.print(recordAnna.getName());
 }
 } 

