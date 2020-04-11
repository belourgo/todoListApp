package belourgo.pragma.ci;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("belourgo.pragma.ci");

        noClasses()
            .that()
            .resideInAnyPackage("belourgo.pragma.ci.service..")
            .or()
            .resideInAnyPackage("belourgo.pragma.ci.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..belourgo.pragma.ci.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
