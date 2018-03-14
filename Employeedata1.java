import java.io.*;

public class Employeedata1 {
	public static void main(String [] args ) throws IOException  {
		 System.out.println("Enter the numbers of Employees:");
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
         int n=Integer.parseInt(in.readLine());
		 
		 Employee1 [] emp = new Employee1[n];
		 
		 for (int i = 0; i < emp.length; i++){
		try {		
			System.out.println("Enter the Details of Employees no: "+(i+1));             
               System.out.println("Name: ");
               String ename=in.readLine();
               System.out.println("ID no: ");
               int id=Integer.parseInt(in.readLine());
               System.out.println("DOB: ");               
               String d=(in.readLine());


              emp[i]=new Employee1(ename,id,d);                          

              File EmployeeFile = new File("EmployeeData_1.txt");
              
              FileOutputStream fileOutput = new FileOutputStream(EmployeeFile);
              ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
              objectOutput.writeObject(emp);

              emp = null;

              FileInputStream fileInput = new FileInputStream(EmployeeFile);
              ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);

                emp = (Employee1[]) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {

                e.printStackTrace();
            }
			catch (NumberFormatException q){
				System.out.println("please Enter Name in Alphabets,ID in Numeric and Date in Alphabets");
			}
			catch(Exception p){
					p.printStackTrace();
			}
			 
		 }
	
	}
}