// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Mock implementation (in real case, it would connect to a database)
        return new Customer(id, "John Doe");
    }
}
