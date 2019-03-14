package crazypco.start.test;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import crazypco.start.main.entitys.Customer;
import crazypco.start.main.repositorys.CutomerRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseTest {

    @Autowired
    CutomerRepository customerRepository;

    @Test
    public void testCustomerRepository(){
    	Customer customer = Customer.
    			
    	customerRepository.save(customer);

        List<Customer> customerList = customerRepository.findAll();

        Customer chris = customerList.get(0);
        assertThat(chris.getName(), is("크리스"));
        assertThat(chris.getPhone(), is("010-1224-1225"));
    }

    @After
    public void deleteAll() {
        customerRepository.deleteAll();
    }

}