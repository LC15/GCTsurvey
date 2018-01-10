import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
import java.io.*; 

import java.nio.charset.StandardCharsets;

public class createEmailList{
	//initialize class variables
	static ArrayList <String> accelerators = new ArrayList <String> ();
	static ArrayList <String> responded = new ArrayList <String> ();
	static ArrayList <String> emailsList= new ArrayList <String> ();
	static String emails="";

	public static void main(String[] args) {
       System.out.println("Create Email is compiling");

       createCompanyList();
       createRespondedList();
       creatAcceleratorEmails();
       createEmailList();
     
    }
	public static void createCompanyList(){
		
		File acceleratorsFile= new File("AcceleratorStartups.txt");
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(acceleratorsFile);	
			scanner.useDelimiter("\n *");
			
			while(scanner.hasNext()){
				accelerators.add(scanner.next());
		}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}    

	public static void createRespondedList(){
		
		File respondedFile= new File("CompaniesWhoResponded.txt");
		
		Scanner scannerTwo = null;
		boolean checking;
		try {
			scannerTwo = new Scanner(respondedFile);	
			scannerTwo.useDelimiter("\n *");
			
			while(scannerTwo.hasNext()){
				responded.add(scannerTwo.next());
		}		
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void creatAcceleratorEmails(){
		File emailsFile= new File("emails.txt");
		
		Scanner scannerThree = null;
		
		try {
			scannerThree = new Scanner(emailsFile);	
			scannerThree.useDelimiter("\n *");
			
			while(scannerThree.hasNext()){
				emailsList.add(scannerThree.next());
		}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void createEmailList(){
		boolean check;
		int pos=0;
		int didntDoIt=0;
		for(String accelerator: accelerators){
			
			check=false;
			for(String company: responded){
				if(accelerator.equals(company)){
					check=true;
					
					
					break;
				}
				
			}
			if(!check){
				//System.out.println(accelerator);
				System.out.println(emailsList.get(pos));
			}
			pos++;
		}
	
	}





}