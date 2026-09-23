package com.FracProPlus.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecelReader {
	
	public List<String> getExcelDataWithColumn(String sheetName, String columnHeader) throws Exception {
        File file = new File("FracproPlusData/Treatment_Schedule.xlsx");

        // Use try-with-resources to ensure proper resource management
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new Exception("Sheet not found: " + sheetName);
            }

            Row headerRow = sheet.getRow(0);
            if (headerRow == null) {
                throw new Exception("Header row is missing in sheet: " + sheetName);
            }

            // Find the column index
            int columnIndex = -1;
            for (org.apache.poi.ss.usermodel.Cell cell : headerRow) {
                if (cell.getCellType() == CellType.STRING &&
                        cell.getStringCellValue().equalsIgnoreCase(columnHeader)) {
                    columnIndex = cell.getColumnIndex();
                    break;
                }
            }

            if (columnIndex == -1) {
                throw new Exception("Column not found: " + columnHeader);
            }

            List<String> columnData = new ArrayList<>();
            DataFormatter df = new DataFormatter();

            // Iterate through rows to fetch the column data
            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Using getLastRowNum()
                Row row = sheet.getRow(i);
                if (row != null) {
                    org.apache.poi.ss.usermodel.Cell cell = row.getCell(columnIndex);
                    columnData.add(cell != null ? df.formatCellValue(cell) : "");
                }
            }

            for (String value : columnData) {
//                System.out.println(value);
            }

            return columnData;
        }
    }

}
