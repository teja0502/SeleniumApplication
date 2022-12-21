set projectLocation=E:\SeleniumApplications\TestNGWithLog4jBatch
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml