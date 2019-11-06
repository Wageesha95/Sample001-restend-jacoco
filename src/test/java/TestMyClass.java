


import static org.testng.Assert.assertEquals;

/*
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;*/
import org.testng.annotations.Test;

import Demo.MyClass;




public class TestMyClass {

	
	
	@Test
	public void contextLoads() {
	}
	
   @Test
    public void testBranch() { 

	   MyClass mc = new MyClass();
	  
       assertEquals(mc.max(3,19),19);

    }
   
   @Test
public void testMin() throws Exception {
	MyClass c = new MyClass();
	c.min(10, 11);
}


    }


