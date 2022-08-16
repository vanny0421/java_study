package account;

public interface Account {
	public void createAccount(Server server, String id, String userName);
	public void login(String id);
	public void deleteAccount(String id);
}
