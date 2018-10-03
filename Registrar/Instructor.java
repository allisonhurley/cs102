public class Instructor(){
   
   public String instructorName; 
   public int facultyIdNum; 
   public String department; 
   
   public Instructor(String name, int ID){
      instructorName = name; 
      facultyIdNum = ID; 
   }
   
   public void setDepartment(String dpt){
      department = dpt; 
   }
   
   public String getDepartment(){
      return department; 
   }
}