/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CustomerManagement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author narayanan
 */
import java.util.Date;
import org.junit.jupiter.api.Order;
import vit.adda.l11l12s.assessment05.Cash;
import vit.adda.l11l12s.assessment05.Check;
import vit.adda.l11l12s.assessment05.Credit;
import vit.adda.l11l12s.assessment05.Customer;
import vit.adda.l11l12s.assessment05.Item;
import vit.adda.l11l12s.assessment05.OrderDetail;

public class CustomerManagementTest {

    @Test
    public void testCustomerCreation() {
        Customer customer = new Customer("Arjun", "Chennai");
        assertEquals("Arjun", customer.getName());
        assertEquals("Chennai", customer.getAddress());
    }

    @Test
    public void testOrderDetailCalculations() {
        Item item = new Item(2.0, "Wireless Mouse");
        OrderDetail detail = new OrderDetail(3, "Taxable", item);
        double expectedSubtotal = item.getPriceForQuantity(3);
        double expectedTax = expectedSubtotal * 0.05;
        assertEquals(expectedSubtotal, detail.calcSubTotal());
        assertEquals(expectedTax, detail.calcTax());
    }

    @Test
    public void testCashPaymentAuthorization() {
        Cash cash = new Cash(1000f, 1500f);
        assertTrue(cash.authorized());
    }

    @Test
    public void testCheckPaymentAuthorization() {
        Check check = new Check(2500f, "Rahul", "HDFC123");
        assertTrue(check.authorized());
    }

    @Test
    public void testCreditPaymentAuthorization() {
        Credit credit = new Credit(5000f, "Sneha", "Visa", "12/27");
        assertTrue(credit.authorized());
    }
}