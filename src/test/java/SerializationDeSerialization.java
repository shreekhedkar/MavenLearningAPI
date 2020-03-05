import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationDeSerialization {

	public static void main(String[] args) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		Employee e = new Employee();
		e.setAge(1);
		e.setName("Ab");

		String empJson = mapper.writeValueAsString(e);
		System.out.println(empJson);
	}

}