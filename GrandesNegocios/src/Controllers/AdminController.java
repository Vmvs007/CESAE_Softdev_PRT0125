package Controllers;

import Domain.Sale;
import Model.SalesRepository;

import java.io.FileNotFoundException;

public class AdminController {

    private SalesRepository salesRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    public double getTotalSales() {
        double totalSales = 0;

        for (Sale currentSale : this.salesRepository.getSalesList()) {
            totalSales += currentSale.getUnitsSold() * currentSale.getUnitPrice();
        }

        return totalSales;
    }

    public Sale bestSaleUnits() {
        Sale bestSaleByUnits = new Sale("", "", 0, 0);

        for (Sale currentSale : this.salesRepository.getSalesList()) {
            if (currentSale.getUnitsSold() > bestSaleByUnits.getUnitsSold()) {
                bestSaleByUnits = currentSale;
            }
        }

        return bestSaleByUnits;
    }

    public Sale bestSaleValue() {
        Sale bestSaleByValue = new Sale("", "", 0, 0);

        for (Sale currentSale : this.salesRepository.getSalesList()) {
            if (currentSale.getUnitsSold() * currentSale.getUnitPrice() > bestSaleByValue.getUnitsSold() * bestSaleByValue.getUnitPrice()) {
                bestSaleByValue = currentSale;
            }
        }

        return bestSaleByValue;
    }
}
