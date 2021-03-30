import java.io.*;
import java.util.ArrayList;


class Main {
  public static void main(String[] args) {
    //Create an array for people and input the data
    ArrayList<Person>people = new ArrayList<Person>();
    people.add(new Person("Zac", 22, "Green"));
    people.add(new Person("A", 87, "Pink"));
    people.add(new Person("B", 13, "Yellow"));
    people.add(new Person("C", 55, "Black"));
    people.add(new Person("D", 4, "Green"));
  
//Create and write a new file by starting try block
try {
  FileWriter toWriterFile;
  toWriteFile = new FileWriter("data.txt");
  BufferedWriter output = new BufferedWriter(toWriteFile);
  for (int i=0; i<people.size(); i++)
  {
    //get info from person file to write in
    output.write(people.get(i).getName());
    output.newLine();
    output.write(people.get(i).getAge());
    output.newLine();
    output.write(people.get(i).getColor());
    output.newLine();
    //flush BufferedWriter
    output.flush();
  }
  //close filewriter
  output.close();
}
//Create catch block writer
catch (IOException exception) {
  System.out.println("An Error has occured" + exception);
}
//open new try block for file reader
try{
  FilerReader myFile;
  myFile = new FileReader("data.txt");
  BufferedReader reader = new BufferedReader(myFile);
  while (reader.ready())
  {
    name=reader.readLine();
    age=reader.readLine();
    color=reader.readLine();
  //Left align and set length of text format
    System.out.printf("%-10s %-10s %-10s", name, age, color);
  }
  reader.close()
}
//Create catch block for reader
  catch (IOException exception) {
    System.out.println("An Error has occured" + exception);
}
}
}