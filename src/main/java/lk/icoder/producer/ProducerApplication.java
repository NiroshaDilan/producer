package lk.icoder.producer;

import lk.icoder.producer.model.Company;
import lk.icoder.producer.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProducerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @Autowired
    private Producer producer;

    @Override
    public void run(String... args) throws Exception {

        Product iphone7 = new Product("Iphone 7");
        Product iPadPro = new Product("IPadPro");

        List<Product> appleProducts = new ArrayList<>(Arrays.asList(iphone7, iPadPro));

        Company apple = new Company("Apple", appleProducts);

        iphone7.setCompany(apple);
        iPadPro.setCompany(apple);

        producer.produce(apple);
    }
}
