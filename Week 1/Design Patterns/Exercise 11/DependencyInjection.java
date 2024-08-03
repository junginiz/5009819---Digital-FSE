
public class DependencyInjection {
    public static void main(String[] args) {
        // Create a CustomerRepository implementation
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject CustomerRepository into CustomerService
        CustomerService customerService = new CustomerService(customerRepository);

        // Use CustomerService to find a customer
        Customer customer = customerService.getCustomerById("12345");
        System.out.println(customer);
    }
}
