package ro.ase.csie.cts.g1087.testare.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TestStudent.class, TestStudentAlteTeste.class })
@IncludeCategory({TestStudent.class, TestStudentAlteTeste.class})
public class SuitaTesteImportante {

}
