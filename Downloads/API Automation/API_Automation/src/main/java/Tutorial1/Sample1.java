package Tutorial1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample1 {

	
	public static void main(String[] args) throws JsonProcessingException {
	
		POJO1 obj=new POJO1();
		obj.setFirstName("sandhya");
		obj.setLastName("kolpe");
		obj.setAddress("pune");
		obj.setSalary(1099900l);
		
		ObjectMapper mapper=new ObjectMapper();
		String map=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(map);
		
		
	     
		
		
		

	}

}
