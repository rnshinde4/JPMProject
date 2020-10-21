$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ValGoogleSearch.feature");
formatter.feature({
  "line": 2,
  "name": "JP Morgan logo test",
  "description": "",
  "id": "jp-morgan-logo-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Validate logo on JP Morgan homepage",
  "description": "",
  "id": "jp-morgan-logo-test;validate-logo-on-jp-morgan-homepage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@googlesearch"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigated to google webpage \"\u003ctitle\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user search for \"\u003csearch\u003e\" and click on relevant search result item",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to view jpm logo on the page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "jp-morgan-logo-test;validate-logo-on-jp-morgan-homepage;",
  "rows": [
    {
      "cells": [
        "title",
        "search"
      ],
      "line": 11,
      "id": "jp-morgan-logo-test;validate-logo-on-jp-morgan-homepage;;1"
    },
    {
      "cells": [
        "Google",
        "J.P. Morgan"
      ],
      "line": 12,
      "id": "jp-morgan-logo-test;validate-logo-on-jp-morgan-homepage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Validate logo on JP Morgan homepage",
  "description": "",
  "id": "jp-morgan-logo-test;validate-logo-on-jp-morgan-homepage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 4,
      "name": "@googlesearch"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigated to google webpage \"Google\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user search for \"J.P. Morgan\" and click on relevant search result item",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to view jpm logo on the page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 34
    }
  ],
  "location": "GoogleSearchStepDefs.userNavigatedToGoogleWebpage(String)"
});
formatter.result({
  "duration": 29563366401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P. Morgan",
      "offset": 17
    }
  ],
  "location": "GoogleSearchStepDefs.userSearchForAndClickOnRelevantSearchResultItem(String)"
});
formatter.result({
  "duration": 36460897300,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchStepDefs.userShouldBeAbleToViewJpmLogoOnThePage()"
});
formatter.result({
  "duration": 66586101,
  "status": "passed"
});
});