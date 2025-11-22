package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    public static ExtentReports createInstance() {

        String reportPath = System.getProperty("user.dir") + "/Reports/ExtentReport.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);

        reporter.config().setReportName("Automation Test Report");
        reporter.config().setDocumentTitle("Test Execution Report");

        extent = new ExtentReports();
        extent.attachReporter(reporter);

        return extent;
    }
}