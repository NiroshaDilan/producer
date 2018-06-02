package lk.icoder.producer.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @Project producer
 * @Author DILAN on 6/2/2018
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id", scope = Product.class)
public class Product {

    private String name;

    private Company company;

    public Product(){
    }

    public Product(String name){
        this.name = name;
    }

    public Product(String name, Company company){
        this.name = name;
        this.company = company;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // products
    public void setCompany(Company company){
        this.company = company;
    }

    public Company getCompany(){
        return this.company;
    }
}
