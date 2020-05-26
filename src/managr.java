import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class managr	extends student  {
private room Rom1;

public managr(String SN, String n) {
		super(SN, n);
		// TODO Auto-generated constructor stub
	}
private String nameM,name,studentNumber;
 private int choosRoom;

 public void nameM( String n){
     this.nameM = n;
    
 }
 public void add(String stuN , String n) {
		this.name = n;
		this.studentNumber = stuN;
		 try {
		      File myObj = new File("filename.txt");
		      
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  try {
		      FileWriter myWriter = new FileWriter("filename.txt",true);
		  
		      myWriter.write(this.studentNumber+" ");
		      myWriter.write(this.name+"\n");
		    
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
		 
		 
		 
	}

 public void remove() throws IOException {
	 Scanner input =new Scanner(System.in);
	 RandomAccessFile file = new RandomAccessFile("filename.txt","rw");
	String remove =input.nextLine();
	    String delete;
        String task="";
        byte []tasking;
        while ((delete = file.readLine()) != null) {
            if (delete.startsWith(remove)) {
                continue;
            }
            task+=delete+"\n";
        }
        System.out.println(task);
        BufferedWriter writer = new BufferedWriter(new FileWriter("filename.txt"));
        writer.write(task);
        file.close();
        writer.close();
	
 }

 public student addStudent(String stuN , String n) {
	
	 this.add(stuN,n);
	return null;

	 
	 
 }
 
 
 public void addToRoom(student he) {
	
	 Rom1.addTomembers(he);
	 
 }
public void showmembers(room Rom) {
	Rom.Show();
	
}

		
		
		
		
		
		
	}
 	

