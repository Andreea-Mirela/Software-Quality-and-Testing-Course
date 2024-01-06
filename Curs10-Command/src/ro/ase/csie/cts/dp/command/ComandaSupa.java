package ro.ase.csie.cts.dp.command;

//Command concret pentru Supa

public class ComandaSupa  implements ComandaBucatarie{

	private Bucatar bucatar;
	private String tip;
	
	@Override
	public void gateste() {
		this.bucatar.gatesteSupa(this.tip);
	}
	
	public ComandaSupa(Bucatar bucatar, String tip){
		this.bucatar = bucatar;
		this.tip = tip;
	}
	
}