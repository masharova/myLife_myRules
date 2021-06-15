$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Git Hub sign in",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "error message is displayed upon registration with invalid email pattern",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Github login page is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.githubHomePageIsOpened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters “invalid” into email field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.userEntersValueIntoEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "red error sign inside the email field should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.redErrorSignInsideTheEmailFieldShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message below email field should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.errorMessageBelowEmailFieldShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "message under password field indicates a completeness of password requirements",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Github login page is opened 1",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.githubLoginPageIsOpenedForSecondScenario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters “AAA” into password field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.userEntersValueIntoPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "“at least fifteen characters” message should be marked red",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.atLeastFifteenCharactersMessageShouldBeMarkedRed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "“a lowercase letter” message should be marked red",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.aLowercaseLetterMessageShouldBeMarkedRed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters “AAAaaa” into password field again",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.userEntersInvalidIntoPasswordFieldAgain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "“at least fifteen characters” message should be marked red again",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.atLeastFifteenCharactersMessageShouldBeMarkedRedAgain()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "“a lowercase letter” message should be marked green",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.aLowercaseLetterMessageShouldBeMarkedGreen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "error message is displayed upon registration with already existent username",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Github login page is opened 2",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.githubLoginPageIsOpened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters masharova already existent username into username field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.userEntersAlreadyExistentUsernameIntoUsernameField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "red error sign inside username field should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.redErrorSignInsideUsernameFieldShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message below username field should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.errorMessageBelowUsernameFieldShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "suggested usernames in error message contains the username entered",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.suggestedUsernamesInErrorMessageContainsTheUsernameEntered()"
});
formatter.result({
  "status": "passed"
});
});