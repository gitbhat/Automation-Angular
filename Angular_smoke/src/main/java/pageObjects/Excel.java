package pageObjects;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
        XSSFWorkbook wb;
        XSSFSheet sheet1;

        public Excel(String excelpath)
        {
                        try 
                        {
                                        File src=new File(excelpath);
                                        
                                        FileInputStream fis=new FileInputStream(src);
                                        
                                        wb= new XSSFWorkbook(fis);
                                        
                                        
                        }
                        catch (IOException e) 
                        {
                                        
                                        System.out.println(e.getMessage());
                        }
        }

	
	@SuppressWarnings("deprecation")
	public   String getdata(int sheetNumber, int row, int column) throws Throwable
	{
		String data;
				
        sheet1=wb.getSheetAt(sheetNumber);
        Cell c= sheet1.getRow(row).getCell(column);
        if(c.getCellTypeEnum()== CellType.STRING)
        {
  data = sheet1.getRow(row).getCell(column).getStringCellValue();
        }
        else
        {
        double	data1 =  c.getNumericCellValue();
        int i=(int) (data1);
        data=String.valueOf(i);
        }

return data;

		
	}
}