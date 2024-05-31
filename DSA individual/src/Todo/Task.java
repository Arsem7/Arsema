package Todo;

public class Task {
String Title;
String Description;
Boolean Completed;

    public  Task(String Title,String  Description){
     this.Title= Title;
     this.Description = Description;
     this.Completed = false;

}
public String getTitle(){
     return this.Title;
}
public String getDescription(){
     return this.Description;
}
public Boolean isCompleted(){return this.Completed;}
public void markCompleted(){this.Completed = true;}
}
