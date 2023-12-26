#Author: Heena Hans
@Regression
Feature: Filter movies by Actor
  UserStory : As a user, I want to seach for movies based on Actor so that I can decide on number of movies I would want to watch

  Scenario Outline: Correct number of movie by genre
    Given I have signed in NetFlix
    And I have the following movies by genre on Netflix
      | Bad Boys                | Action    |
      | Cast Away               | Adventure |
      | The Pursuit of Hapyness | Biography |
    When I search for movies by genre "<Genre>"
    Then I find number of movies "<Movies>" by Genre

    Examples: 
      | Genre     | Movies |
      | Action    |      1 |
      | Adventure |      1 |
      | Biography |      1 |
      | Romance   |      0 |
      |      1233 |      0 |
      | $$        |      0 |
      |           |      0 |
