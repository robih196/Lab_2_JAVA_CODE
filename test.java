
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1=new Customer();
		cus1.setName("Md. Robin Hassan");
		cus1.setAddress("Atibazar, Keranigonj, Dhaka");
		
		System.out.println("Name:"+cus1.getName());
		System.out.println("Address:"+cus1.getAddress());
		
		
		User person1=new User();
		person1.setUserId("Robin");
		person1.setPassword("123456");
		
		System.out.println("Username:"+person1.getUserId());
		System.out.println("Password:"+person1.getPassword());
		
		Admin admin1=new Admin();
		admin1.setName("Sharful Islam");
		System.out.println("Admin Name:"+admin1.getName());
		
		
		
		
	}

}
