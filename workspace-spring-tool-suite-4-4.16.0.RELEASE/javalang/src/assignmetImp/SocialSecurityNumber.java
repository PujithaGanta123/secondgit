package assignmetImp;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SocialSecurityNumber {
	String ssn;
	public static void validation(String ssn) throws ArrayIndexOutOfBoundsException{
		
		if(ssn.length()!=11) {
			System.out.println("in valid ssn format");
			
		}
	
		else {
			 
			String regex="^[0-9]{3}-[0-9]{2}-[0-9]{4}";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(ssn);
			if(!m.matches()==true)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		}
	
	
			public void ComponentValidation (String ssn) throws InvalidSocialSecurityNumberException
			{
			String s = null;
			String[] a=ssn.split("-");
			String areanumber="^[0-9]{3}";
			String groupnumber="^[0-9]{2}";
			String serialnumber="^[0-9]{4}";
			Pattern p=Pattern.compile(areanumber);
			Matcher m1=p.matcher(a[0]);
			Pattern p1=Pattern.compile(groupnumber);
			Matcher m2=p1.matcher(a[1]);
			Pattern p2=Pattern.compile(serialnumber);
			Matcher m3=p2.matcher(a[2]);
			
			
			
			if(!m1.matches()==true) { 
				System.out.println("invalid areanumber");
			        throw new InvalidSocialSecurityNumberException(s);
			
			}
			else if(!m2.matches()==true) {
					System.out.println("invalid group number");
			          throw new InvalidSocialSecurityNumberException(s);
				
			}	
			else if(!m3.matches()==true) {
			        System.out.println("invalid serial number");
			            throw new InvalidSocialSecurityNumberException(s);
			
			}
			else
					System.out.println(ssn+"is a valid Social Security Number");
		
		
		}
			
			class InvalidSocialSecurityNumberException throws SocialSecurityNumber{
				String excep;
				InvalidSocialSecurityNumberException(String exp){
					this.excep=excep;
				}
				public void message() {
					System.out.println(excep);
				}
			}
	
	

	
	

}
