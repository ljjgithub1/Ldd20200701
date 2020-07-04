package testing.vip18.MavenVipJunit18;

public class LoginSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String resultMSG="";
	
			
	public boolean login(String ln,String pwd) {
		if(ln!=null&&pwd!=null) {
			
		if(ln.length()>2&&ln.length()<17&&pwd.length()>2&&pwd.length()<17) {
			if(ln.equals("roy")&&pwd.equals("123456")) {
			resultMSG="恭喜您，登录成功";
			System.out.println("恭喜您，登录成功！！");
			return true;
			}else {
				resultMSG="用户名或密码错误";
				System.out.println("用户名或密码错误");
				return false;
			}
			}else {
				resultMSG="用户名或密码长是3--16位";
				System.out.println("用户名或密码长是3--16位");
				return false;
			}
		}else{
			resultMSG="用户名或密码不能为空";
			System.out.println("用户名或密码不能为空");
			return false;
		}
}
}