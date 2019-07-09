package service;
import java.util.Scanner;
import service.Exception1;
import bean.AccountDetails;
import dao.AccountDao;
import dao.AccountDao1;
public class AccountService1 extends Validator implements AccountService 
{
	Scanner scan=new Scanner(System.in);
	AccountDao dao=new AccountDao1();
	@Override
	public void CreateAccount(AccountDetails user) 
	{
		try {
		if(Validate(user))
		{
			System.out.println("Details Validated");
		dao.CreateAccountDao(user);
		}
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
	}
	@Override
	public void AddMoney(String ANumber,int amount) 
	{
        
		dao.AddMoney(ANumber, amount);
		
	}
	
	@Override
	public AccountDetails ViewAccount(String Anumber) 
	{
	   return dao.ViewAccount(Anumber);
	   
		
	}


	@Override
	public void Transfer(String Account1,String Account2,int amount1) 
	{
		
		dao.Transfer(Account1, Account2, amount1);
		
	}

}
