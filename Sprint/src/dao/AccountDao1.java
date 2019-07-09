package dao;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import bean.AccountDetails;
import service.Exception1;
public class AccountDao1 implements AccountDao{

	    Map<String, AccountDetails> userlist=new HashMap<String, AccountDetails>();
		AccountDetails user=new AccountDetails();

		@Override
		public void CreateAccountDao(AccountDetails user) {
			Random rand=new Random();
			int num=rand.nextInt(9000)+1000;
			String AccountNumber=String.valueOf(num);
			userlist.put(AccountNumber, user);
			System.out.println("Succesfully Created your Account Number is="+AccountNumber);
		}

		@Override
		public AccountDetails ViewAccount(String AccountNumber) 
		{
			
			if(userlist.containsKey(AccountNumber))
			{
				user=userlist.get(AccountNumber);
			}
			return user;
			
		}

		@Override
		public void AddMoney(String AccountNumber, int Amount) {
	try {	
			if(!userlist.containsKey(AccountNumber))
			{
				throw new Exception1();
			}
				else{
				user=userlist.get(AccountNumber);
				int temp;
				temp=user.getBalance()+Amount;
				user.setBalance(temp);
				System.out.println("Successfully added the money to account");
			}
		}
catch(Exception1 e)
	      {
	           System.out.println(e);
          }
		}
		@Override
		public void Transfer(String AccountNumber1, String AccountNumber2, int Amount) 
		{
			if(userlist.containsKey(AccountNumber1))
			{
				System.out.println("Account 1 Found");
				AccountDetails user1=userlist.get(AccountNumber1);
				if(user1.getBalance()>=Amount)
				{
					System.out.println("Account 1 validated");
				}
				else
				{
					System.out.println("Requrired balance is not available");
				}
				try {
				if(!userlist.containsKey(AccountNumber2))
				{
					throw new Exception();
				}
				else {
					System.out.println("Account2 Found");
					AccountDetails user2=userlist.get(AccountNumber2);
					int temp1=user1.getBalance();
					int temp2=user2.getBalance();
					temp1=temp1-Amount;
					temp2=temp2+Amount;
					user1.setBalance(temp1);
					user2.setBalance(temp2);
					System.out.println("Transaction Successful");
				}
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}			
		}		
	}