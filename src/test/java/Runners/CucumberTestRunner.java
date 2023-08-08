package Runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"StepDeff"},
        //features = {"src/test/java/Features/ValidLogInOrangeHRM.feature"})
        //features = {"src/test/java/Features/RejectedStatusOrangeHRM.feature"})
        //features = {"src/test/java/Features/UpdateStreetCountry.feature"})
        //features = {"src/test/java/Features/AddAttachmentsOrangeHRM.feature"})
        //features = {"src/test/java/Features/DeleteRecordsOrangeHRM.feature"})
        //features = {"src/test/java/Features/LanguagePackagesOrangeHRM.feature"})
        features = {"src/test/java/Features/DisplayRecordsOrangeHRM.feature"})



public class CucumberTestRunner {}