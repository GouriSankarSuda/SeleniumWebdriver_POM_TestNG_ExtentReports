package main.java.pageObjects;

public interface AmazonNewUserCreationPage {

  String NewAccount_YourName=".//input[@id='ap_customer_name']";
  String NewAccount_MobileNumber_Country= ".//div[@class='a-fixed-left-grid-col a-col-left']";
  String NewAccount_MobileNUmber=".//input[@id='ap_phone_number']";
  String NewAccount_Email=".//input[@id='ap_email']";
  String NewAccount_Password=".//input[@id='ap_password']";
  String NewAccount_Continue=".//span[@id='auth-continue']";
  String AlreadyHaveAnAccount_SignIn=".//a[contains (@href,'/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&prevRID=149SFEVTSRH82SKRACKA&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0')]";
  String CreateAFreeBusinessAccount=".//a[@id='ab-registration-link']";





}
