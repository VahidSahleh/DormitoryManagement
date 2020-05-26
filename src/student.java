import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import java.util.StringTokenizer;
public class student implements Serializable {
	private String name;
	
	private String studentNumber,newNumber, newName, newAddr, record, ID,record2;
	
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public student( String SN ,String n){
		super();
	        this.name = n;
	        this.studentNumber = SN;
	       
	    }
	public String toString() {
		return "name   "+studentNumber+"     Student number    "+name;
	}
	public void add(String n , String stuN) {
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
		      FileWriter myWriter = new FileWriter("filename.txt");
		  
		      myWriter.write(this.studentNumber+" ");
		      myWriter.write(this.name+"\n");
		    
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  
		 
	}
	public void edit() throws IOException  {
        
		  File db = new File("E:\\Eclipse\\DormitoryManagement\\filename.txt");
  		File tempDB = new File("E:\\Eclipse\\DormitoryManagement\\tempfile.txt");
  		
  		BufferedReader br = new BufferedReader( new FileReader(db) );
  		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
  		    		
  		Scanner strInput = new Scanner(System.in);
  		
  		System.out.println("\t\t Update Employee Record\n\n");   
		/****/		
			System.out.println("Enter the Employee ID: ");
	    		ID = strInput.nextLine();	    		
	    		System.out.println(" ------------------------------------------------------------- ");
	    		System.out.println("|	ID		Name 				Age			Address 		  |");
	    		System.out.println(" ------------------------------------------------------------- ");
	    		
	    		while( ( record = br.readLine() ) != null ) {
	    			
	    			StringTokenizer st = new StringTokenizer(record," ");
	    			if( record.contains(ID) ) {
	    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+"      |");
	    			}
	    			
	    		}	    		
	    		
	    	br.close();
		/****/    	   
  		System.out.println("Enter the new number: ");
  		newNumber = strInput.nextLine();    		
  		System.out.println("Enter the new Name: ");
  		newName = strInput.nextLine();  
 
  		
  		BufferedReader br2 = new BufferedReader( new FileReader(db) );
  			
  		while( (record2 = br2.readLine() ) != null ) {    			
  			if(record2.contains(ID)) {
  				bw.write(newNumber+" "+newName);
  			} else {
  			
  				bw.write(record2);	
  			}    			
  			bw.flush();
  			bw.newLine();
  		}
  		
  		bw.close();
  		br2.close();    		
  		db.delete();    		
  		boolean success = tempDB.renameTo(db);    		
  		System.out.println(success);   	  	
	}
	
	
}
