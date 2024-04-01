class Student{
  private String name;
  private String address;
  public Student(String name, String address){
    this.name=name;
    this.address=address;
  }
  @Override
  public boolean equals(Object c){
    Student s=(Student) c;
    if(this.name.equals(s.name) && this.address.equals(s.address)){
      return true;
    }
    return false;
  }
}
public class Main{
  public static void main(String[] args){
    Student s1 = new Student("Thang", "Hatay");
    Student s2=new Student("Thang", "HaTay");
    System.out.println(s1.equals(s2));
  }
}