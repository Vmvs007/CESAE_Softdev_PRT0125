package Controllers;

import Domain.Sale;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest {

    private AdminController adminController;
    private AdminController adminControllerControlo;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        adminController=new AdminController("src/test/resources/minimercado.csv");
        adminControllerControlo=new AdminController("src/test/resources/minimercadoControlo.csv");
    }

    @Test
    public void getTotalSalesTest(){
        assertEquals(12055, adminController.getTotalSales());
        assertEquals(12060, adminControllerControlo.getTotalSales());
    }

    @Test
    public void getBestSaleUnitsTest(){
        assertEquals("Cerveja Super Bock",adminController.bestSaleUnits().getProduct());
        assertEquals(10000,adminController.bestSaleUnits().getUnitsSold());
    }
}