package account;

public class Admin implements Account {
	
	String id;
	String userName;
	Server server;
	
	public Admin(Server server, String id, String userName) {
		this.server = server;
		this.id = id;
		this.userName = userName;
		
		createAccount(this.server, this.id, this.userName);
	}

	@Override
	public void createAccount(Server server, String id, String userName) {
		
		String[] st = new String[2];
		st[0] = id;
		st[1] = userName;
		
		server.adminArr[server.adminIndex++] = st;
		
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
