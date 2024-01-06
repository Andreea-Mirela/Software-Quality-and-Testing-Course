
public interface Payable {

	void withdraw(long amount) throws InsuficientFundException;
}
