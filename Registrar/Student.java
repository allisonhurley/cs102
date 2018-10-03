/*
Allison Hurley 
October 3rd, 2018
CS 102 Lab 1 
*/

public class Student(){

   public String studentName; 
   public int studentIdNumber;
   public int numberOfCredits; 
   public int totalGradePoints;
   
   
   public Student(String name, int ID){
      studentName = name;
      studentIdNumber = ID; 
   }
   
   public String getStudentName(){
      return studentName; 
   }
   
   public int getStudentID(){
      return studentIdNumber; 
   }
   
   public boolean equals(Object obj){
      if obj == null{
         return false; 
      }
      else{
         if(obj.toString == ){
            return true; 
         }
         else{
            return false; 
         }
      }
   }
   
   public void setCredits(int credits){
      numberOfCredits = credits; 
   }
   
   public int getCredits(){
      return numberOfCredits; 
   }
   
   public void setGradePoints(int gradePoint){
      totalGradePoints = gradePoint; 
   }
   
   public int getGradePoint(){
      return totalGradePoints; 
   }
   
   public double getGPA(){
      double GPA = (double)totalGradePoints/(double)numberOfCredits;
      return GPA; 
   } 
   
   
}