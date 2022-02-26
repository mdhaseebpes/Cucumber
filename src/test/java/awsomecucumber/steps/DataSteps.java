package awsomecucumber.steps;

import awsomecucumber.objects.Customer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataSteps {

    @Given("my credentials")
    public void myCredentials(DataTable dataTable) {
        List<String> cred = dataTable.row(0);
        String username = cred.get(0);
        String password = cred.get(1);
        System.out.println(username +  " " + password );

        System.out.println("------------------");
        List<List<String>> cred1 = dataTable.asLists();
        System.out.println("ROW  0 USERNAME = " + cred1.get(0).get(0));
        System.out.println("ROW  0 PASSWORD = " + cred1.get(0).get(1));
        System.out.println("ROW  1 USERNAME = " + cred1.get(1).get(0));
        System.out.println("ROW  1 USERNAME = " + cred1.get(1).get(1));

    }

    @Given("my credentials1")
    public void myCredentials1(List<List<String>> cred1) {
        System.out.println("UserName = " + cred1.get(0));
        System.out.println("PassWord = " + cred1.get(1));

        System.out.println("------------------");

        System.out.println("ROW  0 USERNAME = " + cred1.get(0).get(0));
        System.out.println("ROW  0 PASSWORD = " + cred1.get(0).get(1));
        System.out.println("ROW  1 USERNAME = " + cred1.get(1).get(0));
        System.out.println("ROW  1 USERNAME = " + cred1.get(1).get(1));

    }

    @DataTableType
    public Customer customerEntry(List<String> entry){
        return new Customer(entry.get(0),entry.get(1));
    }

    @Given("my customer data")
    public void myCustomerData(List<Customer> customer) {
        System.out.println("ROW  0 USERNAME = " + customer.get(0).getUserName());
        System.out.println("ROW  0 PASSWORD = " + customer.get(0).getPassWord());
        System.out.println("ROW  1 USERNAME = " + customer.get(1).getUserName());
        System.out.println("ROW  1 USERNAME = " + customer.get(1).getPassWord());
    }

    @Given("my customers")
    public void myCustomer(List<Map<String,String>> customers) {
        System.out.println("ROW  0 USERNAME = " + customers.get(0).get("username"));
        System.out.println("ROW  0 PASSWORD = " + customers.get(0).get("password"));
        System.out.println("ROW  1 USERNAME = " + customers.get(1).get("username"));
        System.out.println("ROW  1 PASSWORD = " + customers.get(1).get("password"));

    }

    @Given("my customers transpose")
    public void myCustomerTranspose(@Transpose Customer customers) {
        System.out.println("USERNAME = " + customers.getUserName());
        System.out.println("PASSWORD = " + customers.getPassWord());
    }



    @Given("MULTIPLE COLUMNS WITH HEADER")
    public void multipleCOLUMNSWITHHEADER(DataTable dataTable) {
        List<List<String>> cred = dataTable.asLists();
        System.out.println("username " + cred.get(0) );
        System.out.println("password " + cred.get(1) );
    }
}
