import java.util.*;
public class Bank_final {
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		String name;
		String accno;
		double bal;

		BankAccount b[] = new BankAccount[100];
		n=0;

		
		int choice=0;
		while (choice != 7)
		{
			System.out.println("\n**************************Banking System Application**************************\n");
			System.out.println("\t\t\t\t\t\t\t-by riya,devesh and ritvik\n");
			System.out.println("1.Create Account\n2.Display all accounts\n3.Search by Account Number\n4.Deposit amount\n5.Withdraw amount\n6.Transfer amount\n7.Exit");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("\nEnter name:");
				name = sc.next();
				System.out.println("Enter 12 digit account number:");
				accno = sc.next();
				try
				{
					if(accno.length()==12)
				{
					System.out.println("");
				}
				else
				{
     			throw new AccountnotValidException();
				}
				 }
                 catch(AccountnotValidException a)
				 {
				 System.out.println("Please enter valid account number..!!");
				break;
			    }
				System.out.println("Enter amount to deposit:");
				bal = sc.nextDouble();
				b[n] = new BankAccount(name,accno,bal);
				n+=1;
				break;
				
			  case 2:
				for (int i=0;i<n;i++)
				{
					System.out.println("Name:"+b[i].getName());
					System.out.println("Account number:"+b[i].getAccno());
					System.out.println("Balance:"+b[i].getBal());
					System.out.println("\n");
				}
				break;
			case 3:
				String d;
				int flag=0;
				System.out.println("Enter 12 digit account number:");
				d = sc.next();
				try
				{
					if(d.length()==12)
				{
					System.out.println("");
				}
				else
				{
     			throw new AccountnotValidException();
				}
				 }
                 catch(AccountnotValidException a)
				 {
				 System.out.println("Please enter valid account number..!!");
				break;
			    }
				for (int i=0;i<n;i++)
				{
					if (b[i].getAccno().equals(d))
					{
						System.out.println("Name:"+b[i].getName());
						System.out.println("Account number:"+b[i].getAccno());
						System.out.println("Balance:"+b[i].getBal());
						flag=1;
						break;
					}
				}
				if (flag==0)
				{
					System.out.println("Account not Found");
				}
				break;
			case 4:
				flag=0;
				System.out.println("Enter 12 digit account number:");
				accno = sc.next();
				try
				{
					if(accno.length()==12)
				{
					System.out.println("");
				}
				else
				{
     			throw new AccountnotValidException();
				}
				 }
                 catch(AccountnotValidException a)
				 {
				 System.out.println("Please enter valid account number..!!");
				break;
			    }
				System.out.println("Enter amount to be deposited:");
				double amt = sc.nextDouble();
				for (int i=0;i<n;i++)
				{
					if (b[i].getAccno().equals(accno))
					{
						b[i].deposit(amt);
						flag=1;
						break;
					}
					
				}
				if (flag==0)
				{
					System.out.println("\nAccount not found");
				}
				break;
			
			case 5:
				flag=0;
				System.out.println("Enter 12 digit account number:");
				accno = sc.next();
				try
				{
					if(accno.length()==12)
				{
					System.out.println("");
				}
				else
				{
     			throw new AccountnotValidException();
				}
				 }
                 catch(AccountnotValidException a)
				 {
				 System.out.println("Please enter valid account number..!!");
				break;
			    }
				System.out.println("Enter amount to be withdrawn:");
				int amount = sc.nextInt();
				for (int i=0;i<n;i++)
				{
					if (b[i].getAccno().equals(accno))
					{
						b[i].withdraw(amount);
						flag=1;
						break;
					}
				}
				if (flag==0)
				{
					System.out.println("\nAccount not found");
				}
				break;
			case 6:
				flag=0;
				System.out.println("Enter your account number:");
				accno=sc.next();
				try
				{
					if(accno.length()==12)
				{
					System.out.println("");
				}
				else
				{
     			throw new AccountnotValidException();
				}
				 }
                 catch(AccountnotValidException a)
				 {
				 System.out.println("Please enter valid account number..!!");
				break;
			    }
                System.out.println("Enter amount to be transfered:");
				int amountt = sc.nextInt();
				for (int i=0;i<n;i++)
				{
					if (b[i].getAccno().equals(accno))
					{
						b[i].withdraw1(amountt);
						flag=1;
						break;
					}
				}
				if (flag==0)
				{
					System.out.println("\nAccount not found");
				}
				System.out.println("Enter the account number in which you want to transfer:");
				accno=sc.next();
				try
				{
					if(accno.length()==12)
				{
					System.out.println("");
				}
				else
				{
     			throw new AccountnotValidException();
				}
				 }
                 catch(AccountnotValidException a)
				 {
				 System.out.println("Please enter valid account number..!!");
				break;
			    }
				for (int i=0;i<n;i++)
				{
					if (b[i].getAccno().equals(accno))
					{
						b[i].deposit1(amountt);
						flag=1;
						break;
					}
				}
				
			 case 7:
				 break;
			 default:
				 System.out.println("Invalid choice");
				 break;
			}
		}
      sc.close();
	}

}
