public class Customer_Profile{


    public String name;
    public String customer_ssn;
    public String date_of_birth;
    public String passport_id;
    public String passport_expiration_date;
    public String city;
    public String street_address;
    public String state;
    public String country;
    public String zip;
    public String email;

     public Customer_Profile(String name, String ssn, String email, String passport_id, String city, String street_address, String state, String country, String zip, String passport_expiration_date) {
        this.name = name;
        this.ssn = ssn;
        this.email = email;
        this.passport_id = passport_id;
        this.city= city;
        this.street_address = street_address;
        this.state = state;
        this.country = country;
        this.zip = zip;
        this.passport_expiration_date = passport_epiration_date;
    }

    public String getName() {
        return name;
    }

    public int getSSN() {
        return ssn;
    }

    public String getEmail() {
        return email;
    }

    public String getPassportId() {
        return passport_id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", ssn=" + ssn+
                ", passpord_id=" + passport_id +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice Smith", 101, "alice.smith@example.com","","San FRancisco","111 A street", "CA","US","939393","");
        Customer customer2 = new Customer("Bob Johnson", 102, "bob.johnson@example.com","","San Diego", "", "","US","339393","");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}

