$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "id": "login",
  "description": "",
  "name": "Login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "login;log-in-with-incorrect-password",
  "description": "",
  "name": "Log in with incorrect password",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I want to log into the application",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I enter a correct user name",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "When I enter an incorrect password",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "The login should fail",
  "keyword": "Then ",
  "line": 7
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});