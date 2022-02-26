package awsomecucumber.types;

import awsomecucumber.objects.Product;
import io.cucumber.java.ParameterType;

public class CustomerParameterType {

    //Regular expression
    @ParameterType(".*")
    public Product product(String name){
        return new Product(name);
    }

    /*//Regular expression
    @ParameterType("\"GreenShoes\"|\"Reebok\"")
    public Product product(String name){
        return new Product(name);
    }*/

}
