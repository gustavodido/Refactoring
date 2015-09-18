package helper;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import entity.Product;

public class ShippingHelperTest {

	@Test
	public void shouldComputeTaxCorrectly() {
		assertThat(ShippingHelper.tax(2), is(0.1));
		assertThat(ShippingHelper.tax(1), is(0.15));
		assertThat(ShippingHelper.tax(0), is(0.0));
	}
	
	@Test
	public void shouldComputeShippingCorrectly() {
    	Product p = new Product(2.0, false, false);
    	assertThat(ShippingHelper.shipping(p, 1), is(0.5));
 
    	Product p2 = new Product(2.0, false, false);
    	assertThat(ShippingHelper.shipping(p2, 2), is(0.2));

    	Product p3 = new Product(2.0, false, false);
    	assertThat(ShippingHelper.shipping(p3, 0), is(2.0));
	}
}
