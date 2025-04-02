package Controllers;

import Domain.Sale;
import Model.SalesRepository;

import java.io.FileNotFoundException;

public class CustomerController {
    private SalesRepository salesRepository;

    public CustomerController() throws FileNotFoundException {
        this.salesRepository= new SalesRepository("src/main/resources/minimercado.csv");
    }

    public Sale mostExpensiveProduct(){
        Sale mostExpensive = new Sale("","",0,0);

        for(Sale currentSale: this.salesRepository.getSalesList()){
            if(currentSale.getUnitPrice() > mostExpensive.getUnitPrice()){
                mostExpensive=currentSale;
            }
        }

        return mostExpensive;
    }

    public Sale cheapestProduct(){
        Sale cheapest = this.salesRepository.getSalesList().get(0);

        for(Sale currentSale: this.salesRepository.getSalesList()){
            if(currentSale.getUnitPrice() < cheapest.getUnitPrice()){
                cheapest=currentSale;
            }
        }

        return cheapest;
    }
}
