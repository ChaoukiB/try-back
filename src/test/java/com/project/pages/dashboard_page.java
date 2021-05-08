package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard_page {

  public dashboard_page(){
      PageFactory.initElements(Driver.getDriver(), this);
  }
    @FindBy(id = "")
    public WebElement user_name ;
    @FindBy(id = "")
    public WebElement password ;
  @FindBy(id = "")
   public WebElement text ;


  public void login(String user_name, String password){
      this.user_name.sendKeys(user_name);
      this.password.sendKeys(password);
      this.text.click();
  }
}
