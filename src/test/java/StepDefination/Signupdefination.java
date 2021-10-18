package StepDefination;

import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Hook.hook;

public class Signupdefination {

	WebDriver driver=hook.driver;
//background
@Given("Admin is on the login page of Real Estate")
public void admin_is_on_the_login_page_of_Real_Estate() {
	try {
		String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"titlebar\"]/div/div/div/h2")).getText();
		String actualtext1="My Profile";
		Assert.assertEquals(exceptedtext1, actualtext1);
		System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			System.out.println("Admin is Not on Profile page");
			Assert.fail();
		}
}

@When("Admin enters Username {string} and Password {string}")
public void admin_enters_Username_and_Password(String string, String string2) {
	try {
		driver.findElement(By.name("log")).sendKeys("mohankrishna176@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Secret@123&&");
		System.out.println("Username and password entered");
		}
		catch(Exception e) {
			System.out.println("Can not enter username and password");
		}
}

@When("Click on login button")
public void click_on_login_button() {
	  try {
	    	driver.findElement(By.name("login")).click();
	    	System.out.println("Login button clicked");
	    }
	    catch(Exception e) {
	    	System.out.println("Cant click on Login button");
	    }
}

@Given("Admin is on Dashboard page")
public void admin_is_on_Dashboard_page() {
	try {
		String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/h1")).getText();
		String actualtext1="Dashboard";
		Assert.assertEquals(exceptedtext1, actualtext1);
		System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			System.out.println("Admin is Not on Dashboard page");
			Assert.fail();
		}
	
}

@When("Admin clicks on properties")
public void admin_clicks_on_properties() {
	 try {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]")).click();
		  driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[5]/a")).click();
		  System.out.println("Admin goes to Regions Page");
	  }
	  catch(Exception e) {
		  System.out.println("Cant go to region page");
	  }
}

@Then("Admin will navigate to Region page in Real Estate")
public void admin_will_navigate_to_Region_page_in_Real_Estate() {
	try {
		Thread.sleep(1000);
		String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/h1")).getText();
		String actualtext1="Regions";
		Assert.assertEquals(exceptedtext1, actualtext1);
		
		System.out.println("Admin is on Region Page");
		}
		catch(Exception e) {
			System.out.println("Admin is Not on Region page"+e);
			Assert.fail();
		}
}

//scenario

@Given("Admin is on Regions Page in Real Estate")
public void admin_is_on_Regions_Page_in_Real_Estate() {
	try {
		String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/h1")).getText();
		String actualtext1="Regions";
		Assert.assertEquals(exceptedtext1, actualtext1);
		
		 System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			System.out.println("Admin is Not on Region page");
			Assert.fail();
		}

}

@When("Admin enters Name {string},Slug {string} and Description {string} and selects parent region")
public void admin_enters_Name_Slug_and_Description_and_selects_parent_region(String name, String slug, String desc) {
   try {
	   driver.findElement(By.xpath("//*[@id=\"tag-name\"]")).sendKeys(name);
	   driver.findElement(By.xpath("//*[@id=\"tag-slug\"]")).sendKeys(slug);
	   driver.findElement(By.xpath("//*[@id=\"tag-description\"]")).sendKeys(desc);
	   org.openqa.selenium.support.ui.Select parentregion=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@id=\"parent\"]")));
	   parentregion.selectByIndex(1);
	   
	   //String str = driver.findElement(By.xpath("//*[@id=\"tag-name\"]")).getText();
	  
   }
   catch(Exception e) {
	   System.out.println("Admin is Not able to type");
		Assert.fail();
   }
}

@When("clicks on add new Region button")
public void clicks_on_add_new_Region_button() {
  try {
     
	driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
	  System.out.println("Admin is able to click on add new region and add new region");
	  
	}
  catch(Exception e) {
	  System.out.println("Admin is Not able to click on add new region and add new region"+e);
		Assert.fail();
  }
}

