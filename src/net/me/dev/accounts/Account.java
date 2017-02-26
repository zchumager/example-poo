package net.me.dev.accounts;

public abstract class Account{
	
	protected String name="";
	protected String accountBusiness="";
	
	public Account() {}
	
	public Account(String name, String accountBusiness) {
		this.name = name;
		this.accountBusiness = accountBusiness;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setAccountBusiness(String accountBusiness) {
		this.accountBusiness = accountBusiness;
	}

	public String getAccountBusiness() {
		return accountBusiness;
	}
}
