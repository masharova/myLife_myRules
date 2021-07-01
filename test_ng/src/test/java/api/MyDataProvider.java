package api;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class MyDataProvider {

    @DataProvider(name = "data-provider")
    public Object [][] dmMethod(){
        return new Object[][]{{"lg"},{"LG"}};
    }

    @DataProvider(name = "excel-data")
    public Object[][] excelDP() throws IOException{
        Object[][] arrObj = getExcelData("TestData.xlsx","Sheet1");
        return arrObj;
    }
    public String[][] getExcelData(String fileName,String sheetName){
        String[][] data = null;
        try {
            FileInputStream fis = new FileInputStream("src/TestData.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            XSSFRow row = sheet.getRow(2);
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCols = row.getLastCellNum();
            Cell cell;
            data = new String[noOfRows-1][noOfCols];

            for (int i =1;i<noOfRows;i++){
                for (int j = 0;j<noOfCols;j++){
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i-1][j] = cell.getStringCellValue();
                }
            }
        }catch (Exception e){
            System.out.println("The exception is:" + e.getMessage());
        }
        return data;
    }
}
