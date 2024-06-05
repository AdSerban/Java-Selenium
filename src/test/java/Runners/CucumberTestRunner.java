package Runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"StepDeff"},
        //features = {"src/test/java/Features/ui/ValidLogInOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/RejectedStatusOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/UpdateStreetCountry.feature"})
        //features = {"src/test/java/Features/ui/AddAttachmentsOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/DeleteRecordsOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/LanguagePackagesOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/DisplayRecordsOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/AddNewLanguageOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/ChangePasswordOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/VacationLeaveRecordsOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/AddCommentsOnLeaveRequestOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/LeaveRecordsPendingApprovalAndResetDataOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/AddANewJobOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/ChangeProfilePictureOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/AutomationTesterVacanciesOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/ScheduleInterviewCandidateOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/AccessAnEmployeesRecordsOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/AddANewEmployeeOrangeHRM.feature"})
        //features = {"src/test/java/Features/ui/ScheduleFlightPractise.feature"})
        features = {"src/test/java/Features/ui/SelectRadioBtnNice.feature"})




        public class CucumberTestRunner {}