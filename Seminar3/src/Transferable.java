
public interface Transferable {
	public void transfer(Receivable destination, long amount) throws InsuficientFundException; //interfata pentru implementarea transferurilor intre carduri
}
