package DataFromexcel;

import java.io.IOException;
import java.util.ArrayList;

public class DemoTest  {
	
	public static void main(String[] args) throws IOException {
		
	
	GetdataFromExcel fgt=new GetdataFromExcel();
	ArrayList data=fgt.getData("login");
	System.out.println(data.get(0));	
	System.out.println(data.get(1));
	System.out.println(data.get(2));	
	System.out.println(data.get(3));
			
			}

}
