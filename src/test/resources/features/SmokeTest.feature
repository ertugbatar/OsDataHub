@Smoke
Feature: Validating basic attributes on main pages

    Scenario: Validate main page elements
        Given user open main page on browser
        When the user verifies "main_page" elements
        Then the user verifies "docs_page_side_menu" on "docs" page

    Scenario: Validate request response and payload
        Given the user calls API "https://api.os.uk/downloads/v1" and verifies "response_status_code" as "200"
        When the user calls API "https://api.os.uk/downloads/v1" and verifies "title" as "OS Downloads API"
        Then the user calls API "https://api.os.uk/downloads/v1" and verifies "description" as "The available Download APIs offered by Ordnance Survey. These provide access to bulk data through RESTful services."

