$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TempConverter.feature");
formatter.feature({
  "name": "Develope a Centigrade to Fahrenheit",
  "description": "\tTemparature Converter",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@f1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Centigrade to Fahrenheit Temparature Converter",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "click on \"\u003cbutton1\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the temparature \u003ctemperature\u003e in Centigrade",
  "keyword": "And "
});
formatter.step({
  "name": "click on \"\u003cbutton2\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the temparature should be equal to \u003coutput\u003e Fahrenheit",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "button1",
        "temperature",
        "button2",
        "output"
      ]
    },
    {
      "cells": [
        "Reset",
        "20.00",
        "Convert",
        "68.00"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Centigrade to Fahrenheit Temparature Converter",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@f1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Reset\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TempConverterStepdef.click_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the temparature 20.00 in Centigrade",
  "keyword": "And "
});
formatter.match({
  "location": "TempConverterStepdef.enter_the_temparature_in_Centigrade(Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Convert\"",
  "keyword": "When "
});
formatter.match({
  "location": "TempConverterStepdef.click_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the temparature should be equal to 68.00 Fahrenheit",
  "keyword": "Then "
});
formatter.match({
  "location": "TempConverterStepdef.the_temparature_should_be_equal_to_Fahrenheit(Double)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});