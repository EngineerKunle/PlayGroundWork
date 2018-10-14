package playgroundcollection;

public class Customer {

    private String name;
    private String address;
    private long expenditure;

    public Customer(String name, String address, long expenditure) {
        this.name = name;
        this.address = address;
        this.expenditure = expenditure;
    }

    public String getName() { return  name;}
    public String getAddress() {return address;}
    public long getExpenditure() { return expenditure; }

}
