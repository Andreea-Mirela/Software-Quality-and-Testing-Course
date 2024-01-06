package ro.ase.csie.cts.dp.cerinta4.prototype;

public class TestPrototype {
public static void main(String[] args) {
		
		ContClient client1 = new ContClient("miri@gmail.com", "123456");
		
		ContClient client2 = (ContClient) client1.clone();
		ContClient client3 = (ContClient) client1.clone();
		ContClient client4 = (ContClient) client1.clone();
	}
}