@When("Admin enters Name {string} in search region text in displayed result in Region page")
public void admin_enters_Name_in_search_region_text_in_displayed_result_in_Region_page(String name) {
try {  
	driver.findElement(By.xpath("//*[@id=\"tag-search-input\"]")).sendKeys(name);
	 System.out.println("Admin is able to type in search region");
}
   catch(Exception e) {
	   System.out.println("Admin is Not able to type in search region");
		Assert.fail();
   }
}

@When("clicks on search button on displayed result in Region page.")
public void clicks_on_search_button_on_displayed_result_in_Region_page() {
	 try {
		  driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();
		  System.out.println("Admin is able to click on search button");
	  }
	  catch(Exception e) {
		  System.out.println("Admin is Not able to click on search button");
			Assert.fail();
	  }
}

@Then("Admin will see the new added region name{string} in displayed result in Region page.")
public void admin_will_see_the_new_added_region_name_in_displayed_result_in_Region_page(String name) {
	try {
		String exceptedtext1=driver.findElement(By.className("row-title")).getText();
		String actualtext1=name;
		Assert.assertEquals(exceptedtext1, actualtext1);
		System.out.println("New region is added in displayed result");
		
		//String str = driver.findElement(By.xpath("//*[@id=\"tag-name\"]")).getText();
		System.out.println(exceptedtext1);
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(exceptedtext1);
		boolean b = m.find();

		if (b) {	System.out.println("Name conatins special characters");
		   Assert.fail();}
	System.out.println("Correct Name Accepted");
	}
	catch(Exception e) {
		  System.out.println("Admin can't see new region is displayed result"+e);
			Assert.fail();
	}

}

//scenario 
@When("Admin clicks on edit option of a particular record in displayed result.")
public void admin_clicks_on_edit_option_of_a_particular_record_in_displayed_result() {
  try {
	  WebElement destination =driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr"));
	  Actions obj = new Actions(driver);
	  obj.moveToElement(destination).build().perform();
	 driver.findElement(By.xpath("//*[@class=\"row-actions\"]/span[1]")).click();
	
	  
	  System.out.println("Admin is able to click on edit option of a particular record in displayed result");
	  }
  catch(Exception e) {
	  System.out.println("Admin can't click on edit option of a particular record in displayed result"+e);
		Assert.fail();
  }
}

@Then("Admin will navigate to Edit Region Page")
public void admin_will_navigate_to_Edit_Region_Page() {
	try {
	String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[2]/h1")).getText();
	String actualtext1="Edit Region";
	Assert.assertEquals(exceptedtext1, actualtext1);
	
	 System.out.println("Admin is on edit page");
	}
catch(Exception e) {
	   System.out.println("Admin is Not able to type updated details in edit page"+e);
		Assert.fail();
}

}

@When("Admin enters the modified Name {string},Slug {string} and Description {string} and selects parent region")
public void admin_enters_the_modified_Name_Slug_and_Description_and_selects_parent_region(String name, String slug, String desc) {
	try {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();  
		driver.findElement(By.xpath("//*[@id=\"slug\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"description\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
		   driver.findElement(By.xpath("//*[@id=\"slug\"]")).sendKeys(slug);
		   driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(desc);
		   org.openqa.selenium.support.ui.Select parentregion=new org.openqa.selenium.support.ui.Select(driver.findElement(By.name("parent")));
		   parentregion.selectByIndex(1);
		   System.out.println("All details of region is updated in edit page");

			//String str= driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr[2]/td[1]/strong/a")).getText();
			System.out.println(name);
			Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(name);
			boolean b = m.find();

			if (b) {
				System.out.println("Name contains special characters");
				Assert.fail();
			}
			  
		
		
	    System.out.println("Correct Name Accepted");
		   
	   }
	   catch(Exception e) {
		   System.out.println("Admin is Not able to type updated details in edit page"+e);
			Assert.fail();
	   }
}

@When("clicks on add Update button of edit page")
public void clicks_on_add_Update_button_of_edit_page() {
try {

    WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"edittag\"]/div/input"));
    JavascriptExecutor jsp = (JavascriptExecutor)driver;
    jsp.executeScript("arguments[0].click()", searchButton);

	
	//driver.findElement(By.xpath("//*[@id=\"edittag\"]/div/input")).click();
	System.out.println("Admin can click on UPDATE button in edit Page");
	Thread.sleep(3000);
	
}
catch(Exception e) {
	System.out.println("Admin can't click on UPDATE button in edit Page"+e);
	Assert.fail();
}
}

