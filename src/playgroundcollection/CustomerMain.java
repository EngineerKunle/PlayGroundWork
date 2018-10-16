package playgroundcollection;

import playgroundkotlincov.EmployeeOut;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerMain {

    private static String name = "jejej";

    public static void main(String[] args) {

        Customer argos = new Customer("Carrol", "SE2 7UU", 2000);
        Customer dixons = new Customer("Harry", "SE2 7UL", 4000);

        Set<Customer> customers = new HashSet<Customer>();
//        customers.add(new Customer("Kunle", "N17 6Rl", 1000));
        customers.add(argos);
        customers.add(argos);
        customers.add(dixons);

        Iterator names = customers.iterator();

        for(Customer c : customers) {
            System.out.println(c.getName());
        }

        System.out.println(name);
    }


}
