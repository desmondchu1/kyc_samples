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

    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
   
    public void setPassportId(String passportId) {
        this.passport_id = passport_id;
    } 
    
    public String getDateOfBirth() {
        return this.date_of_birth;
    }    

    public void setDateOfBirth(String dateOfBirth) {
        this.date_of_birth = dateOfBirth;
    }


    private static final String DB_URL = "jdbc:sqlite:mydatabase.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    public static void saveProfile(Customer_Profile cp) {
        String sql = "INSERT INTO customer_profile(name, ssn, email, date_of_birth) VALUES (?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cp.getName());
            pstmt.setInt(2, cp.getSSN());
            pstmt.setString(3, cp.getEmail());
            pstmt.setString(4, cp.getDateOfBirth());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
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
        Customer_Profile customer1 = new Customer_Profile("Alice Smith", 101, "alice.smith@example.com","","San FRancisco","111 A street", "CA","US","939393","");
        Customer_Profile customer2 = new Customer_Profile("Bob Johnson", 102, "bob.johnson@example.com","","San Diego", "", "","US","339393","");

        System.out.println(customer1);
        System.out.println(customer2);
        saveProfile(customer1);
        saveProfile(customer2);
    }
}