@Then("Admin will see validation message of updated item {string}")
public void admin_will_see_validation_message_of_updated_item(String val) {
	try {
		String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"message\"]/p[1]/strong")).getText();
		String actualtext1=val;
		Assert.assertEquals(exceptedtext1, actualtext1);
		
		 System.out.println("Admin can see validation message of updated region");
		 

			
		}
		catch(Exception e) {
			System.out.println("Admin can't see validation message of updated region"+e);
			Assert.fail();
		}
}

@When("clicks on Back to Categories link in edit page")
public void clicks_on_Back_to_Categories_link_in_edit_page() {
	try {
		 WebElement searchButton = driver.findElement(By.xpath("//*[@class=\"updated\"]/p[2]/a"));
		    JavascriptExecutor jsp = (JavascriptExecutor)driver;
		    jsp.executeScript("arguments[0].click()", searchButton);

		//driver.findElement(By.xpath("//*[@class=\"updated\"]/p[2]/a")).click();
		System.out.println("Admin can click on Back to categories link in edit Page");
		
	
	}
	catch(Exception e) {
		System.out.println("Admin can't click on Back to categories link in edit Page"+e);
		Assert.fail();
	}
 
}


@When("Admin will click on delete button")
public void admin_will_click_on_delete_button() {
	try {

    WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"delete-link\"]/a"));
    JavascriptExecutor jsp = (JavascriptExecutor)driver;
	    jsp.executeScript("arguments[0].click()", searchButton);
	//	driver.findElement(By.xpath("//*[@id=\"delete-link\"]/a"));

		System.out.println("Admin can click on DELETE button in edit Page");
		Alert alert=driver.switchTo().alert();
		String message=alert.getText();
		System.out.println(message);
	
		alert.accept();
		System.out.println("Accepted delete alert");
		
	}
	catch(Exception e) {
		System.out.println("Admin can't click on DELETE button in edit Page"+e);
		Assert.fail();
	}

}


//scenario
@When("Admin clicks on one or more checkboxes in displayed result on Region Page")
public void admin_clicks_on_one_or_more_checkboxes_in_displayed_result_on_Region_Page() {
    try {
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"cb-select-all-1\"]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"cb-select-all-1\"]")).click();
    	System.out.println("All checkboxes are selected");
    	//driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr/th/input")).click();
    	driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr[2]/th/input")).click();
    	driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr[4]/th/input")).click();
    	System.out.println("One or more checkboxes are selected in displayed result on Region Page");
    	
    }
    catch(Exception e) {
    	System.out.println("Checkboxes are not selected"+e);
    	Assert.fail();
    }
}

@When("selects delete option in dropdown from bulk actions")
public void selects_delete_option_in_dropdown_from_bulk_actions() {
	 try {
		 Thread.sleep(1000);
		 org.openqa.selenium.support.ui.Select parentregion=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@id=\"bulk-action-selector-top\"]")));
		   parentregion.selectByIndex(1);
		   System.out.println("Delete option selected in dropdown");
		  	    }
	    catch(Exception e) {
	    	System.out.println("Delete option not selected in dropdown"+e);
	    	Assert.fail();
	    } 
}

@When("clicks on Apply button")
public void clicks_on_Apply_button() {
	 try { Thread.sleep(1000);
	    	  driver.findElement(By.xpath("//*[@id=\"doaction\"]")).click();
	    	  System.out.println("clicked on apply button");
    }
	    catch(Exception e) {
	    	 System.out.println("Can't clicked on apply button");
	    	 Assert.fail();
	    }
}

