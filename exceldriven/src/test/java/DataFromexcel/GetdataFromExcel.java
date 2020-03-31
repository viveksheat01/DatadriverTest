package DataFromexcel;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetdataFromExcel {

	
	//Indentify testcases column by scann the entire 1st row
	//once colunm is identifyied then sacn entire testcases colonm to indentify purchase testcases row
	//after you grab purchase testcases=pull all data of that row and feed into test
	
	public ArrayList<String> getData(String testcasesName) throws IOException
	 {
		
		ArrayList< String> a=new ArrayList<String>();
		
		//fileInputStream argument
		FileInputStream fis=new FileInputStream("E:\\selenium_automationTest\\exceldriven\\exceldata\\testdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
	int sheets=	workbook.getNumberOfSheets();
	for (int i = 0; i < sheets; i++) {
		if (workbook.getSheetName(i).equalsIgnoreCase("testcases"))
		{
			XSSFSheet sheet=workbook.getSheetAt(i);
			
			Iterator<Row> rows=sheet.iterator();
			Row firstrows=rows.next();
			Iterator<Cell> cells=firstrows.cellIterator();
			int k=0;
			int coloumn = 0;
			while(cells.hasNext())
			{
				Cell values=cells.next();
				if(values.getStringCellValue().equalsIgnoreCase("Testcases"))
				{
					
					coloumn=k;
			  }
			k++;
		
	        }
		System.out.println(coloumn);
		
		//once colunm is identifyied then sacn entire testcases colonm to indentify purchase testcases row
		
		
		while(rows.hasNext())
		{
			Row r=rows.next();
			if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Add profile"))
			{
				Iterator<Cell> cv=r.cellIterator();
				{
					while(cv.hasNext())
					{
						a.add(cv.next().getStringCellValue());
						//
						//System.out.println(cv.next().getStringCellValue());
					}
				}
				
			}}}}
	return a;
		}
		

		public static void main(String[] args) 
		{
		
		}
	
}