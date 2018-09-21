package javaPart3;

public class TestBank extends HdfcBank{
	
	
	public static void main(String[] args) {
		System.out.println(Bank.numTransact);
		
		HdfcBank hb = new HdfcBank();
		hb.balanceCheck();
		hb.transferMoney();
		hb.getLoan();
		hb.doWithdrawal();
		hb.getDeposit();
		
		Bank b = new HdfcBank();
		
		b.balanceCheck();
		b.transferMoney();
		b.getLoan();
		
		

	}

}
