$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/ForgotPassword.feature");
formatter.feature({
  "line": 2,
  "name": "Verify the forgot password.",
  "description": "",
  "id": "verify-the-forgot-password.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@forgotTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test the forgot password.",
  "description": "",
  "id": "verify-the-forgot-password.;test-the-forgot-password.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "To the application URL.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Select on Complete ppts CTA.",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Select as a Project Scoping Powerpoint.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on download link cta.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on forgot password link.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter the user email address is registerd as \"\u003cEmail Address\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on submit button.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify \"\u003cEmail AddressVal\u003e\" the validation message.",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "verify-the-forgot-password.;test-the-forgot-password.;",
  "rows": [
    {
      "cells": [
        "Email Address",
        "Email AddressVal"
      ],
      "line": 13,
      "id": "verify-the-forgot-password.;test-the-forgot-password.;;1"
    },
    {
      "cells": [
        "",
        "This is a required field."
      ],
      "line": 14,
      "id": "verify-the-forgot-password.;test-the-forgot-password.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Test the forgot password.",
  "description": "",
  "id": "verify-the-forgot-password.;test-the-forgot-password.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@forgotTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "To the application URL.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Select on Complete ppts CTA.",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Select as a Project Scoping Powerpoint.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on download link cta.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on forgot password link.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter the user email address is registerd as \"\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on submit button.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify \"This is a required field.\" the validation message.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Forgotpassword.navigates_to_website_url()"
});
formatter.result({
  "duration": 6865108200,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.click_most_download()"
});
formatter.result({
  "duration": 9770014500,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.select_product()"
});
formatter.result({
  "duration": 4248473200,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.click_on_Download_this_presentation_link()"
});
formatter.result({
  "duration": 9015052200,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.google_create()"
});
formatter.result({
  "duration": 799726800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 46
    }
  ],
  "location": "Forgotpassword.user_mail(String)"
});
formatter.result({
  "duration": 400521200,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.enter_user_mail()"
});
formatter.result({
  "duration": 3075119500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a required field.",
      "offset": 8
    }
  ],
  "location": "Forgotpassword.password_page(String)"
});
formatter.result({
  "duration": 2092042300,
  "status": "passed"
});
formatter.after({
  "duration": 262600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "",
  "description": "",
  "id": "verify-the-forgot-password.;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "To the application URL.",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Select on Complete ppts CTA.",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select as a Project Scoping Powerpoint.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on download link cta.",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on forgot password link.",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the user email address is registerd as \"\u003cEmail Address\u003e\".",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Click on submit button.",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "\"\u003cpassword SendVal\u003e\" validation message.",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "verify-the-forgot-password.;;",
  "rows": [
    {
      "cells": [
        "Email Address",
        "password SendVal"
      ],
      "line": 25,
      "id": "verify-the-forgot-password.;;;1"
    },
    {
      "cells": [
        "test.shadab@gmail.com",
        "If there is an account associated with test.shadab@gmail.com you will receive an email with a link to reset your password."
      ],
      "line": 26,
      "id": "verify-the-forgot-password.;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "",
  "id": "verify-the-forgot-password.;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@forgotTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "To the application URL.",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Select on Complete ppts CTA.",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select as a Project Scoping Powerpoint.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on download link cta.",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on forgot password link.",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the user email address is registerd as \"test.shadab@gmail.com\".",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Click on submit button.",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "\"If there is an account associated with test.shadab@gmail.com you will receive an email with a link to reset your password.\" validation message.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Forgotpassword.navigates_to_website_url()"
});
formatter.result({
  "duration": 43863210200,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.click_most_download()"
});
formatter.result({
  "duration": 9657403300,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.select_product()"
});
formatter.result({
  "duration": 4174778900,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.click_on_Download_this_presentation_link()"
});
formatter.result({
  "duration": 9046918600,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.google_create()"
});
formatter.result({
  "duration": 828781600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test.shadab@gmail.com",
      "offset": 46
    }
  ],
  "location": "Forgotpassword.user_mail(String)"
});
formatter.result({
  "duration": 414781500,
  "status": "passed"
});
formatter.match({
  "location": "Forgotpassword.enter_user_mail()"
});
formatter.result({
  "duration": 3068395000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "If there is an account associated with test.shadab@gmail.com you will receive an email with a link to reset your password.",
      "offset": 1
    }
  ],
  "location": "Forgotpassword.Verify_user_send_email(String)"
});
formatter.result({
  "duration": 2018334300,
  "status": "passed"
});
formatter.after({
  "duration": 95500,
  "status": "passed"
});
});