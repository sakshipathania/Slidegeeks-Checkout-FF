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
  "duration": 6756330000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_most_download()"
});
formatter.result({
  "duration": 11868653500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_product()"
});
formatter.result({
  "duration": 3450990700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Download_this_presentation_link()"
});
formatter.result({
  "duration": 2108991800,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.reate_an_Account_CTA()"
});
formatter.result({
  "duration": 2372786300,
  "status": "passed"
});
formatter.after({
  "duration": 173600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@signupTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Enter Email Address as \"\u003cEmail Address\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"\u003cFirst Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"\u003cLast Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"\u003cPassword\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"\u003cConfirm_password\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"\u003cEmail AddressVal\u003e\" validation message for Email Address.",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\u003cFirst NameVal\u003e\" validation message for First Name.",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"\u003cLast NameVal\u003e\" validation message forLast Name.",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"\u003cPasswordVal\u003e\" validation message for Password.",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"\u003cConfirm_passwordVal\u003e\" validation message for Confirm_password.",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"\u003cSignUp_val_Msg\u003e\" message for all invalid credentials.",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;",
  "rows": [
    {
      "cells": [
        "Email Address",
        "First Name",
        "Last Name",
        "Password",
        "Confirm_password",
        "Email AddressVal",
        "First NameVal",
        "Last NameVal",
        "PasswordVal",
        "Confirm_passwordVal",
        "SignUp_val_Msg"
      ],
      "line": 26,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;1"
    },
    {
      "cells": [
        "selenium",
        "",
        "",
        "",
        "",
        "Please include an \u0027@\u0027 in the email address. \u0027selenium\u0027 is missing an \u0027@\u0027.",
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 27,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;2"
    },
    {
      "cells": [
        "selenium@@gmail.com",
        "",
        "",
        "",
        "",
        "A part following \u0027@\u0027 should not contain the symbol \u0027@\u0027.",
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 28,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;3"
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "This is a required field.",
        "This is a required field.",
        "This is a required field.",
        "This is a required field.",
        "This is a required field.",
        ""
      ],
      "line": 29,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;4"
    },
    {
      "cells": [
        "selenium.testing1234@gmail.com",
        "Test",
        "",
        "",
        "",
        "",
        "",
        "This is a required field.",
        "This is a required field.",
        "This is a required field.",
        ""
      ],
      "line": 30,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;5"
    },
    {
      "cells": [
        "selenium.testing1234@gmail.com",
        "Test",
        "Test",
        "",
        "",
        "",
        "",
        "",
        "This is a required field.",
        "This is a required field.",
        ""
      ],
      "line": 31,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;6"
    },
    {
      "cells": [
        "selenium.testing1234@gmail.com",
        "Test",
        "Test",
        "1234",
        "",
        "",
        "",
        "",
        "Please enter 6 or more characters. Leading or trailing spaces will be ignored.",
        "This is a required field.",
        ""
      ],
      "line": 32,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;7"
    },
    {
      "cells": [
        "selenium.testing1234@gmail.com",
        "Test",
        "Test",
        "123456",
        "654221",
        "",
        "",
        "",
        "",
        "Please make sure your passwords match.",
        ""
      ],
      "line": 33,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;8"
    },
    {
      "cells": [
        "selenium.testing1234@gmail.com",
        "Test",
        "Test",
        "123456",
        "123456",
        "",
        "",
        "",
        "",
        "",
        "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account."
      ],
      "line": 34,
      "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;9"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;2",
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
  "line": 12,
  "name": "Enter Email Address as \"selenium\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"Please include an \u0027@\u0027 in the email address. \u0027selenium\u0027 is missing an \u0027@\u0027.\" validation message for Email Address.",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\" validation message for First Name.",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"\" validation message forLast Name.",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"\" validation message for Password.",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"\" validation message for Confirm_password.",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"\" message for all invalid credentials.",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 24
    }
  ],
  "location": "SignUp_Step.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 364538300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "SignUp_Step.enter_First_Name_as(String)"
});
formatter.result({
  "duration": 327326600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 20
    }
  ],
  "location": "SignUp_Step.enter_Last_Name_as(String)"
});
formatter.result({
  "duration": 420348100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "SignUp_Step.enter_password(String)"
});
formatter.result({
  "duration": 1358101500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 27
    }
  ],
  "location": "SignUp_Step.enter_Confirm_password_as(String)"
});
formatter.result({
  "duration": 374043700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1358735700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3106049700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please include an \u0027@\u0027 in the email address. \u0027selenium\u0027 is missing an \u0027@\u0027.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Email_Address(String)"
});
formatter.result({
  "duration": 20068921500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_First_Name(String)"
});
formatter.result({
  "duration": 20024035100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_forLast_Name(String)"
});
formatter.result({
  "duration": 20030105400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_password(String)"
});
formatter.result({
  "duration": 20029590000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Confirm_password(String)"
});
formatter.result({
  "duration": 20029665800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.message_for_all_invalid_credentials(String)"
});
formatter.result({
  "duration": 20030116500,
  "status": "passed"
});
formatter.after({
  "duration": 73800,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;3",
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
  "line": 12,
  "name": "Enter Email Address as \"selenium@@gmail.com\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"A part following \u0027@\u0027 should not contain the symbol \u0027@\u0027.\" validation message for Email Address.",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\" validation message for First Name.",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"\" validation message forLast Name.",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"\" validation message for Password.",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"\" validation message for Confirm_password.",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"\" message for all invalid credentials.",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "selenium@@gmail.com",
      "offset": 24
    }
  ],
  "location": "SignUp_Step.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 369514400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "SignUp_Step.enter_First_Name_as(String)"
});
formatter.result({
  "duration": 342376200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 20
    }
  ],
  "location": "SignUp_Step.enter_Last_Name_as(String)"
});
formatter.result({
  "duration": 271819200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "SignUp_Step.enter_password(String)"
});
formatter.result({
  "duration": 1352340900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 27
    }
  ],
  "location": "SignUp_Step.enter_Confirm_password_as(String)"
});
formatter.result({
  "duration": 342287500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1311729500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3106180500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A part following \u0027@\u0027 should not contain the symbol \u0027@\u0027.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Email_Address(String)"
});
formatter.result({
  "duration": 20068925900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_First_Name(String)"
});
formatter.result({
  "duration": 20040040600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_forLast_Name(String)"
});
formatter.result({
  "duration": 20029535500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_password(String)"
});
formatter.result({
  "duration": 20013954100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Confirm_password(String)"
});
formatter.result({
  "duration": 20030182600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.message_for_all_invalid_credentials(String)"
});
formatter.result({
  "duration": 20029546600,
  "status": "passed"
});
formatter.after({
  "duration": 82800,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;4",
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
  "line": 12,
  "name": "Enter Email Address as \"\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"This is a required field.\" validation message for Email Address.",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"This is a required field.\" validation message for First Name.",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"This is a required field.\" validation message forLast Name.",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"This is a required field.\" validation message for Password.",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"This is a required field.\" validation message for Confirm_password.",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"\" message for all invalid credentials.",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 24
    }
  ],
  "location": "SignUp_Step.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 319527400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "SignUp_Step.enter_First_Name_as(String)"
});
formatter.result({
  "duration": 327963700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 20
    }
  ],
  "location": "SignUp_Step.enter_Last_Name_as(String)"
});
formatter.result({
  "duration": 342329100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "SignUp_Step.enter_password(String)"
});
formatter.result({
  "duration": 1342913300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 27
    }
  ],
  "location": "SignUp_Step.enter_Confirm_password_as(String)"
});
formatter.result({
  "duration": 359170400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1375847100,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3120459400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Email_Address(String)"
});
formatter.result({
  "duration": 1077246600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_First_Name(String)"
});
formatter.result({
  "duration": 47156800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_forLast_Name(String)"
});
formatter.result({
  "duration": 46218900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_password(String)"
});
formatter.result({
  "duration": 20031338500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Confirm_password(String)"
});
formatter.result({
  "duration": 20030124000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.message_for_all_invalid_credentials(String)"
});
formatter.result({
  "duration": 20030392600,
  "status": "passed"
});
formatter.after({
  "duration": 74800,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;5",
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
  "line": 12,
  "name": "Enter Email Address as \"selenium.testing1234@gmail.com\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"\" validation message for Email Address.",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\" validation message for First Name.",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"This is a required field.\" validation message forLast Name.",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"This is a required field.\" validation message for Password.",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"This is a required field.\" validation message for Confirm_password.",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"\" message for all invalid credentials.",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "selenium.testing1234@gmail.com",
      "offset": 24
    }
  ],
  "location": "SignUp_Step.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 358523800,
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
  "duration": 326917400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 20
    }
  ],
  "location": "SignUp_Step.enter_Last_Name_as(String)"
});
formatter.result({
  "duration": 327609100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "SignUp_Step.enter_password(String)"
});
formatter.result({
  "duration": 1358549100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 27
    }
  ],
  "location": "SignUp_Step.enter_Confirm_password_as(String)"
});
formatter.result({
  "duration": 282012400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1310678300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3106432600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Email_Address(String)"
});
formatter.result({
  "duration": 1061660000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_First_Name(String)"
});
formatter.result({
  "duration": 47641800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_forLast_Name(String)"
});
formatter.result({
  "duration": 45841200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_password(String)"
});
formatter.result({
  "duration": 20031646200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Confirm_password(String)"
});
formatter.result({
  "duration": 20029865200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.message_for_all_invalid_credentials(String)"
});
formatter.result({
  "duration": 20029381900,
  "status": "passed"
});
formatter.after({
  "duration": 81200,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;6",
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
  "line": 12,
  "name": "Enter Email Address as \"selenium.testing1234@gmail.com\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"\" validation message for Email Address.",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\" validation message for First Name.",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"\" validation message forLast Name.",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"This is a required field.\" validation message for Password.",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"This is a required field.\" validation message for Confirm_password.",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"\" message for all invalid credentials.",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "selenium.testing1234@gmail.com",
      "offset": 24
    }
  ],
  "location": "SignUp_Step.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 356257800,
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
  "duration": 311205700,
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
  "duration": 325334300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "SignUp_Step.enter_password(String)"
});
formatter.result({
  "duration": 1358810600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 27
    }
  ],
  "location": "SignUp_Step.enter_Confirm_password_as(String)"
});
formatter.result({
  "duration": 342607000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1359524200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3090613200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Email_Address(String)"
});
formatter.result({
  "duration": 1061655600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_First_Name(String)"
});
formatter.result({
  "duration": 47285100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_forLast_Name(String)"
});
formatter.result({
  "duration": 46217000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_password(String)"
});
formatter.result({
  "duration": 20031031400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Confirm_password(String)"
});
formatter.result({
  "duration": 20029677700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.message_for_all_invalid_credentials(String)"
});
formatter.result({
  "duration": 20030126700,
  "status": "passed"
});
formatter.after({
  "duration": 85400,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;7",
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
  "line": 12,
  "name": "Enter Email Address as \"selenium.testing1234@gmail.com\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"1234\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"\" validation message for Email Address.",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\" validation message for First Name.",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"\" validation message forLast Name.",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"Please enter 6 or more characters. Leading or trailing spaces will be ignored.\" validation message for Password.",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"This is a required field.\" validation message for Confirm_password.",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"\" message for all invalid credentials.",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "selenium.testing1234@gmail.com",
      "offset": 24
    }
  ],
  "location": "SignUp_Step.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 355916000,
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
  "duration": 327357800,
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
  "duration": 327080400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 19
    }
  ],
  "location": "SignUp_Step.enter_password(String)"
});
formatter.result({
  "duration": 1358518400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 27
    }
  ],
  "location": "SignUp_Step.enter_Confirm_password_as(String)"
});
formatter.result({
  "duration": 343392700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1358985000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3075346400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Email_Address(String)"
});
formatter.result({
  "duration": 1061350100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_First_Name(String)"
});
formatter.result({
  "duration": 47211300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_forLast_Name(String)"
});
formatter.result({
  "duration": 46853200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please enter 6 or more characters. Leading or trailing spaces will be ignored.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_password(String)"
});
formatter.result({
  "duration": 45717800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Confirm_password(String)"
});
formatter.result({
  "duration": 20031069200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.message_for_all_invalid_credentials(String)"
});
formatter.result({
  "duration": 20029707100,
  "status": "passed"
});
formatter.after({
  "duration": 82400,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;8",
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
  "line": 12,
  "name": "Enter Email Address as \"selenium.testing1234@gmail.com\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"123456\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"654221\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"\" validation message for Email Address.",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\" validation message for First Name.",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"\" validation message forLast Name.",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"\" validation message for Password.",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"Please make sure your passwords match.\" validation message for Confirm_password.",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"\" message for all invalid credentials.",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "selenium.testing1234@gmail.com",
      "offset": 24
    }
  ],
  "location": "SignUp_Step.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 355861400,
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
  "duration": 327427000,
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
  "duration": 327320800,
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
  "duration": 1358649100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "654221",
      "offset": 27
    }
  ],
  "location": "SignUp_Step.enter_Confirm_password_as(String)"
});
formatter.result({
  "duration": 327095900,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1374922100,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3065990200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Email_Address(String)"
});
formatter.result({
  "duration": 1024249100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_First_Name(String)"
});
formatter.result({
  "duration": 47603700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_forLast_Name(String)"
});
formatter.result({
  "duration": 46528900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_password(String)"
});
formatter.result({
  "duration": 45890400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please make sure your passwords match.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Confirm_password(String)"
});
formatter.result({
  "duration": 20030809200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.message_for_all_invalid_credentials(String)"
});
formatter.result({
  "duration": 20029602400,
  "status": "passed"
});
formatter.after({
  "duration": 78400,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Data driving for invalid data for sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-invalid-data-for-sign-up.;;9",
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
  "line": 12,
  "name": "Enter Email Address as \"selenium.testing1234@gmail.com\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter Password as \"123456\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter Confirm password as \"123456\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify \"\" validation message for Email Address.",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify \"\" validation message for First Name.",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify \"\" validation message forLast Name.",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify \"\" validation message for Password.",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify \"\" validation message for Confirm_password.",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify \"There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.\" message for all invalid credentials.",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "selenium.testing1234@gmail.com",
      "offset": 24
    }
  ],
  "location": "SignUp_Step.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 356025000,
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
  "duration": 327676700,
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
  "duration": 327350600,
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
  "duration": 1360588200,
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
  "duration": 356431000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1359527600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3090888200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Email_Address(String)"
});
formatter.result({
  "duration": 20067974200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_First_Name(String)"
});
formatter.result({
  "duration": 20036785700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_forLast_Name(String)"
});
formatter.result({
  "duration": 20018295400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_password(String)"
});
formatter.result({
  "duration": 20030377600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.verify_validation_message_for_Confirm_password(String)"
});
formatter.result({
  "duration": 20029971400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.",
      "offset": 8
    }
  ],
  "location": "SignUp_Step.message_for_all_invalid_credentials(String)"
});
formatter.result({
  "duration": 61065100,
  "status": "passed"
});
formatter.after({
  "duration": 91100,
  "status": "passed"
});
formatter.scenarioOutline({
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
  "duration": 402636100,
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
  "duration": 290945100,
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
  "duration": 262900600,
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
  "duration": 1334055700,
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
  "duration": 326621600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1359901100,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3122572600,
  "status": "passed"
});
formatter.after({
  "duration": 80900,
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
  "duration": 1075197600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_price_subscription()"
});
formatter.result({
  "duration": 4639230800,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.payement_option()"
});
formatter.result({
  "duration": 4061197700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.my_account_link()"
});
formatter.result({
  "duration": 1936659200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_account_link()"
});
formatter.result({
  "duration": 1233664500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.confirm_yes_()"
});
formatter.result({
  "duration": 1124244200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_confirmation_message()"
});
formatter.result({
  "duration": 4077440200,
  "status": "passed"
});
formatter.after({
  "duration": 77000,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@signupTest_select_paypal_payement_option"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "Navigates to website url.",
  "keyword": "Given "
});
formatter.step({
  "line": 60,
  "name": "Click on Most Downloaded link.",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "Select a product items.",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Click on Download this presentation link.",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Click on Create an Account CTA.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.navigates_to_website_url()"
});
formatter.result({
  "duration": 44030290500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_most_download()"
});
formatter.result({
  "duration": 12184370600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_product()"
});
formatter.result({
  "duration": 3987135700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Download_this_presentation_link()"
});
formatter.result({
  "duration": 2105241700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.reate_an_Account_CTA()"
});
formatter.result({
  "duration": 2358563800,
  "status": "passed"
});
formatter.after({
  "duration": 77500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 65,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 64,
      "name": "@signupTest_select_paypal_payement_option"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "Enter Email \"\u003cEmail Address\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "Enter First Name as \"\u003cFirst Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "Enter Last Name as \"\u003cLast Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "Enter Password as \"\u003cPassword\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "Enter Confirm password as \"\u003cConfirm_password\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.examples({
  "line": 73,
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
      "line": 74,
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
      "line": 75,
      "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 75,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@signupTest"
    },
    {
      "line": 64,
      "name": "@signupTest_select_paypal_payement_option"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "Enter Email \"selenium.testing\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "Enter Password as \"123456\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "Enter Confirm password as \"123456\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
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
  "duration": 420517300,
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
  "duration": 342773400,
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
  "duration": 468409000,
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
  "duration": 1545879000,
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
  "duration": 359013500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1390271000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3122489000,
  "status": "passed"
});
formatter.after({
  "duration": 128200,
  "status": "passed"
});
formatter.scenario({
  "line": 78,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 77,
      "name": "@signupTest_select_paypal_payement_option"
    }
  ]
});
formatter.step({
  "line": 79,
  "name": "After signup see the price page.",
  "keyword": "Given "
});
formatter.step({
  "line": 80,
  "name": "Select price subscription.",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "Verify the default payment option as paypal.",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "Enter the coupon code.",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "Apply the coupon code as given.",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "Verify the applied coupon code.",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "click on place order button.",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "Verify the paypal payement process.",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "Navigates to website url home page.",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Click on My account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "Click on delete account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "Click on Yes button.",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "Verify the delete account confirmation message.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.verify_the_price_page()"
});
formatter.result({
  "duration": 1075541100,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_price_subscription()"
});
formatter.result({
  "duration": 5092804300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_the_default_payment_option_as_paypal()"
});
formatter.result({
  "duration": 1061735900,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.Enter_the_coupon_code()"
});
formatter.result({
  "duration": 1057877000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.apply_the_coupon_code()"
});
formatter.result({
  "duration": 6128165200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.applied_coupon_code()"
});
formatter.result({
  "duration": 3046149200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_place_order_cta()"
});
formatter.result({
  "duration": 5108493400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.paypal_payement_place_process_Step()"
});
formatter.result({
  "duration": 9094428600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.website_url_home_page()"
});
formatter.result({
  "duration": 1860026100,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.my_account_link()"
});
formatter.result({
  "duration": 2058785900,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_account_link()"
});
formatter.result({
  "duration": 1233609700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.confirm_yes_()"
});
formatter.result({
  "duration": 1108742500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_confirmation_message()"
});
formatter.result({
  "duration": 4139624100,
  "status": "passed"
});
formatter.after({
  "duration": 76500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 92,
      "value": "#\t\t\t//Payement the paypal screen without apply coupon code"
    }
  ],
  "line": 95,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 94,
      "name": "@signupTest_select_paypal_payement_without_coupon"
    }
  ]
});
formatter.step({
  "line": 96,
  "name": "Navigates to website url.",
  "keyword": "Given "
});
formatter.step({
  "line": 97,
  "name": "Click on Most Downloaded link.",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "Select a product items.",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "Click on Download this presentation link.",
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "Click on Create an Account CTA.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.navigates_to_website_url()"
});
formatter.result({
  "duration": 43963227700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_most_download()"
});
formatter.result({
  "duration": 12016694600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_product()"
});
formatter.result({
  "duration": 3877313600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Download_this_presentation_link()"
});
formatter.result({
  "duration": 2104922900,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.reate_an_Account_CTA()"
});
formatter.result({
  "duration": 2530544800,
  "status": "passed"
});
formatter.after({
  "duration": 86800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 102,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 101,
      "name": "@signupTest_select_paypal_payement_without_coupon"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "Enter Email \"\u003cEmail Address\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "Enter First Name as \"\u003cFirst Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "Enter Last Name as \"\u003cLast Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "Enter Password as \"\u003cPassword\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "Enter Confirm password as \"\u003cConfirm_password\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 108,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.examples({
  "line": 110,
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
      "line": 111,
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
      "line": 112,
      "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 112,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@signupTest"
    },
    {
      "line": 101,
      "name": "@signupTest_select_paypal_payement_without_coupon"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "Enter Email \"selenium.testing\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "Enter Password as \"123456\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "Enter Confirm password as \"123456\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 108,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
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
  "duration": 404218600,
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
  "duration": 343642700,
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
  "duration": 328825500,
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
  "duration": 1372745400,
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
  "duration": 374298500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1375075300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3106611100,
  "status": "passed"
});
formatter.after({
  "duration": 546600,
  "status": "passed"
});
formatter.scenario({
  "line": 115,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 114,
      "name": "@signupTest_select_paypal_payement_without_coupon"
    }
  ]
});
formatter.step({
  "line": 116,
  "name": "After signup see the price page.",
  "keyword": "Given "
});
formatter.step({
  "line": 117,
  "name": "Select price subscription.",
  "keyword": "Then "
});
formatter.step({
  "line": 118,
  "name": "Verify the default payment option as paypal.",
  "keyword": "Then "
});
formatter.step({
  "line": 119,
  "name": "click on place order button.",
  "keyword": "Then "
});
formatter.step({
  "line": 120,
  "name": "Verify the paypal payement process.",
  "keyword": "Then "
});
formatter.step({
  "line": 121,
  "name": "Navigates to website url home page.",
  "keyword": "Then "
});
formatter.step({
  "line": 122,
  "name": "Click on My account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 123,
  "name": "Click on delete account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 124,
  "name": "Click on Yes button.",
  "keyword": "Then "
});
formatter.step({
  "line": 125,
  "name": "Verify the delete account confirmation message.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.verify_the_price_page()"
});
formatter.result({
  "duration": 1074366700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_price_subscription()"
});
formatter.result({
  "duration": 4655338500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_the_default_payment_option_as_paypal()"
});
formatter.result({
  "duration": 1186874800,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_place_order_cta()"
});
formatter.result({
  "duration": 5108563800,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.paypal_payement_place_process_Step()"
});
formatter.result({
  "duration": 9077238700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.website_url_home_page()"
});
formatter.result({
  "duration": 1892181300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.my_account_link()"
});
formatter.result({
  "duration": 1949883900,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_account_link()"
});
formatter.result({
  "duration": 1233724100,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.confirm_yes_()"
});
formatter.result({
  "duration": 1110747300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_confirmation_message()"
});
formatter.result({
  "duration": 4137549100,
  "status": "passed"
});
formatter.after({
  "duration": 91500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 126,
      "value": "#\t\t\t//Payement with card apply coupon code"
    }
  ],
  "line": 129,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 128,
      "name": "@signupTest_select_Card_payement"
    }
  ]
});
formatter.step({
  "line": 130,
  "name": "Navigates to website url.",
  "keyword": "Given "
});
formatter.step({
  "line": 131,
  "name": "Click on Most Downloaded link.",
  "keyword": "Then "
});
formatter.step({
  "line": 132,
  "name": "Select a product items.",
  "keyword": "Then "
});
formatter.step({
  "line": 133,
  "name": "Click on Download this presentation link.",
  "keyword": "Then "
});
formatter.step({
  "line": 134,
  "name": "Click on Create an Account CTA.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.navigates_to_website_url()"
});
formatter.result({
  "duration": 44014663000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_most_download()"
});
formatter.result({
  "duration": 12106161900,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_product()"
});
formatter.result({
  "duration": 3970281400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Download_this_presentation_link()"
});
formatter.result({
  "duration": 2074628400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.reate_an_Account_CTA()"
});
formatter.result({
  "duration": 2343103400,
  "status": "passed"
});
formatter.after({
  "duration": 92900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 136,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 135,
      "name": "@signupTest_select_Card_payement"
    }
  ]
});
formatter.step({
  "line": 137,
  "name": "Enter Email \"\u003cEmail Address\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 138,
  "name": "Enter First Name as \"\u003cFirst Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 139,
  "name": "Enter Last Name as \"\u003cLast Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 140,
  "name": "Enter Password as \"\u003cPassword\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 141,
  "name": "Enter Confirm password as \"\u003cConfirm_password\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 142,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 143,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.examples({
  "line": 144,
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
      "line": 145,
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
      "line": 146,
      "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 146,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@signupTest"
    },
    {
      "line": 135,
      "name": "@signupTest_select_Card_payement"
    }
  ]
});
formatter.step({
  "line": 137,
  "name": "Enter Email \"selenium.testing\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 138,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 139,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 140,
  "name": "Enter Password as \"123456\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 141,
  "name": "Enter Confirm password as \"123456\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 142,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 143,
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
  "duration": 404276300,
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
  "duration": 343576900,
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
  "duration": 327228100,
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
  "duration": 1359001800,
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
  "duration": 358526300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1374741300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3122532100,
  "status": "passed"
});
formatter.after({
  "duration": 70500,
  "status": "passed"
});
formatter.scenario({
  "line": 150,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 149,
      "name": "@signupTest_select_Card_payement"
    }
  ]
});
formatter.step({
  "line": 151,
  "name": "After signup see the price page.",
  "keyword": "Given "
});
formatter.step({
  "line": 152,
  "name": "Select price subscription.",
  "keyword": "Then "
});
formatter.step({
  "line": 153,
  "name": "Select the payment option as card.",
  "keyword": "Then "
});
formatter.step({
  "line": 154,
  "name": "Enter the coupon code.",
  "keyword": "Then "
});
formatter.step({
  "line": 155,
  "name": "Apply the coupon code as given.",
  "keyword": "Then "
});
formatter.step({
  "line": 156,
  "name": "Verify the applied coupon code.",
  "keyword": "Then "
});
formatter.step({
  "line": 157,
  "name": "click on place order button.",
  "keyword": "Then "
});
formatter.step({
  "line": 158,
  "name": "Verify the card payement page.",
  "keyword": "Then "
});
formatter.step({
  "line": 159,
  "name": "Navigates to website url home page.",
  "keyword": "Then "
});
formatter.step({
  "line": 160,
  "name": "Click on My account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 161,
  "name": "Click on delete account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 162,
  "name": "Click on Yes button.",
  "keyword": "Then "
});
formatter.step({
  "line": 163,
  "name": "Verify the delete account confirmation message.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.verify_the_price_page()"
});
formatter.result({
  "duration": 1075614300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_price_subscription()"
});
formatter.result({
  "duration": 4593054300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.card_payment()"
});
formatter.result({
  "duration": 2311752400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.Enter_the_coupon_code()"
});
formatter.result({
  "duration": 1125446200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.apply_the_coupon_code()"
});
formatter.result({
  "duration": 6107516500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.applied_coupon_code()"
});
formatter.result({
  "duration": 3061784300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_place_order_cta()"
});
formatter.result({
  "duration": 5093634500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.card_page()"
});
formatter.result({
  "duration": 11092073500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.website_url_home_page()"
});
formatter.result({
  "duration": 2119665800,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.my_account_link()"
});
formatter.result({
  "duration": 1894571500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_account_link()"
});
formatter.result({
  "duration": 1233567500,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.confirm_yes_()"
});
formatter.result({
  "duration": 1108730200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.delete_confirmation_message()"
});
formatter.result({
  "duration": 4124221400,
  "status": "passed"
});
formatter.after({
  "duration": 71500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 164,
      "value": "#\t\t\t\t\t\t\t\t\t//\t\tpayement the product without coupon"
    }
  ],
  "line": 167,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 166,
      "name": "@signupTest_select_Card_payement_without_coupon"
    }
  ]
});
formatter.step({
  "line": 168,
  "name": "Navigates to website url.",
  "keyword": "Given "
});
formatter.step({
  "line": 169,
  "name": "Click on Most Downloaded link.",
  "keyword": "Then "
});
formatter.step({
  "line": 170,
  "name": "Select a product items.",
  "keyword": "Then "
});
formatter.step({
  "line": 171,
  "name": "Click on Download this presentation link.",
  "keyword": "Then "
});
formatter.step({
  "line": 172,
  "name": "Click on Create an Account CTA.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.navigates_to_website_url()"
});
formatter.result({
  "duration": 43953126200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_most_download()"
});
formatter.result({
  "duration": 12386577900,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_product()"
});
formatter.result({
  "duration": 3828615200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Download_this_presentation_link()"
});
formatter.result({
  "duration": 1841879900,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.reate_an_Account_CTA()"
});
formatter.result({
  "duration": 2343040600,
  "status": "passed"
});
formatter.after({
  "duration": 66700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 174,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 173,
      "name": "@signupTest_select_Card_payement_without_coupon"
    }
  ]
});
formatter.step({
  "line": 175,
  "name": "Enter Email \"\u003cEmail Address\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 176,
  "name": "Enter First Name as \"\u003cFirst Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 177,
  "name": "Enter Last Name as \"\u003cLast Name\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 178,
  "name": "Enter Password as \"\u003cPassword\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 179,
  "name": "Enter Confirm password as \"\u003cConfirm_password\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 180,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 181,
  "name": "click on Signup button.",
  "keyword": "Then "
});
formatter.examples({
  "line": 182,
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
      "line": 183,
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
      "line": 184,
      "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 184,
  "name": "Data driving for valid sign-up.",
  "description": "",
  "id": "signup-test-on-web-application;data-driving-for-valid-sign-up.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@signupTest"
    },
    {
      "line": 173,
      "name": "@signupTest_select_Card_payement_without_coupon"
    }
  ]
});
formatter.step({
  "line": 175,
  "name": "Enter Email \"selenium.testing\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 176,
  "name": "Enter First Name as \"Test\".",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 177,
  "name": "Enter Last Name as \"Test\".",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 178,
  "name": "Enter Password as \"123456\".",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 179,
  "name": "Enter Confirm password as \"123456\".",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 180,
  "name": "Enter the captcha.",
  "keyword": "Then "
});
formatter.step({
  "line": 181,
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
  "duration": 389390500,
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
  "duration": 327984800,
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
  "duration": 327174400,
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
  "duration": 1468347100,
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
  "duration": 358686200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.enter_the_captcha()"
});
formatter.result({
  "duration": 1375432000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_Signup_button()"
});
formatter.result({
  "duration": 3106556300,
  "status": "passed"
});
formatter.after({
  "duration": 65900,
  "status": "passed"
});
formatter.scenario({
  "line": 187,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 186,
      "name": "@signupTest_select_Card_payement_without_coupon"
    }
  ]
});
formatter.step({
  "line": 188,
  "name": "After signup see the price page.",
  "keyword": "Given "
});
formatter.step({
  "line": 189,
  "name": "Select price subscription.",
  "keyword": "Then "
});
formatter.step({
  "line": 190,
  "name": "Select the payment option as card.",
  "keyword": "Then "
});
formatter.step({
  "line": 191,
  "name": "click on place order button.",
  "keyword": "Then "
});
formatter.step({
  "line": 192,
  "name": "Verify the card payement page.",
  "keyword": "Then "
});
formatter.step({
  "line": 193,
  "name": "Navigates to website url home page.",
  "keyword": "Then "
});
formatter.step({
  "line": 194,
  "name": "Click on My account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 195,
  "name": "Click on delete account link.",
  "keyword": "Then "
});
formatter.step({
  "line": 196,
  "name": "Click on Yes button.",
  "keyword": "Then "
});
formatter.step({
  "line": 197,
  "name": "Verify the delete account confirmation message.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.verify_the_price_page()"
});
formatter.result({
  "duration": 1060602200,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_price_subscription()"
});
formatter.result({
  "duration": 4546151400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.card_payment()"
});
formatter.result({
  "duration": 2452446400,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_on_place_order_cta()"
});
