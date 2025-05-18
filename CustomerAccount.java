public class CustomerAccount{


    public String custmer_name;
    public String accountId;
    public String city;
    public String street_address;
    public String state;
    public String country;
    public String zip;
    public String email;

     public CustomerAccount(String customer_name, String accountId, String email, String city, String street_address, String state, String country, String zip) {
        this.name = name;
        this.email = email;
        this.accountId = accountId;
        this.city= city;
        this.street_address = street_address;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public void setAccountId(String accountId) {
       this.accountId = accountId;
    }

    
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account_id=" + accountId +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CustomerAccount customer1 = new CustomerAccount("Alice Smith", 101, "alice.smith@example.com","","San FRancisco","111 A street", "CA","US","939393");
        CustomerAccount customer2 = new CustomerAccount("Bob Johnson", 102, "bob.johnson@example.com","","San Diego", "", "","US","339393");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}

