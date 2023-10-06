Feature: Account Overview

  Background:
    Given Navigate to Para Bank
    When Enter username and password and click login button

  Scenario: Bank Account Overview
    Then User Account details on the click
    And User should see Transaction Details
