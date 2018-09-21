package javaPart3;

public class HdfcBank implements Bank{
	
	public void balanceCheck(){
		System.out.println("Balance Check...");
	}
	
	public void transferMoney(){
		System.out.println("Transfering Money...");
	}
	
	public void getLoan(){
		System.out.println("Getting Loan...");
	}
	
	public void getDeposit(){
		System.out.println("Depositting Amount...");
	}
	
	public void doWithdrawal(){
		System.out.println("Withdrawal inprogress... wait");
	}

}
