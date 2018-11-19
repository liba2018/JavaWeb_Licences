package zlicense.create;

import zlicense.util.CPUUtil;

public class licenseCreateTest {
	public static void main(String[] args) throws InterruptedException{
		CreateLicense cLicense = new CreateLicense();
		//java-license-jar/src/main/resources
		cLicense.setParam("src/main/resources/createparam.properties");
		//
		String cpuSerial=CPUUtil.getCPUId();
		if(!cpuSerial.isEmpty()){
			cLicense.create(cpuSerial);
		}
	}
}
