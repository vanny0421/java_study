package account;

import java.util.Scanner;

public class User implements Account {

	Scanner sc = new Scanner(System.in);

	String id;
	String userName;
	Server server;
	
	
	public User(Server server) {
		this.server = server;
		System.out.println("등록하실 ID 입력 : ");
		this.id = sc.next();
		System.out.println("UserName 입력 : ");
		this.userName = sc.next();
		createAccount(this.server, this.id, this.userName);
	}
	
	@Override
	public void createAccount(Server server, String id, String userName) {
		String[] st = new String[2];
		st[0] = id;
		st[1] = userName;
		
		server.userArr[server.userIndex++] = st;
		
	}

	@Override
	public void login(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(String id) {
		// TODO Auto-generated method stub
		
	}
}
