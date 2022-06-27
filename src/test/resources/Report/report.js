$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features1/instagram.feature");
formatter.feature({
  "name": "Validation of Login Page in Linkedin web Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "LK01_Validation of Login Page with valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Linkedin Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepLk.user_launch_Linkedin_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username and password",
  "rows": [
    {
      "cells": [
        "bala"
      ]
    },
    {
      "cells": [
        "mani@gmail.com"
      ]
    },
    {
      "cells": [
        "java"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepLk.user_enters_valid_username_and_password()"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [User enters valid username and password] is defined with 0 parameters at \u0027com.step.StepLk.user_enters_valid_username_and_password() in file:/C:/Users/PRIYA/eclipse-workspace/Cucumber/target/test-classes/\u0027.\nHowever, the gherkin step has 1 arguments:\n * Table:\n      | bala           |\n      | mani@gmail.com |\n      | java           |\n\nStep text: User enters valid username and password\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Clicks Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepLk.user_Clicks_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Home Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepLk.user_verify_Home_Page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});