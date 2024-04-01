// import java.util.Scanner;
class person{
  private String name;
  private String address;
  public person(String name, String address){
    this.name=name;
    this.address=address;
  }
  public String getName(){
      return name;
    }
  public String getAddress(){
      return address;
    }
}
class Student extends person{
  private int credits;

  public Student(String name, String address, int credits){
    super(name, address);
    this.credits=credits;
  }
  public void study(){
    credits=credits+1;
  }
  public int getCredits(){
    return credits;
    // System.out.println(credits);
  }
}

public class Main1{
  public static void main(String[] args){
    Student s1= new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028",0);
    System.out.println(s1.getName() +" - "+s1.getAddress());
    System.out.println("Study credits "+s1.getCredits());
    s1.study();
    System.out.println("Study credits "+s1.getCredits());
  }
}