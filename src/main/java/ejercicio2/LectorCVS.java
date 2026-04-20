package ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorCVS implements FuenteDeDatos{
    private String svcPath;
    public LectorCVS(String path){
        this.svcPath = path;
    }
    @Override
    public List<String[]> toList() {
        try {
            List<String[]>csvData = new ArrayList<>();
            CSVReader reader = new CSVReader(new FileReader(this.svcPath));
            String[] row = null;
            while ((row = reader.readNext()) != null){
                csvData.add(row);
            }
            reader.close();
            csvData.remove(0);
            return csvData;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
