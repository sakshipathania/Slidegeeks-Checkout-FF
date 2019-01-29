$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Signup.feature");
formatter.feature({
  "line": 2,
  "name": "signup Test On Web Application",
  "description": "",
  "id": "signup-test-on-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@signupTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@signupTest_1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigates to website url.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Most Downloaded link.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Select a product items.",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Download this presentation link.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Create an Account CTA.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.navigates_to_website_url()"
});
formatter.result({
  "duration": 6738278300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_most_download()"
});
formatter.result({
  "duration": 7360220700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_product()"
});
formatter.result({
  "duration": 2273894100,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Download_this_presentation_link()"
});
formatter.result({
  "duration": 1854878200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.reate_an_Account_CTA()"
});
formatter.result({
  "duration": 2404448000,
  "status": "passed"
});
formatter.after({
  "duration": 126900,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 10,
      "value": "#@signupTest"
    },
    {
      "line": 11,
      "value": "#Scenario Outline: Data driving for invalid data for sign-up."
    },
    {
      "line": 12,
      "value": "#\tThen Enter Email Address as \"\u003cEmail Address\u003e\"."
    },
    {
      "line": 13,
      "value": "#\tThen Enter First Name as \"\u003cFirst Name\u003e\"."
    },
    {
      "line": 14,
      "value": "#\tThen Enter Last Name as \"\u003cLast Name\u003e\"."
    },
    {
      "line": 15,
      "value": "#\tThen Enter Password as \"\u003cPassword\u003e\"."
    },
    {
      "line": 16,
      "value": "#\tThen Enter Confirm password as \"\u003cConfirm_password\u003e\"."
    },
    {
      "line": 17,
      "value": "#\tThen Enter the captcha."
    },
    {
      "line": 18,
      "value": "#\tThen click on Signup button."
    },
    {
      "line": 19,
      "value": "#\tThen Verify \"\u003cEmail AddressVal\u003e\" validation message for Email Address."
    },
    {
      "line": 20,
      "value": "#\tThen Verify \"\u003cFirst NameVal\u003e\" validation message for First Name."
    },
    {
      "line": 21,
      "value": "#\tThen Verify \"\u003cLast NameVal\u003e\" validation message forLast Name."
    },
    {
      "line": 22,
      "value": "#\tThen Verify \"\u003cPasswordVal\u003e\" validation message for Password."
    },
    {
      "line": 23,
      "value": "#\tThen Verify \"\u003cConfirm_passwordVal\u003e\" validation message for Confirm_password."
    },
    {
      "line": 24,
      "value": "#\tThen Verify \"\u003cSignUp_val_Msg\u003e\" message for all invalid credentials."
    },
    {
      "line": 25,
      "value": "#\tExamples:"
    },
    {
      "line": 26,
      "value": "#\t\t|Email Address                    |  First Name     | Last Name   |  Password       | Confirm_password   |  Email AddressVal                                     | First NameVal              |Last NameVal              |PasswordVal                                                                    |   Confirm_passwordVal                 |SignUp_val_Msg                                                                                                                                               |"
    },
    {
      "line": 27,
      "value": "#\t\t|selenium                         |                 |             |                 |                    |Please include an \u0027@\u0027 in the email address. \u0027selenium\u0027 is missing an \u0027@\u0027. |                            |                          |                                                                               |                                       |                                                                                                                                                             |"
    },
    {
      "line": 28,
      "value": "#\t\t|selenium@@gmail.com              |                 |             |                 |                    |A part following \u0027@\u0027 should not contain the symbol \u0027@\u0027.                   |                            |                          |                                                                               |                                       |                                                                                                                                                             |"
    },
    {
      "line": 29,
      "value": "#\t\t|                                 |                 |             |                 |                    |This is a required field.                              |This is a required field.   |This is a required field. |This is a required field.                                                      |    This is a required field.          |                                                                                                                                                             |"
    },
    {
      "line": 30,
      "value": "#\t\t|selenium.testing1234@gmail.com   |    Test         |             |                 |                    |                                                       |                            |This is a required field. |This is a required field.                                                      |This is a required field.              |                                                                                                                                                             |"
    },
    {
      "line": 31,
      "value": "#\t\t|selenium.testing1234@gmail.com   |    Test         |   Test      |                 |                    |                                                       |                            |                          |This is a required field.                                                      |This is a required field.              |                                                                                                                                                             |"
    },
    {
      "line": 32,
      "value": "#\t\t|selenium.testing1234@gmail.com   |    Test         |   Test      |   1234          |                    |                                                       |                            |                          |Please enter 6 or more characters. Leading or trailing spaces will be ignored. |This is a required field.              |                                                                                                                                                             |"
    },
    {
      "line": 33,
      "value": "#\t\t|selenium.testing1234@gmail.com   |    Test         |   Test      |    123456       |         654221     |                                                       |                            |                          |                                                                               | Please make sure your passwords match.|                                                                                                                                                             |"
    },
    {
      "line": 34,
      "value": "#\t\t|selenium.testing1234@gmail.com   |    Test         |   Test      |  123456         |   123456           |                                                       |                            |                          |                                                                               |                                       |There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account. |"
    }
  ],
  "line": 36,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@signupTest"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "Enter Email \"\u003cEmail Address\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter First Name as \"\u003cFirst Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Enter Last Name as \"\u003cLast Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Enter Password as \"\u003cPassword\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Enter Confirm password as \"\u003cConfirm_password\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.examples({
  "line": 44,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;",
  "rows": [
    {
      "cells": [
        "Email Address",
        "First Name",
        "Last Name",
        "Password",
        "Confirm_password"
      ],
      "line": 45,
      "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;1"
    },
    {
      "cells": [
        "selenium.testing",
        "Test",
        "Test",
        "123456",
        "123456"
      ],
      "line": 46,
      "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 46,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@signupTest"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "Enter Email \"selenium.testing\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Enter Password as \"123456\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Enter Confirm password as \"123456\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "selenium.testing",
      "offset": 13
    }
  ],
  "location": "SignUp_Step.Enter_Email_credentials(String)"
});
formatter.result({
  "duration": 431222000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 21
    }
  ],
  "location": "SignUp_Step.enter_First_Name_as(String)"
});
formatter.result({
  "duration": 342555400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 20
    }
  ],
  "location": "SignUp_Step.enter_Last_Name_as(String)"
});
formatter.result({
  "duration": 342398200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 19
    }
  ],
  "location": "SignUp_Step.enter_password(String)"
});
formatter.result({
  "duration": 1373687000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 27
    }
  ],
  "location": "SignUp_Step.enter_Confirm_password_as(String)"
});
formatter.result({
  "duration": 358262700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1360513400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3135749700,
  "status": "passed"
});
formatter.after({
  "duration": 32400,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@signupTest"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "After signup see the price page.",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "Select price subscription.",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Verify the payment option.",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Click on My account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "Click on delete account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "Click on Yes button.",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Verify the delete account confirmation message.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.verify_the_price_page()"
});
formatter.result({
  "duration": 1089961300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_price_subscription()"
});
formatter.result({
  "duration": 4795820800,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.payement_option()"
});
formatter.result({
  "duration": 4077079800,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.my_account_link()"
});
formatter.result({
  "duration": 2030340200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_account_link()"
});
formatter.result({
  "duration": 1233189700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.confirm_yes_()"
});
formatter.result({
  "duration": 1124043500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_confirmation_message()"
});
formatter.result({
  "duration": 4086646800,
  "status": "passed"
});
formatter.after({
  "duration": 33900,
  "status": "passed"
});
});