@Then("Admin will see the validation message for the deleted fields on Region Page {string}")
public void admin_will_see_the_validation_message_for_the_deleted_fields_on_Region_Page(String msg) {
	 try {
		 Thread.sleep(1000);
		 String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"message\"]/p")).getText();
		String actualtext1=msg;
		Assert.assertEquals(exceptedtext1, actualtext1);
		
		 System.out.println("Admin can see validation message of deleted fields");
	    	
	    }
	    catch(Exception e) {
	    	 System.out.println("Admin can see validation message of deleted fields");
	    	 Assert.fail();	    }
}

//scenario
@When("Admin clicks on Screen Options")
public void admin_clicks_on_Screen_Options() {
try {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"show-settings-link\"]")).click();
	System.out.println("Admin clicks on screen option");
}
catch(Exception e) {
	System.out.println("Admin can't click on screen option");
	Assert.fail();
}
}

@When("deSelects all checkboxes in Screen option")
public void deselects_all_checkboxes_in_Screen_option() {
    try { Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"description-hide\"]")).click();Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"slug-hide\"]")).click();Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"posts-hide\"]")).click();Thread.sleep(1000);
    	System.out.println("All checkboxes are deselected");
    }
    catch(Exception e) {
    	System.out.println("All checkboxes are not deselected"+e);
    	Assert.fail();
    }
}

@When("Admin clicks on all checkboxes")
public void admin_clicks_on_all_checkboxes() {
	try { Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"description-hide\"]")).click(); Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"slug-hide\"]")).click();Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"posts-hide\"]")).click();Thread.sleep(1000);
	System.out.println("All checkboxes are selected");
    }
    catch(Exception e) {
    	System.out.println("All checkboxes are not selected");
    	Assert.fail();
    }
}


@Then("that fields are shown in title page of displayed result")
public void that_fields_are_shown_in_title_page_of_displayed_result() {
try{
	Thread.sleep(1000);
	String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"name\"]/a")).getText();
	String actualtext1="Name";
	Assert.assertEquals(exceptedtext1, actualtext1);
	String exceptedtext2=driver.findElement(By.xpath("//*[@id=\"description\"]/a")).getText();
	String actualtext2="Description";
	Assert.assertEquals(exceptedtext2, actualtext2);
	String exceptedtext3=driver.findElement(By.xpath("//*[@id=\"slug\"]/a")).getText();
	String actualtext3="Slug";
	Assert.assertEquals(exceptedtext3, actualtext3);
	System.out.println("NAME DESCRIPTION SLUG Field is there in title field");
    }
    catch(Exception e) {
    	System.out.println("NAME DESCRIPTION SLUG Field is not there in title field");
    	Assert.fail();
    	
    }
}





@When("Admin enters no of items per page no {string}")
public void admin_enters_no_of_items_per_page_no(String number) {
	try {Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit_region_per_page\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit_region_per_page\"]")).sendKeys(number);
		System.out.println("Admin can enter no of items per page");
	}
	catch(Exception e) {
		System.out.println("Admin can't enter no of items per page");
		Assert.fail();
	}
}

@When("clicks on Apply Button")
public void clicks_on_Apply_Button() {
	try {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"screen-options-apply\"]")).click();
		System.out.println("Admin can click on apply button in screen options");
	}
	catch(Exception e) {
		System.out.println("Admin can't click on apply button in screen options");
		Assert.fail();
	}
}

//scenario
@When("Admin will click on view option")
public void admin_will_click_on_view_option() {
	 try {
		 
		  WebElement destination =driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(destination).build().perform();
		 driver.findElement(By.xpath("//*[@class=\"row-actions\"]/span[4]")).click();
		
		  
		  System.out.println("Admin is able to click on view option of a particular record in displayed result");
		  }
	  catch(Exception e) {
		  System.out.println("Admin can't click on view option of a particular record in displayed result"+e);
			Assert.fail();
	  }
}

