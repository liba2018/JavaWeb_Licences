package zlicense.verify;

public class licenseVerifyTest {
	public static void main(String[] args){
		VerifyLicense vLicense = new VerifyLicense();
		try{
			
			vLicense.setParam("src/main/resources/verifyparam.properties");
			
			vLicense.verify();
		}
		catch(Exception er){
			er.printStackTrace();
		}

	}
}
