$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("IthPharma.feature");
formatter.feature({
  "line": 1,
  "name": "Home page Testing",
  "description": "/**\r\n* Created by Ashish Mor\r\n*/",
  "id": "home-page-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5811607600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "As a user i want to verify Home page",
  "description": "",
  "id": "home-page-testing;as-a-user-i-want-to-verify-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "As a user I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click On Home",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify text \"COVID 19\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click On registered Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Username \"Himesh\"",
  "keyword": "And "
});
formatter.match({
  "location": "IthPharmaStep.asAUserIAmOnHomepage()"
});
formatter.result({
  "duration": 141956700,
  "status": "passed"
});
formatter.match({
  "location": "IthPharmaStep.iClickOnHome()"
});
formatter.result({
  "duration": 962961300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "COVID 19",
      "offset": 15
    }
  ],
  "location": "IthPharmaStep.iVerifyText(String)"
});
formatter.result({
  "duration": 72257000,
  "status": "passed"
});
formatter.match({
  "location": "IthPharmaStep.iClickOnRegisteredPage()"
});
formatter.result({
  "duration": 398352200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Himesh",
      "offset": 18
    }
  ],
  "location": "IthPharmaStep.iEnterUsername(String)"
});
formatter.result({
  "duration": 424429000,
  "status": "passed"
});
formatter.after({
  "duration": 140500,
  "status": "passed"
});
});