@Then("Admin will navigate to Real Estate find your home page")
public void admin_will_navigate_to_Real_Estate_find_your_home_page() {
	 try {
		 Thread.sleep(3000);
		String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"titlebar\"]/div/div/div/h1")).getText();;
		Thread.sleep(3000);
		driver.navigate().back();
	    String actualtext1="Region: "+driver.findElement(By.xpath("//*[@class=\"name column-name has-row-actions column-primary\"]/strong/a")).getText();
		System.out.println(exceptedtext1);
		System.out.println(actualtext1);
		
		Assert.assertEquals(actualtext1,exceptedtext1);
		 System.out.println("Admin can view that region result");
		 Thread.sleep(1000);
		 driver.navigate().forward();
	    }
	    catch(Exception e) {
	    	
	    	 System.out.println("Admin can't view that region result"+e);
				Assert.fail();
	    }
}

@When("Admin navigates back Regions Page in Real Estate")
public void admin_navigates_back_Regions_Page_in_Real_Estate() {
    try {
    	Thread.sleep(1000);driver.navigate().back();
    	System.out.println("Admin can navigate back to regions page ");
    }
    catch(Exception e) {
    	System.out.println("Admin can't navigate back to regions page "+e);
		Assert.fail();
    }
}

@Then("Admin clicks on Delete option")
public void admin_clicks_on_Delete_option() {
 try {
	  WebElement destination =driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(destination).build().perform();
		 driver.findElement(By.xpath("//*[@class=\"row-actions\"]/span[3]")).click();
		
		  
		  System.out.println("Admin is able to click on delete option of a particular record in displayed result");
		  }
	  catch(Exception e) {
		  System.out.println("Admin can't click on delete option of a particular record in displayed result"+e);
		Assert.fail();
	  }
}
@Then("Admin accepts the alert")
public void admin_accepts_the_alert() {
   try {
	   Alert alert=driver.switchTo().alert();
		String message=alert.getText();
		System.out.println(message);
	
		alert.accept();
		System.out.println("Accepted delete alert");
   }
   catch(Exception e)
   {
	   System.out.println("Admin can't accept delete alert"+e);
		Assert.fail();
   }
}

@Then("Admin will see validation message of deleted message {string}")
public void admin_will_see_validation_message_of_deleted_message(String msg) {
	 try {
		 String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"ajax-response\"]/div/p")).getText();
			String actualtext1=msg;
			Assert.assertEquals(exceptedtext1, actualtext1);
			System.out.println("Admin can see correct validation message");
	    }
	    catch(Exception e) {
	    	 System.out.println("Admin can't see correct validation message. Correct Validation meassage is "+msg+" "+e);
	 		Assert.fail();
	    }
}
//scenario
@When("Admin will click on Name Column in Displayed Result Table in Region Page")
public void admin_will_click_on_Name_Column_in_Displayed_Result_Table_in_Region_Page() {
  try {
	  WebElement destination =driver.findElement(By.xpath("//*[@id=\"name\"]"));
	  Actions obj = new Actions(driver);
	  obj.moveToElement(destination).build().perform();
	  
	  driver.findElement(By.xpath("//*[@id=\"name\"]/a/span[2]")).click();
	  System.out.println("Able to click on the NAME heading");
	  Thread.sleep(1000);
  }
  catch(Exception e) {
	  System.out.println("Not able to click on the NAME heading"+e);
  	Assert.fail();
  }
}
@Then("Names should be arranged in ascending order")
public void names_should_be_arranged_in_ascending_order() {
	 try {
		  String exceptedtext1=driver.findElement(By.xpath("//*[@data-colname=\"Name\"]/strong/a")).getText();
			String actualtext1="12345";
			Assert.assertEquals(exceptedtext1, actualtext1);
			System.out.println("NAME heading is in ascending order");
	  }
	  catch(Exception e) {
			System.out.println("NAME heading is not in ascending order");
			Assert.fail();
	  }
	  }



