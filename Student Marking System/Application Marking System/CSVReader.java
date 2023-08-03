import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
   public static void main(String[] args) throws IOException {
      String csvFile = "Devesh.csv";
      BufferedReader br = null;
      String line = "";
      String cvsSplitBy = ",";
      int row = 0, col = 0;
      String[][] data = null;

      try {
         br = new BufferedReader(new FileReader(csvFile));
         while ((line = br.readLine()) != null) {
            String[] values = line.split(cvsSplitBy);
            if(data == null){
                data = new String[10000][values.length];
            }
            col = values.length;
            for (int i = 0; i < col; i++) {
                data[row][i] = values[i];
            }
            row++;
         }
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         if (br != null) {
            br.close();
         }
      }
    for(int i = 0 ; i<400;i++){
        for(int j = 0 ; j<2;j++){
            System.out.print(data[i][j]+"  ");

        }
        System.out.println();

    }
   }
}
