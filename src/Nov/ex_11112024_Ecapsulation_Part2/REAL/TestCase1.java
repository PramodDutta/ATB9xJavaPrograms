package Nov.ex_11112024_Ecapsulation_Part2.REAL;

public class TestCase1 extends BaseClass{


    public TestCase1(){
        super(); // Parent Constructor - Super - Means Parent
        // this - current Object
        System.out.println("DC - TC1");

    }

    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }
}
