import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {
   public static void main(String[] args) throws BiffException, IOException {
      File inputWorkbook = new File("Devesh.xlsx");
      Workbook w;
      w = Workbook.getWorkbook(inputWorkbook);
      Sheet sheet = w.getSheet(0);
      int rows = sheet.getRows();
      int columns = sheet.getColumns();
      String[][] data = new String[rows][columns];
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            Cell cell = sheet.getCell(j, i);
            data[i][j] = cell.getContents();
         }
      }
   }
}
