import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CSV {
    FileInputStream fis=new FileInputStream(new File(" "));

    public CSV() throws IOException {
        System.out.println("File not found.");
    }
    HSSFWorkbook hw=new HSSFWorkbook(fis);
       HSSFSheet hs=hw.getShe
       HSSFSheet hs=hw.getSheetAt(0);
    for(hssf Row r:hs){

    }

}