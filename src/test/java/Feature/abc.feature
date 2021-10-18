Feature: Automation Testing Scripts

  Background: Verify login functionality
    Given Admin is on the login page of Real Estate
    When Admin enters Username "mohankrishna176@gmail.com" and Password "Secret@123&&" 
    And Click on login button
    Given Admin is on Dashboard page
    When Admin clicks on properties
    Then Admin will navigate to Region page in Real Estate

  @scenario_one
  Scenario: Verfiy Ascending Descending of Columns in Displayed Result Table in Region Page
    Given Admin is on Regions Page in Real Estate
    #Name
    When Admin will click on Name Column in Displayed Result Table in Region Page
    Then Names should be arranged in ascending order
    When Admin will click on Name Column in Displayed Result Table in Region Page
    Then Names should be arranged in descending order
    #Description
    When Admin will click on Description Column in Displayed Result Table in Region Page
    Then Description should be arranged in ascending order
    When Admin will click on Description Column in Displayed Result Table in Region Page
    Then Description should be arranged in descending order
    #Slug
    When Admin will click on Slug Column in Displayed Result Table in Region Page
    Then Slug should be arranged in ascending order
    When Admin will click on Slug Column in Displayed Result Table in Region Page
    Then Slug should be arranged in descending order
    #count
    When Admin will click on Count Column in Displayed Result Table in Region Page
    Then Count should be arranged in ascending order
    When Admin will click on Count Column in Displayed Result Table in Region Page
    Then Count should be arranged in descending order

  @scenario_two
  Scenario Outline: Verify Add New Region
    Given Admin is on Regions Page in Real Estate
    When Admin enters Name "<Name>",Slug "<Slug>" and Description "<Desc>" and selects parent region
    And clicks on add new Region button
    And Admin enters Name "<Name>" in search region text in displayed result in Region page
    And clicks on search button on displayed result in Region page.
    Then Admin will see the new added region name"<Name>" in displayed result in Region page.

    Examples: 
      | Name            | Slug   | Desc                   |
      | Codingface@1234 | Test1  | This is Test1          |
      | Mumbai          | Mumbai | This is Created Region |

  @scenario_three
  Scenario Outline: Verify the edit option in particular displayed result record.
    Given Admin is on Regions Page in Real Estate
    When Admin clicks on edit option of a particular record in displayed result.
    Then Admin will navigate to Edit Region Page
    When Admin enters the modified Name "<Name>",Slug "<Slug>" and Description "<Desc>" and selects parent region
    And clicks on add Update button of edit page
    Then Admin will see validation message of updated item "<validationmsg>"
    When clicks on Back to Categories link in edit page
    Then Admin will navigate to Region page in Real Estate
    When Admin clicks on edit option of a particular record in displayed result.
    Then Admin will navigate to Edit Region Page
    When Admin will click on delete button
    Then Admin will navigate to Region page in Real Estate

    Examples: 
      | Name        | Slug                | Desc                   | validationmsg |
      | Pune        | Updated slug123     | This is Updated Region | Item updated. |
      | Mumbai@123% | This is mumbai123%$ | This is Mumbai         | Item updated. |

  @scenario_four
  Scenario Outline: Verify bulk action in region page
    Given Admin is on Regions Page in Real Estate
    When Admin clicks on one or more checkboxes in displayed result on Region Page
    And selects delete option in dropdown from bulk actions
    And clicks on Apply button
    Then Admin will see the validation message for the deleted fields on Region Page "<validationmsg>"

    Examples: 
      | validationmsg  |
      | Items deleted. |

  @scenario_five
  Scenario Outline: Verify the Screen Options and Pagination
    Given Admin is on Regions Page in Real Estate
    When Admin clicks on Screen Options
    And deSelects all checkboxes in Screen option
    And Admin clicks on all checkboxes
    Then that fields are shown in title page of displayed result
    When Admin enters no of items per page no "<no>"
    And clicks on Apply Button
    Then Admin will navigate to Region page in Real Estate

    Examples: 
      | no |
      |  2 |

  @scenario_six
  Scenario Outline: Verify delete and view option in particular displayed result record.
    Given Admin is on Regions Page in Real Estate
    When Admin will click on view option
    Then Admin will navigate to Real Estate find your home page
    When Admin navigates back Regions Page in Real Estate
    Then Admin is on Regions Page in Real Estate
    And Admin clicks on Delete option
    And Admin accepts the alert
    Then Admin will see validation message of deleted message "<validationmsg>"

    Examples: 
      | validationmsg  |
      | Items deleted. |

  @scenario_seven
  Scenario Outline: Verfiy the Property Settings
    Given Admin is on Regions Page in Real Estate
    When Admin will click on Property Settings
    Then Admin will navigate to Property Settings
    When click on Add Row Button
    And enters Property URL "<propertyurl>"
    And clicks on Update Button
    Then Admin will see validation Message "<validationmsg>"

    Examples: 
      | propertyurl                                      | validationmsg   |
      | https://www.w3schools.com/jsref/jsref_charat.asp | Options Updated |

  @scenario_eight
  Scenario Outline: Verify quik edit option on Regions Page
    Given Admin is on Regions Page in Real Estate
    When Admin clicks on quick edit option of a particular record in displayed result.
    And Admin enters the modified Name "<Name>"and Slug "<Slug>"
    And Admin clicks on Update button of quick edit
    Then Admin will navigate to Region page in Real Estate
    When Admin will click on profile icon
    Then Admin will navigate to Your Profile Page
    When Admin navigates back Regions Page in Real Estate
    And Admin will click on profile icon
    And click on Logout Button
    Then Admin is on the login page of Real Estate

    Examples: 
      | Name                 | Slug                             |
      | Description TestingU | description-testingUPDAted_three |
      | Coding@123           | This is slug2                    |
