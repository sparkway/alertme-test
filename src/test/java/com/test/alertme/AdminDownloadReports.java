package com.test.alertme;
import com.test.util.SeleniumUtil;
import com.test.util.TestConstants;
import org.openqa.selenium.WebElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;



public class AdminDownloadReports extends SeleniumUtil {

    private static Logger logger = LoggerFactory.getLogger(AdminDownloadReports.class);
    private final String SELENIUM_PROPERTIES_HTML_ID_FILENAME = "AlertMe_HTML_ID.properties";
    private final String SELENIUM_PROPERTIES_ASSERT_VALUES_FILENAME = "AlertMe_Assert_Values.properties";

    @BeforeMethod
    protected void seleniumTest_suite_pre_function() throws Exception {
        try {
            System.out.println("Inside before method");
            logger.debug("Preparing Test Suite");
            seleniumTest_properties_Assert_Values_file = SELENIUM_PROPERTIES_ASSERT_VALUES_FILENAME;
            seleniumTest_properties_HTML_ID_file = SELENIUM_PROPERTIES_HTML_ID_FILENAME;
            System.out.println("going to call seleniumTest_suite_setup");
            seleniumTest_suite_setup();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public static String downloadPath = System.getProperty("user.dir");


    /**
     *  [AL-26]
         ## readers theme report
         1)Login as an admin
         2)Click on Report-->reader.
         2)click on download report.
         3)verify if downloaded file is present in downloadpath.
         4)if not then,Test fail otherwise success
     */
    @Test(priority = TestConstants.NO_1)
    public void DownloadReaderReport() throws Exception
    {

        System.out.println("TEST: Downloading Readers's theme report and checking its file extension");
        logger.info("TEST : Downloading Reader's theme report and checking its file extension");

        browser_wait(TestConstants.WAIT_2000);
        //Login as an admin
        sparkWayLogin(seleniumTest_properties_assert_values_get("alertme_adminlogin_textfield_Assert_values"),seleniumTest_properties_assert_values_get("alertme_adminlogin_password_Assert_values"));
        browser_wait(TestConstants.WAIT_3000);

        //click on report
        WebElement alertmeReport = doc_get("alertme_Dashboard_report_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeReport.click();

        //click on reader
        WebElement alertmeReaders = doc_get("alertme_report_reader_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeReaders.click();

        //Click on download report button
        WebElement alertmeButton = doc_get("alertme_download_buton_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeButton.click();


        //verifying downloaded file from downloadPath
        Assert.assertTrue(isFileDownloaded(downloadPath, "readers_topics.csv"), "Failed to download Expected document");

    }

    /**
     * [AL-26]
         ## ctr report
         1)Login as an admin
         2)Click Report-->CTR
         2)click on download report.
         3)verify if downloaded file is present in downloadpath.
         4)if not then,Test fail otherwise success
     */
    @Test(priority = TestConstants.NO_2)
    public void DownloadCTRReport() throws Exception
    {
        System.out.println("TEST: Downloading CTR report and checking its file extension");
        logger.info("TEST : Downloading CTR report and checking its file extension");

        browser_wait(TestConstants.WAIT_2000);
        //Login as an admin
        sparkWayLogin(seleniumTest_properties_assert_values_get("alertme_adminlogin_textfield_Assert_values"),seleniumTest_properties_assert_values_get("alertme_adminlogin_password_Assert_values"));
        browser_wait(TestConstants.WAIT_3000);

        //click on report
        WebElement alertmeReport = doc_get("alertme_Dashboard_report_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeReport.click();

        //click on ctr
        WebElement alertmeReaders = doc_get("alertme_report_ctr_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeReaders.click();

        //Click on download report button
        WebElement alertmeButton = doc_get("alertme_download_buton_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeButton.click();

        //verifying downloaded file from downloadPath
        Assert.assertTrue(isFileDownloaded(downloadPath, "CtrReport.csv"), "Failed to download Expected document");

    }

    /**
     * [AL-26]
       ## mfa report
       1)Login as an admin
       2)Click MFA report on dashboard
       2)click on download report.
       3)verify if downloaded file is present in downloadpath.
       4)if not then,Test fail otherwise success
     */
    @Test(priority = TestConstants.NO_3)
    public void DownloadMFAReport() throws Exception
    {
        System.out.println("TEST: Downloading MFA report and checking its file extension");
        logger.info("TEST : Downloading MFA report and checking its file extension");


        browser_wait(TestConstants.WAIT_2000);
        //Login as an admin
        sparkWayLogin(seleniumTest_properties_assert_values_get("alertme_adminlogin_textfield_Assert_values"),seleniumTest_properties_assert_values_get("alertme_adminlogin_password_Assert_values"));
        browser_wait(TestConstants.WAIT_3000);


        //click on report
        WebElement alertmeReport = doc_get("alertme_Dashboard_report_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeReport.click();

        //click on mfa
        WebElement alertmeReaders = doc_get("alertme_report_mfa_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeReaders.click();

        //Click on download report button
        WebElement alertmeButton = doc_get("alertme_download_buton_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeButton.click();


        //verifying downloaded file from downloadPath
        Assert.assertTrue(isFileDownloaded(downloadPath, "MfaReport.csv"), "Failed to download Expected document");

    }

    /**
     * [AL-26]
       Subscriber report
       1)Login as admin
       2)Click on report-->subscribers.
       2)click on download report.
       3)verify if downloaded file is present in downloadpath.
       4)if not then,Test fail otherwise success
     */

    @Test(priority = TestConstants.NO_4)
    public void DownloadPublisherReport() throws Exception
    {
        System.out.println("TEST: Downloading Publisher report and checking its file extension");
        logger.info("TEST : Downloading Publisher report and checking its file extension");

        browser_wait(TestConstants.WAIT_2000);
        //Login as an admin
        sparkWayLogin(seleniumTest_properties_assert_values_get("alertme_adminlogin_textfield_Assert_values"),seleniumTest_properties_assert_values_get("alertme_adminlogin_password_Assert_values"));
        browser_wait(TestConstants.WAIT_3000);

        //click on report
        WebElement alertmeReport = doc_get("alertme_Dashboard_report_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeReport.click();

        //click on subscriber
        WebElement alertmeReaders = doc_get("alertme_report_subscriber_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeReaders.click();

        //Click on download report button
        WebElement alertmeButton = doc_get("alertme_download_buton_html_id",browser);
        browser_wait(TestConstants.WAIT_3000);
        alertmeButton.click();

        //verifying downloaded file from downloadPath
        Assert.assertTrue(isFileDownloaded(downloadPath, "SubscriptionReport.csv"), "Failed to download Expected document");


    }

}