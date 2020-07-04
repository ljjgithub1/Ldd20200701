package testing.vip18.MavenVipJunit18;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestMaven01 {

	

	

	@Test
	public void test() {
		System.out.println("-------------JunitTestMaven01被执行了--------");
		LoginSample ls=new LoginSample();
		ls.login("111", "222");
		
	}

}
