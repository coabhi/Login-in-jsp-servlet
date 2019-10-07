package login.abhi.registration;

public interface CustomerDao {
 
	public int insertCustomer(Customer c);
	public Customer getCustomer(String username,String password);
}
