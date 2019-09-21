package day1;

public class Arrays {
	
	public static void stringArray() {
		
		//1.To store only string data
		
		String[] data= {"MON","TUES","WED","TH","FRI","SAT","SUN"};
		System.out.println(data.length);
		
//		System.out.println(data[6]);
	System.out.println(data[0]);
		data[0]="Sai";
		System.out.println(data[0]);
		
		int len=data.length;
		
		
		for(int a=0;a<len;a++) {
			
			//System.out.println(data[a]);
		}
		/**
		
		for(DataType refVar : ArrayRef) {
			
			
		}
		**/
		
		for(String text:data) {
			System.out.println(text);
			
			
		}
		
		
	}
	
	public static void intArray() {
		int a,b,c,d;
		a=10;
		b=20;
		c=30;d=45;
		
		int[] test= {1,2,3,4,5};
		test[4]=0;
		System.out.println(test.length);
		
		System.out.println(test[2]);
		for(int s:test) {
			
			System.out.println(s);
		}
		
	}
	
	public static void objectArray() {
				
	Object[] obj= {"dsds",1,true,'c',1.9};
		
	System.out.println(obj[0]+""+obj[2]);
		
		
	}
	
	public static void singleDim() {
		
		String[] str=new String[3];
		
		str[0]="Sai";
		str[1]="Teja";
		str[2]="Chennai";
		//str[3]="TN";
		
		System.out.println(str[0]+" "+str[1]+" "+str[2]);
		
		int[] in=new int[3];
		in[0]=1;
		in[1]=2;
		in[2]=4;
		
		
		Object[] obj=new Object[3];
		
		obj[0]="text";
		obj[1]=2;
		obj[2]=true;
		
		for(Object ob:obj) {
			System.out.println(ob);
		}
		
	}
	
	public static void twoDim() {
		
		String[][] str=new String[2][2];
		
		str[0][0]="Sai";
		str[0][1]="Sai123";
		str[1][0]="Hello";
		str[1][1]="world";
		
		System.out.println(str[1][1]);
		
		int rows=str.length;
		System.out.println("Rows length : "+rows);
		int ccout=str[0].length;
		
		for(int i=0;i<rows;i++) {
			ccout=str[i].length;
			//System.out.println("Colum count : "+ccout);
			
			for(int j=0;j<ccout;j++) {
				
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringArray();
		
		//intArray();
		//singleDim();
		twoDim();
		//objectArray();

	}

}
