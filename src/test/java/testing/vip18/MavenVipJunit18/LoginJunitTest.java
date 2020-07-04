package testing.vip18.MavenVipJunit18;

import static org.junit.Assert.*;



import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



//写在测试类的前面,必须写在测试类的外面
@RunWith(Parameterized.class)  
//注解测试类的  修饰整个测试类
public class LoginJunitTest {
	private static LoginSample ls;
	public static String user;
	public static String pwd;
	private static String expecteMSG;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("----------测试前准备，完成ls实例化---------------");
		ls=new LoginSample();
	}
	
	public  LoginJunitTest(String s1,String s2,String s3) {
		user=s1;
		pwd=s2;
		expecteMSG=s3;
	}

//	@Test
//	public void nulltest() {
////		fail("Not yet implemented");
//		System.out.println("roy");
//		ls.login(null, "123456");
//		ls.login("roy", null);
//		ls.login("roy", "123456");
//	}

	@Test
	public void test1() {

		ls.login(user, pwd);
		assertEquals("登录测试的结果为", expecteMSG, ls.resultMSG);
	}
	
	 //生成和返回测试数据，供测试类使用，通常返回object二维数组
	@Parameters (name="用户名{0}，密码{1},预期{2}")
	public static Object[][]  loginDate(){
		Object[][] gg=new Object[][] {
			{"roy","123456","恭喜"},
			{"roy123","123456","用户名或密码错误"},
			{"roy","12344444444444444888","用户名或密码长是3--16位"},
			{null,"1234","用户名或密码不能为空"},
			{"Roy","123456","恭喜您，登录成功"},
			{"riiw","1234567","  "}
//			{"rr","123456"},
//			{"roy","123456"}
		};
		return gg;
	}

}
