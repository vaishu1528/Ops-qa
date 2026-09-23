package com.FracProPlus.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	private int lastRow;


	
	public static String readdata(String value)
	   {
	      
	      String Output = null;
	      try {
	         int num=-0;
	         String projectRoot = System.getProperty("user.dir");
	            String driverPath = Paths.get(projectRoot,  "FracproPlusData", "FracproData.xlsx").toString();
	         FileInputStream fis=new FileInputStream(driverPath);

//	       FileInputStream file1 = new FileInputStream(new File("D:\\automation_script\\Strata demo Automation\\sheets\\PumpHourProjectSheet.xlsx"));
	         
	         XSSFWorkbook wb= new XSSFWorkbook(fis);
	         XSSFSheet w=wb.getSheetAt(num);
	         
	         String temp="test";
	         
	         for(int i=0; i<=500; i++)
	         {
	         
	            temp=w.getRow(i).getCell(0).getStringCellValue();
	            if((temp).equalsIgnoreCase(value))
	            {
	               Output=w.getRow(i).getCell(1).getStringCellValue();
	               wb.close();
	               break;
	            }
	            
	         }
	         

	      }
	      
	   catch(Exception e)
	{
	   System.out.println(e);
	}
	      return Output;
	   
	}
	
	
    public static String readDataFromExcel(String value) {
        String output = null;
        String projectRoot = System.getProperty("user.dir");
        String filePath = Paths.get(projectRoot, "FracproPlusData", "FracproData.xlsx").toString();

        try (FileInputStream fis = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheetAt(0); // Access the first sheet

            for (Row row : sheet) {
                Cell keyCell = row.getCell(0);
                if (keyCell != null) {
                    String cellValue = null;
                    switch (keyCell.getCellType()) {
                        case STRING:
                            cellValue = keyCell.getStringCellValue();
                            break;
                        case NUMERIC:
                            cellValue = String.valueOf(keyCell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            cellValue = String.valueOf(keyCell.getBooleanCellValue());
                            break;
                        default:
                            cellValue = ""; // Handle other cell types if needed
                    }
                    if (cellValue.equalsIgnoreCase(value)) {
                        Cell valueCell = row.getCell(1);
                        if (valueCell != null) {
                            switch (valueCell.getCellType()) {
                                case STRING:
                                    output = valueCell.getStringCellValue();
                                    break;
                                case NUMERIC:
                                    output = String.valueOf(valueCell.getNumericCellValue());
                                    break;
                                case BOOLEAN:
                                    output = String.valueOf(valueCell.getBooleanCellValue());
                                    break;
                                default:
                                    output = ""; // Handle other cell types if needed
                            }
                        }
                        break;
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the Excel file: " + e.getMessage());
        }

        return output;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String readdatadfromexcel(int sheetNo, String value)
    {
        
        String Output = null; 
        try {
            String projectRoot = System.getProperty("user.dir");
             String driverPath = Paths.get(projectRoot,  "sheets", "linqx.xlsx").toString();
            FileInputStream fis=new FileInputStream(driverPath);
            XSSFWorkbook wb= new XSSFWorkbook(fis);
            XSSFSheet w=wb.getSheetAt(sheetNo);
            String temp="test";
            
            for(int i=1; i<=100; i++)
            {
            
                temp=w.getRow(i).getCell(0).getStringCellValue();
                if((temp).equalsIgnoreCase(value))
                {
                    Output=w.getRow(i).getCell(1).getStringCellValue();
                    break;
                }
                
            }

                    
        } catch (Exception e) {
            System.out.println(value+ " column is not present in excel, there could be spelling error or element could be deleted");
        }
        
        return Output;
    }




	public  String readDataXcel(String sheetname, int rownum, int cellnum) throws IOException {
    File file = new File("D:\\Linqx Automation\\Linqx_TestRepo\\testData");
	FileInputStream fis =new FileInputStream(file);
	XSSFWorkbook workbook= new XSSFWorkbook(fis);
	Sheet s=workbook.getSheet(sheetname);
	String value=s.getRow(rownum).getCell(cellnum).getStringCellValue();

	return value;
}
	
	
	
	
	
    // Method for 2D 
	public Object[][] readMultipleData (String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("D:\\Linqx Automation\\Linqx_TestRepo\\testData\\linqx.xlsx"); 
		Workbook wbb=WorkbookFactory.create(fis);
        Sheet sh=wbb.getSheet(sheetName); 
        int lastRowsh=sh.getLastRowNum();
        int lastCell=sh.getRow(0).getLastCellNum();


	Object[] [] data = new Object[lastRow] [lastCell];
	for (int i=0;i<lastRow;i++)
	{
	  for (int j=0;j<lastCell;j++) 
	  {
	   data[i][j]= sh.getRow(i+1).getCell(1).getStringCellValue();
	  }
	}
	return data;
}
	
	
	
	
	
	
	public String[] getExcelData(String sheet) throws Exception {
        File file = new File("D:\\Linqx Automation\\Linqx_TestRepo\\testData\\linqx.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sh = workbook.getSheet(sheet);
        int noofRows = sh.getPhysicalNumberOfRows();
        int noofColumn = sh.getRow(0).getLastCellNum();
        System.out.println("noofRows :" + noofRows + " noofColumn :" + noofColumn);

        // Flattening the 2D array into a 1D array
        String[] data = new String[(noofRows - 1) * noofColumn];
        DataFormatter df = new DataFormatter();

        int index = 0;
        for (int i = 1; i < noofRows; i++) {  // Start from 1 to skip header row
            for (int j = 0; j < noofColumn; j++) {
                data[index] = df.formatCellValue(sh.getRow(i).getCell(j));
                index++;
            }
        }

        return data;
    }
	
	
	
	
	
	//Method for 2D
	public String[][] getexceldata() throws Exception
    {
        File file = new File("C:\\Users\\Nimbuspost\\Documents\\Nimbuspost_registration_data.xlsx");
        //System.out.println(file.exists());
        
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int noofRows = sheet.getPhysicalNumberOfRows();
        int noofColumn = sheet.getRow(0).getLastCellNum();
        System.out.println("noofRows :"+noofRows+" noofColumn :"+noofColumn);
        
        String[][] data = new String[noofRows-1][noofColumn];
        for(int i=0; i<noofRows-1; i++)
        {
            for(int j=0; j<noofColumn; j++)
            {
                DataFormatter df = new DataFormatter();
                
                data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));    
            
            }
            
        }
//        for (String[] dataArr : data) {
//            System.out.println(Arrays.toString(dataArr));    
//        }
//        
        
        
        
        return data;
        }
    
	
    
    }