@Then("Names should be arranged in descending order")
public void names_should_be_arranged_in_descending_order() {
	 try {
		 String exceptedtext1=driver.findElement(By.xpath("//*[@data-colname=\"Name\"]/strong/a")).getText();
			String actualtext1="Zebra";
			Assert.assertEquals(exceptedtext1, actualtext1);
			System.out.println("NAME heading is in descending order");
	  }
	  catch(Exception e) {
		  System.out.println("NAME heading is not in ascending order");
			Assert.fail();
	  }
}

@When("Admin will click on Description Column in Displayed Result Table in Region Page")
public void admin_will_click_on_Description_Column_in_Displayed_Result_Table_in_Region_Page() {
	 try {
		  WebElement destination =driver.findElement(By.xpath("//*[@id=\"description\"]"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(destination).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"description\"]/a/span[2]")).click();
		  System.out.println("Able to click on the DESCRIPTION heading");
		  Thread.sleep(1000);
	  }
	  catch(Exception e) {
		  System.out.println("Not able to click on the DESCRIPTION  heading"+e);
	  	Assert.fail();
	  }
}

@Then("Description should be arranged in ascending order")
public void description_should_be_arranged_in_ascending_order() {
	 try {
		  String exceptedtext1=driver.findElement(By.xpath("//*[@data-colname=\"Description\"]/p")).getText();
			String actualtext1="ABC";
			Assert.assertEquals(exceptedtext1, actualtext1);
			System.out.println("Description heading is in ascending order");
	  }
	  catch(Exception e) {
			System.out.println("Description heading is not in ascending order");
			Assert.fail();
	  }
}

@Then("Description should be arranged in descending order")
public void description_should_be_arranged_in_descending_order() {
	try {
		 String exceptedtext1=driver.findElement(By.xpath("//*[@data-colname=\"Description\"]/p")).getText();
			String actualtext1="XYZ";
			Assert.assertEquals(exceptedtext1, actualtext1);
			System.out.println("Description heading is in descending order");
	  }
	  catch(Exception e) {
		  System.out.println("Description heading is not in ascending order");
			Assert.fail();
	  }
}
@When("Admin will click on Slug Column in Displayed Result Table in Region Page")
public void admin_will_click_on_Slug_Column_in_Displayed_Result_Table_in_Region_Page() {
	try {
		  WebElement destination =driver.findElement(By.xpath("//*[@id=\"slug\"]/a/span[1]"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(destination).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"slug\"]/a/span[2]")).click();
		  System.out.println("Able to click on the SLUG heading");
		  Thread.sleep(1000);
	  }
	  catch(Exception e) {
		  System.out.println("Not able to click on the SLUG  heading"+e);
	  	Assert.fail();
	  }
}

@Then("Slug should be arranged in ascending order")
public void slug_should_be_arranged_in_ascending_order() {
	try {
		  String exceptedtext1=driver.findElement(By.xpath("//*[@data-colname=\"Description\"]")).getText();
			String actualtext1="ABC";
			Assert.assertEquals(exceptedtext1, actualtext1);
			System.out.println("Slug heading is in ascending order");
	  }
	  catch(Exception e) {
			System.out.println("Slug heading is not in ascending order");
			Assert.fail();
	  }
}

@Then("Slug should be arranged in descending order")
public void slug_should_be_arranged_in_descending_order() {
	try {
		 String exceptedtext1=driver.findElement(By.xpath("//*[@data-colname=\"Description\"]")).getText();
			String actualtext1="XYZ";
			Assert.assertEquals(exceptedtext1, actualtext1);
			System.out.println("Slug heading is in descending order");
	  }
	  catch(Exception e) {
		  System.out.println("Slug heading is not in ascending order");
			Assert.fail();
	  }
}

@When("Admin will click on Count Column in Displayed Result Table in Region Page")
public void admin_will_click_on_Count_Column_in_Displayed_Result_Table_in_Region_Page() {
 try {
	  WebElement destination =driver.findElement(By.xpath("//*[@id=\"posts\"]/a/span[1]"));
	  Actions obj = new Actions(driver);
	  obj.moveToElement(destination).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"posts\"]/a/span[2]")).click();
	  System.out.println("Able to click on the COUNT heading");
	  Thread.sleep(1000);
 }
 catch(Exception e){
	  System.out.println("Not able to click on the COUNT heading"+e);
	  	Assert.fail();
 }
}

