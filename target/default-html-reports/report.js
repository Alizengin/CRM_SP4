$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/QuickNavMenu.feature");
formatter.feature({
  "name": "Quick navigation menu",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Authorized user can send message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@message"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"\u003cuserType\u003e\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.crm.step_definitions.LoginPageStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\r\n\tat com.crm.pages.LoginPage.login(LoginPage.java:24)\r\n\tat com.crm.step_definitions.LoginPageStepDefs.the_user_logged_in_as(LoginPageStepDefs.java:35)\r\n\tat ✽.the user logged in as \"\u003cuserType\u003e\"(file:///C:/Users/HP%20ELITEBOOK%20840%20G1/IdeaProjects/CRM_SP4/src/test/resources/features/QuickNavMenu.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user clicks message button",
  "keyword": "When "
});
formatter.match({
  "location": "com.crm.step_definitions.QuickNavMenuStepDefs.the_user_clicks_message_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});