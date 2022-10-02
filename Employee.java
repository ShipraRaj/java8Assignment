public class Employee{
String firstName;
String lastName;
Long salary;
String city;

public String getFirstName(){
return firstName;
}

public void setFirstName(String firstName){
this.firstName=firstName;
}

public String getLastName(){
return lastName;
}

public void setLastName(String lastName){
this.lastName=lastName;
}

public Long getSalary(){
return salary;
}
public void setSalary(Long salary){
this.salary=salary;
}
public String getCity(){
return city;
}
public void setCity(String city){
this.city=city;
}
public 	Employee(String firstName,String lastName, Long salary,String city){
super();
this.firstName=firstName;
this.lastName=lastName;
this.salary=salary;
this.city=city;
}