@Then("Count should be arranged in ascending order")
public void count_should_be_arranged_in_ascending_order() {
	try {
		String actualval5 = driver.findElement(By.xpath("//*[@data-colname=\"Count\"]/a")).getText();
		   int actualval6 = Integer.parseInt(actualval5);
		   
		   String actualval7 = driver.findElement(By.xpath("//*[@data-colname=\"Count\"]/a")).getText();
		   int actualval8 = Integer.parseInt(actualval7);
		   if(actualval6<=actualval8)
		   {
			   System.out.println("Arranged in ascending order");  
		   }
	 }
	 catch(Exception e){
			System.out.println("Not arranged in ascending order"+e);
	    	Assert.fail();
	 }
}

@Then("Count should be arranged in descending order")
public void count_should_be_arranged_in_descending_order() {
	try {
		 String actualval1 = driver.findElement(By.xpath("//*[@data-colname=\"Count\"]/a")).getText();
		   int actualval2 = Integer.parseInt(actualval1);
		   String actualval3 = driver.findElement(By.xpath("//*[@data-colname=\"Count\"]/a")).getText();
		   int actualval4 = Integer.parseInt(actualval3);
		  if(actualval2>=actualval4)
		  {
		  
		   System.out.println("Arranged in descending order");
			}
		 
	 }
	 catch(Exception e){
		 
	 }
}

//scenario
@When("Admin will click on Property Settings")
public void admin_will_click_on_Property_Settings() {
   try {
	   driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[6]/a")).click();
	   System.out.println("Admin is able to go to property settings page");
   }
   catch(Exception e) {
	   
	   System.out.println("Admin is NOT able to go to property settings page");
	   Assert.fail();
   }
}

@Then("Admin will navigate to Property Settings")
public void admin_will_navigate_to_Property_Settings() {
try {
	String exceptedtext1=driver.findElement(By.xpath("//*[@class=\"wrap acf-settings-wrap\"]/h1")).getText();
	String actualtext1="Properties Settings";
	System.out.println(driver.getTitle());
	Assert.assertEquals(exceptedtext1, actualtext1);
	System.out.println("Admin is on property settings page");
}
catch(Exception e) {
	System.out.println("Admin is NOT on property settings page"+e);
	   Assert.fail();
}
}

@When("click on Add Row Button")
public void click_on_Add_Row_Button() {
   try {
	   driver.findElement(By.xpath("//*[@id=\"acf-group_5b041735d4bcf\"]/div/div/div[2]/div/div/a")).click();
	   Thread.sleep(3000);
	   System.out.println("Admin can Add new Row");
   }
   catch(Exception e) {
	   System.out.println("Admin can't Add new Row"+e);
	   Assert.fail();
   }
}

@When("enters Property URL {string}")
public void enters_Property_URL(String propt) {
try { Thread.sleep(3000);
driver.findElement(By.xpath("(//input[starts-with(@id,'acf')])[6]")).clear();
	driver.findElement(By.xpath("(//input[starts-with(@id,'acf')])[6]")).sendKeys(propt); //*[@id="acf-field_5b041758e1993-5-field_5b041775e1994"]
	System.out.println("Admin enters property URL");
	Thread.sleep(3000);
}
catch(Exception e) {
	System.out.println("Admin can't enter property URL"+e);
	Assert.fail();
}
}

@When("clicks on Update Button")
public void clicks_on_Update_Button() {
	try {
		 WebElement updateButton = driver.findElement(By.xpath("//*[@name='publish']"));
		    JavascriptExecutor jsp = (JavascriptExecutor)driver;
		    jsp.executeScript("arguments[0].click()", updateButton);
		

		System.out.println("Admin clicks on Update Button");
	}
	catch(Exception e) {
		System.out.println("Admin can't click on Update Button"+e);
		Assert.fail();
	}

}

