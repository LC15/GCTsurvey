public class Startup{
	public static void main(String[] args) {
       System.out.println("This is working");
    }
    
    public String email= "no email address";
    public boolean complete= false;
   
    public void setEmailAddress(String CompanyEmail){
    	email=CompanyEmail;
    }
    public String showEmail(){
    	return email;
    }
    public void CompletedSurvey(){
    	complete=true;
    }
    public boolean StartupSurveyValue(){
    	return complete;
    }

}