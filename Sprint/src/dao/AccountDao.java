package dao;
import bean.AccountDetails;
public interface AccountDao {

		public void CreateAccountDao(AccountDetails user);
		public AccountDetails ViewAccount(String AccountNumber);
		public void AddMoney(String AccountNumber, int Amount);
		public void Transfer(String AccountNumber1,String AccountNumber2, int Amount);
		

	}
