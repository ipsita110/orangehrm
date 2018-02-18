package kl;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;



public class Data {
	Excel read = new Excel();
@DataProvider(name="abc")
	
	public String[][] getExcelData() throws EncryptedDocumentException, InvalidFormatException, IOException{
	System.out.println("dhjsd");
		
		return read. getExcelData("./Testinput/Input.xlsx", "Sheet1");
		}
@DataProvider(name="admi")
public String[][] getExcelData2() throws Exception
{
return read.getExcelData("./Testinput/Input.xlsx", "Sheet2");	
}

}
