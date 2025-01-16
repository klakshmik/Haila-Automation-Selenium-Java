package org.haila.product;

import lombok.extern.slf4j.Slf4j;
import org.haila.pages.product.ProductsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.haila.base.BaseTest;


@Slf4j
public class ProductsPageTest extends BaseTest {

    @Test(dataProvider = "productIndexProvider")
    public void navigateToProductsPageTest(int productIndex) {
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        productsPage.navigateToProductsPage();
        productsPage.selectProductFromTabList(productIndex);
        Assert.assertEquals(productsPage.getSuccessText(), "PRODUCTS");
    }

    @DataProvider(name = "productIndexProvider")
    public Object[][] productIndexData() {
        return new Object[][]{
                {0},
                {1},
                {2},
                {3}
        };
    }
}







