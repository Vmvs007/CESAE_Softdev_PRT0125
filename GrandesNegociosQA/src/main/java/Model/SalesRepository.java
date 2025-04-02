package Model;

import Domain.Sale;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {
    private ArrayList<Sale> salesList;

    public SalesRepository(String filePath) throws FileNotFoundException {
        this.salesList= CSVReader.readSalesFileToArray(filePath);
    }

    public ArrayList<Sale> getSalesList() {
        return salesList;
    }
}
