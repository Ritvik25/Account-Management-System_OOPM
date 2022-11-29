public class BankAccount {
	
	private String name;
	private String accno;
	private double balance;
    private String accno_s,accno_r;
	BankAccount(String name,String accno,double balance)
	{
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccno(){
		return accno;
	}
	
	public void setAccno(String accno) {
		this.accno = accno;
	}
	
	public double getBal() {
		return balance;
	}
	
	public void setBal(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		System.out.println("Name:"+name);
		System.out.println("Account number:"+accno);
		System.out.println("Balance before depositing:"+balance);
		balance+=amount;
		System.out.println("Balance after depositing:"+balance);
		
	}
	public void deposit1(double amount)
	{
		balance+=amount;
		System.out.println("Balance after depositing:"+balance);
		
	}
	
	public void withdraw(double amount)
	{
		System.out.println("Name:"+name);
		System.out.println("Account number:"+accno);
		try 
		{
			if (balance-amount>0){
				System.out.println("Balance before withdrawing:"+balance);
				balance-=amount;
				System.out.println("Balance after withdrawing:"+balance);
			}
		else
		{
			throw new InsufficientBalanceException();
		}
	}
	catch(InsufficientBalanceException a)
	{
		System.out.println("Insufficient Balance!!");
	}
		
		
	}
	public void withdraw1(double amount)
	{
		if (balance-amount<0)
		{
			System.out.println("Insufficient balance");
			return;
		}
		balance-=amount;
		System.out.println("Balance after withdrawing:"+balance);
		
	}

	public void transfer(double amount)
	{
		System.out.println("Name:"+name);
		System.out.println("Account number of sender:"+accno_s);
        System.out.println("Account number of reciever:"+accno_r);
        
		System.out.println("Updated balance after transfering:"+balance);
		balance-=amount;
		System.out.println("Updated balance after recieving money:"+balance);
        return;
        
	}
		
}
