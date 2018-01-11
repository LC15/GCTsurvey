import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
import java.io.*; 

import java.nio.charset.StandardCharsets;

public class createEmailList{
	//initialize class variables
	static ArrayList <String> accelerators = new ArrayList <String> ();
	static ArrayList <String> EmailsOfResponders = new ArrayList <String> ();
	static ArrayList <String> emailsList= new ArrayList <String> ();
	static ArrayList <String> ceoEmailList= new ArrayList <String> ();

	public static void main(String[] args) {
       System.out.println("Create Email is compiling");

       createCompanyList();
       createRespondedList();
       creatAcceleratorEmails();
       createEmailList();
     
    }
	public static void createCompanyList(){
		//set up accelerators ArrayList with the company names of the current GCT accelerator class

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
		//set up EmailsOfResponders ArrayList with the emails of the people who responded

		File respondedFile= new File("EmailsofCompleted.txt");
		Scanner scannerTwo = null;
		boolean checking;
		try {
			scannerTwo = new Scanner(respondedFile);	
			scannerTwo.useDelimiter("\n *");
			
			while(scannerTwo.hasNext()){
				EmailsOfResponders.add(scannerTwo.next());
		}		
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void creatAcceleratorEmails(){
		//set up emailsList ArrayList with all of the emails of people in the GCT accelerator program
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
		for(String accelerator: emailsList){
			check=false;
			for(String acceleratorThatResponded: EmailsOfResponders){
				if(acceleratorThatResponded.equals(accelerator)){
					check=true;
					break;
				}		
			}
			if(!check){
				//System.out.println(emailsList.get(pos));
			}
			pos++;
		}

	//	if(EmailsOfResponders.get(27).equals(emailsList.get(1))){
			System.out.println(EmailsOfResponders.get(27));
			System.out.println(emailsList.get(1));
	//	}
	
	}

}