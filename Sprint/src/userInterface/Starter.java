package userInterface;
import java.util.Scanner;
import bean.AccountDetails;
import service.AccountService;
import service.AccountService1;
public class Starter 
{
@SuppressWarnings("resource")
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	
	AccountService service=new AccountService1();
    
    while(true)
			{
				System.out.println("1.Create Account\n2.Search for an User\n3.Add Money to wallet\n4.Transfer Money\n5.Exit \nEnter your Choice");
				int choice=scan.nextInt();
				switch(choice)
				{
				case 1:
					AccountDetails user=new AccountDetails();
					System.out.println("Account Creation");
					System.out.println("............................");
					System.out.println("Enter your Name=");
					user.setName(scan.next());
					System.out.println("Enter your Phone Number=");
					user.setPhoneNumber(scan.nextLong());
					System.out.println("Enter your Email=");
					user.setEmailid(scan.next());
					service.CreateAccount(user);
					break;
				
				
				case 2:
					System.out.println("Details");
					System.out.println("............................");
					System.out.println("Enter the Account Number=");
					String ANumber1=scan.next();
					AccountDetails user1=service.ViewAccount(ANumber1);
					System.out.println("Name="+user1.getName()+"\nPhone="+user1.getPhoneNumber()+"\nEmail="+user1.getEmailid()+"\nBalance="+user1.getBalance());
				
					break;
				
				case 3:
					System.out.println("Adding Money to Wallet");
					System.out.println("............................");
					System.out.println("Enter the Account Number");
					String ANumber=scan.next();
					System.out.println("Enter the amount to add=");
					int amount=scan.nextInt();
					service.AddMoney(ANumber,amount);
					
					break;
				
				case 4:
					System.out.println("Transfer Window");
					System.out.println("............................");
					System.out.println("Enter the sender Acoount number");
					String Account1=scan.next();
					System.out.println("Enter the Reciever Account NUmber");
					String Account2=scan.next();
					System.out.println("Enter the amount to be transferred");
					int amount1=scan.nextInt();
					service.Transfer(Account1,Account2,amount1);
					break;
				case 5:
					System.out.println("Thanks for using");
					System.exit(0);
				default:
					System.out.println("Invalid choice enter again");
					break;
				}
			}
		}

	}