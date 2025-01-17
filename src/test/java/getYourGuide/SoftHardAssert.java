package getYourGuide;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssert {

    /*
    Hard Assert – Hard Assert throws an AssertException immediately
    when an assert statement fails and test suite continues with next @Test

The disadvantage of Hard Assert – It marks method as fail if
assert condition gets failed and the remaining statements inside the method will be aborted.

To overcome this we need to use Soft Assert. Let’s see what is Soft Assert.

Soft Assert – Soft Assert collects errors during @Test. Soft Assert does not throw an exception
when an assert fails and would continue with the next step after the assert statement.

If there is any exception and you want to throw it then you need to use assertAll() method
as a last statement in the @Test and test suite again continue with next @Test as it is.

     */


    @Test
    public void softAssert(){
        SoftAssert softAssertion= new SoftAssert();
        System.out.println("softAssert Method Was Started");
        softAssertion.assertTrue(false);
        System.out.println("softAssert Method Was Executed even after previous step failed");
        softAssertion.assertAll();
    }

    @Test
    public void hardAssert(){
        System.out.println("hardAssert Method Was Started");
        Assert.assertTrue(false);
        System.out.println("hardAssert Method Was Executed: It will be executed only when all previous steps passed");
    }
}


