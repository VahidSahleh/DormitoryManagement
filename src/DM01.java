import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class DM01 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		//String aa = input.next();
		//DM01 objectIO = new DM01();
		//student st1 = new student("960122680098","vahid");
		//String number= st1.getstudentNumber();
		//String Name = st1.getstudent();
		//student st2 = new student("960122680099","navid");
		//String number2= st2.getstudentNumber();
		//String Name2 = st2.getstudent();
		 /* try {
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
		      
		      File myObj2 = new File("tempfile.txt");
		      if (myObj2.createNewFile()) {
		        System.out.println("File created: " + myObj2.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		  
		      myWriter.write(number+" ");
		      myWriter.write(Name+"\n");
		      myWriter.write(number2+" ");
		      myWriter.write(Name2);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }*/
		  
		String keyboard1 = input.nextLine();
		String keyboard2 = input.nextLine();
		//String keyboard3 = input.nextLine();
		//String keyboard4 = input.nextLine();
		//student he = new student(keyboard1,keyboard2);
		managr  mg = new managr(keyboard1,keyboard2);	
		//mg.nameM("vahid");
		//mg.addStudent("9999999", "rezaali");
		
		student st1= new student("vahid","911");
		student st2 = new student("nahid","922");
		//mg.add(keyboard1,keyboard2);
		//mg.edit();
		//System.out.println("shomare otagh:");
		//String v1 = input.nextLine();
		//System.out.println("zarfiat otagh:");
		//String v2 = input.nextLine();
		//System.out.println("hazine otagh:");
		//String v3 = input.nextLine();
		//System.out.println("tabaghe otagh:");
		//String v4 = input.nextLine();
		
		room vv =new room("2","4","2","2");
		vv.addTomembers(st1);
		mg.showmembers(vv);
		//vv.delMember("vahid");
		//vv.Show();
		//mg.remove();
		
  		//String newNumber, newName, newAddr, record, ID,record2;

		        
		/*  File db = new File("E:\\Eclipse\\DormitoryManagement\\filename.txt");
  		File tempDB = new File("E:\\Eclipse\\DormitoryManagement\\tempfile.txt");
  		
  		BufferedReader br = new BufferedReader( new FileReader(db) );
  		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
  		    		
  		Scanner strInput = new Scanner(System.in);
  		
  		System.out.println("\t\t Update Employee Record\n\n");   
		/****/		
		/*	System.out.println("Enter the Employee ID: ");
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
  	/*	System.out.println("Enter the new number: ");
  		newNumber = strInput.nextLine();    		
  		System.out.println("Enter the new Name: ");
  		newName = strInput.nextLine();  
 
  		
  		BufferedReader br2 = new BufferedReader( new FileReader(db) );
  			
  		while( (record2 = br2.readLine() ) != null ) {    			
  			if(record2.contains(ID)) {
  				bw.write(newNumber+","+newName);
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
  		System.out.println(success);   	*/	
  		
  }
		// System.out.println(v);
	
		//room room102 = new room();
		//room102.setRent(1200);
		//room102.setRoomNumber(25);
		//room102.setRoomCapacity(5);
		//room102.setStairnumber(3);
	  /*  try {
	    	BufferedWriter writer = new BufferedWriter(new FileWriter("filename.txt", true));
	      
	     
	       // myWriter.append("navid khare");
	    	writer.write(v);
	    	writer.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	


	    }

