#Author: Heena Hans
@Regression
Feature: Filter movies by Actor
  UserStory : As a user, I want to seach for movies based on Actor so that I can decide on number of movies I would want to watch

  Scenario Outline: Correct number of movie by actor
    Given I have signed in NetFlix
    And I have the following movies on Netflix based on Actor
      | Bad Boys                | Will Smith |
      | Cast Away               | Tom Hanks  |
      | The Pursuit of Hapyness | Will Smith |
    When I search for movies by Actor "<Actor>"
    Then I find number of movies "<Movies>"

    Examples: 
      | Actor      | Movies |
      | Will Smith |      2 |
      | Tom Hanks  |      1 |
      | Tom Cruise |      0 |
      | Mr Bean    |      0 |
      | xyz        |      0 |
      |       1233 |      0 |
      | $$         |      0 |
      |            |      0 |
