package ro.ase.csie.cts.testare.tema4.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TestProdusConstructorSiSetVanzari.class, TestProdusDouaMetode.class, TestProdusTreiMetode.class })
@IncludeCategory( {CategorieRight.class} )
public class TesteRight {

}
