package ro.ase.csie.cts.dp.simplefactory;

import ro.ase.csie.cts.dp.simplefactory.documente.DocumentGeneric;

public class Test {
	public static void main(String[] args) {
		DocumentGeneric d1 = new DocumentGeneric("Test.txt",1);
		System.out.println("A fost creat un document");
		
		DocumentGeneric d2 = new DocumentGeneric("Test2.txt",1);
		DocumentGeneric d3 = new DocumentGeneric("Test.pdf",4);
	}
}
