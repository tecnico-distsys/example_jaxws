package example.ws;

import jakarta.jws.WebService;

@WebService
public interface Hello {

	String sayHello(String name);

}
