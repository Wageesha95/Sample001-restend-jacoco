package Demo;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class controller {
	
	
	@RequestMapping(value = "/test-report", method = RequestMethod.GET)
	@ResponseBody
	public String helloWorld() {
		
		System.out.println("test - start");
		
		MyClass mc = new MyClass ();
		int s = mc.max(5,10);
		int t = mc.max(10,5);
		
		return (s + " then " + t) ;
	}
}



