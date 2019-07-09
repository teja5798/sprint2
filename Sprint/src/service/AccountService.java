package service;
import bean.AccountDetails;

public interface AccountService 
{
	public void CreateAccount(AccountDetails user);
	public AccountDetails ViewAccount(String aNumber1);
	public void AddMoney(String ANumber,int amount);
	public void Transfer(String Account1,String Account2,int amount1);
	
	

}

