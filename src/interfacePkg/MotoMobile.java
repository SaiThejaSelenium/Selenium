package interfacePkg;

import oops.AccesModifi;

public class MotoMobile implements Mobile,Chennai{
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MotoMobile m=new MotoMobile();
		//m.camera();
		
		Mobile i=new MotoMobile();
		i.camera();
		i.Display("Temper", 12.5);
		
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
		System.out.println("Motrola camera 8MP");
		
	}

	@Override
	public void Display(String Display,Double dim) {
		// TODO Auto-generated method stub
		
		System.out.println("display"+ Display+"  dimen :"+dim);
		
	}

	@Override
	public void systemOS(String Ostype) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OTP() {
		// TODO Auto-generated method stub
		
	}
	
	static void defaultMethod() {
		
		
		System.out.println();
		
		
	}

}
