import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class StudentData                     //main class
{
  public static void main(String args[]) throws IOException                  //exception handling
  {
         System.out.println("Enter the numbers of students:");
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
         int n=Integer.parseInt(in.readLine());

         Student[]  students = new Student[n];

         //Student[]  S=new Student[n];                      // array of objects declared and defined
         for (int i = 0; i < students.length; i++)       {

               System.out.println("Enter the Details of Student no: "+(i+1));             //reading data form the user
               System.out.println("Name: ");
               String naam=in.readLine();
               System.out.println("ID no: ");
               int idno=Integer.parseInt(in.readLine());
               System.out.println("DOB: ");               
               String dob=(in.readLine());


              students[i]=new Student(naam,idno,dob);                          

              File studentFile = new File("StudentData.txt");
              try {
              FileOutputStream fileOutput = new FileOutputStream(studentFile);
              ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
              objectOutput.writeObject(students);

              students = null;

              FileInputStream fileInput = new FileInputStream(studentFile);
              ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);

                students = (Student[]) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {

                e.printStackTrace();
            }

              for (Student student : students) {
                    System.out.println(student);
                }



         }








     }
}