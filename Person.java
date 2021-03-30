class Person {
  private String name,color;
  private int age;
  //Create Constructor
  Person(String a, int b, String c)
  {
    name=a;
    age=b;
    color=c;

  }
  //Create Accessor Methods
  String getName()
  {
    return name;
  }
  int getAge()
  {
    return age;
  }
  String getColor()
  {
    return color;
  }

}