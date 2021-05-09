package main.java.pageObjects;

public interface AmazonSigInPasswordPage {

    String EmailChange=".//a[@id='ap_change_login_claim']";
    String Password=".//input[@type='password']";
    String ForgotPassword=".//input[@type='password']";
    String SignInBtn="signInSubmit";
    String KeepMeSignedIn=".//input[@type='checkbox']";
    String DetailsLink=".//a[@id='remember_me_learn_more_link']";
}