@Then("Admin will see validation Message {string}")
public void admin_will_see_validation_Message(String msg) {
	 try {Thread.sleep(3000);
		 String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/div[2]/p")).getText();
			String actualtext1=msg;
			Assert.assertEquals(exceptedtext1, actualtext1);
			System.out.println("Admin can see correct validation message");
	    }
    catch(Exception e) {
	    	 System.out.println("Admin can't see correct validation message"+e);
	 		Assert.fail();
    }
}

//scenario
@When("Admin clicks on quick edit option of a particular record in displayed result.")
public void admin_clicks_on_quick_edit_option_of_a_particular_record_in_displayed_result() {
   try {
	   WebElement destination =driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr[2]/th"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(destination).build().perform();
		 driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr[2]/td[1]/div[2]/span[2]/a")).click();
		 System.out.println("User is able to click on quik edit option");
   }
   catch(Exception e) {
	   System.out.println("User is NOT able to click on quik edit option"+e);
	   Assert.fail();
   }
}

@When("Admin enters the modified Name {string}and Slug {string}")
public void admin_enters_the_modified_Name_and_Slug(String name, String slug) {
	try {
		   driver.findElement(By.xpath("//*[@id='the-list']/tr[4]/td/fieldset/div/label/span[2]/input")).clear();
		   driver.findElement(By.xpath("//*[@id='the-list']/tr[4]/td/fieldset/div/label[2]/span[2]/input")).clear();
		   driver.findElement(By.xpath("//*[@id='the-list']/tr[4]/td/fieldset/div/label/span[2]/input")).sendKeys(name);
	   driver.findElement(By.xpath("//*[@id='the-list']/tr[4]/td/fieldset/div/label[2]/span[2]/input")).sendKeys(slug);
				System.out.println(name);
			Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(name);
			boolean b = m.find();

			if (b) {
				System.out.println("Name contains special characters");
				Assert.fail();
			}
			  
		
		
	    System.out.println("Correct Name Accepted");
		   
		   System.out.println("Updated details of region entered in quick edit");
	   }
	   catch(Exception e) {
		   System.out.println("Updated details of region are not entered in quick edit"+e);
		   Assert.fail();
	   }
}

@When("Admin clicks on Update button of quick edit")
public void admin_clicks_on_Update_button_of_quick_edit() {
	try {
		   driver.findElement(By.xpath("//*[@class=\"inline-edit-save submit\"]/button[2]")).click();
System.out.println("Region details updated in quick edit");
Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Region details are not updated in quick edit"+e);
		   Assert.fail();
	   }
}

@When("Admin will click on profile icon")
public void admin_will_click_on_profile_icon() {
    try {
    	driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a/span")).click();
    	System.out.println("Admin clicks on profile icon");
    }
    catch(Exception e) {
    	System.out.println("Admin can't click on profile icon");
    	Assert.fail();
    }
}

@Then("Admin will navigate to Your Profile Page")
public void admin_will_navigate_to_Your_Profile_Page() {
try {
	String exceptedtext1=driver.findElement(By.xpath("//*[@id=\"profile-page\"]/h1")).getText();
	String actualtext1="Profile";
	Assert.assertEquals(exceptedtext1, actualtext1);
	System.out.println(driver.getTitle());
	System.out.println("Admin navigated to Your Profile Page");
    }
    catch(Exception e) {
    	System.out.println("Admin can't navigated to Your Profile Page");
    	Assert.fail();
    }
}

@When("click on Logout Button")
public void click_on_Logout_Button() {
try {
	WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a"));
    JavascriptExecutor jsp = (JavascriptExecutor)driver;
    jsp.executeScript("arguments[0].click()", logoutButton);
    //Thread.sleep(3000);
    	//driver.findElement(By.xpath("//*[@id=\"error-page\"]/p[2]/a")).click();
    	System.out.println("Admin Loged out");
    }
    catch(Exception e) {
    	System.out.println("Admin can't Log out"+e);
    	Assert.fail();
    }
}

}




