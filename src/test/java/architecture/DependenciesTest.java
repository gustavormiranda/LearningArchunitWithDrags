package architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "", importOptions = ImportOption.DoNotIncludeTests.class)
public class DependenciesTest {

    @ArchTest
    public static final ArchRule myTest =
            classes().that().haveSimpleNameEndingWith("Controller")
            .should().bePublic();



}
