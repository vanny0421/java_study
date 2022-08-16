package account;

public class Web {

	public static void main(String[] args) {
		
		Server server = new Server();
		User dal = new User(server);		
		User sanpellegrino = new User(server);		
		User pompelmo = new User(server);		
		
		Admin aron = new Admin(server, "aron", "박도현");
		Admin vanny = new Admin(server, "vanny", "김베니");
		
		System.out.println("[회원 계정]");
		System.out.println(server.userArr[0][0]);
		System.out.println(server.userArr[0][1]);
		System.out.println(server.userArr[1][0]);
		System.out.println(server.userArr[1][1]);
		System.out.println(server.userArr[2][0]);
		System.out.println(server.userArr[2][1]);
		
		System.out.println("[관리자 계정]");
		System.out.println(server.adminArr[0][0]);
		System.out.println(server.adminArr[0][1]);
		System.out.println(server.adminArr[1][0]);
		System.out.println(server.adminArr[1][1]);
		

		
		
	}
}
