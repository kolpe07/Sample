package Tutorial1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Emp1 {

	public static void main(String[] args) throws JsonProcessingException {
	
		Emp obj=new Emp();
		obj.setProductName("Amazon");
		obj.setTopics("Automation Testing");
		obj.setSalary(123444l);
		
		ObjectMapper mapper=new ObjectMapper();
		
		String a = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(a);

	}

}
