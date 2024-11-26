package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
  
	int c=0;
	int r=1;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		while(c<r) {
			c++;
			return true;
		}
		return false;
	}

}
