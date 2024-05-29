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
        //features = {"src/test/java/Features/DisplayRecordsOrangeHRM.feature"})
        //features = {"src/test/java/Features/AddNewLanguageOrangeHRM.feature"})
        //features = {"src/test/java/Features/ChangePasswordOrangeHRM.feature"})
        //features = {"src/test/java/Features/VacationLeaveRecordsOrangeHRM.feature"})
        //features = {"src/test/java/Features/AddCommentsOnLeaveRequestOrangeHRM.feature"})
        //features = {"src/test/java/Features/LeaveRecordsPendingApprovalAndResetDataOrangeHRM.feature"})
        //features = {"src/test/java/Features/AddANewJobOrangeHRM.feature"})
        //features = {"src/test/java/Features/ChangeProfilePictureOrangeHRM.feature"})
        //features = {"src/test/java/Features/AutomationTesterVacanciesOrangeHRM.feature"})
        //features = {"src/test/java/Features/ScheduleInterviewCandidateOrangeHRM.feature"})
        //features = {"src/test/java/Features/AccessAnEmployeesRecordsOrangeHRM.feature"})
        //features = {"src/test/java/Features/AddANewEmployeeOrangeHRM.feature"})
        //features = {"src/test/java/Features/ScheduleFlightPractise.feature"})
        features = {"src/test/java/Features/SelectRadioBtnNice.feature"})




        public class CucumberTestRunner {}