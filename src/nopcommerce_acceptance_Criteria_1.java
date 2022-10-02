Feature: Demo Nopcommerce`s topmenu accepance criteria
        As a user, I would like to check acceptance criteria of Nopcommerce topmenu
        BackGround: User is on Given URL
        When User typs URL https://demo.nopcommerce.com
        And User click on Enter button
        Then User is on given URL

        Scenario: Verify that user can navigate to books category
        When User is on given URL
        And Click on boks tab on Top Menu
        Then User is navigated to books Category page


        Scenario: Verift that user can see the book category page with filters and list of products
        When User is on given URL
        And Click on books tab Top Menu
        And Check Filters and List Tab
        Then Books category page is dishplay with filters and list tabs

        Scenario: Verify that user can see 'Sort by' filter on book category page
        Given User is on books category page
        When User is on books category page
        And check 'Srot by'
        Then 'Sort by' filter is avilable on Book Category page

        Scenario: Verify that user can see 'Display' filter no Book Category page
        Given User is on Books Category page
        When User is on Books Category page
        And Check'Display' filter is present
        Then 'Display' filter is available on Book Category page

        Scenario: Verify that user can see 'Grid' tab no Book Category page
        Given User is on Books Category page
        When User is on Books Category page
        And Check'Gird' filter is present
        Then 'Gird' tab is available on Book Category page

        Scenario: Verify that user can see 'List' tab no Book Category page
        Given User is on Books Category page
        When User is on Books Category page
        And Check'List' filter is present
        Then 'List' tab is available on Book Category page

        Scenario: Verify that user can see 'Name: A to Z' selection is present in 'Sort by' filter
        Given User is on Books Category page
        When User is on Books Category page
        And Click on 'Sort by' Filter
        And Check that 'Name: A to Z' selection is present
        Then 'Name: A to Z' selection is present in 'Sort by' filter

        Scenario: Verify that user can see 'Name: A to Z' is frist option in 'Sort by' filter
        Given User is on Books Category page
        When User is on Books Category page
        And Click on 'Sort by' Filter
        And Check that 'Name: A to Z' is first in order
        Then 'Name: A to Z' is first option in order

        Scenario: Verify that user can see 'Name: A to Z' filter is functioning as expected(Note:Products are filtered in alphabetical order)
        Given User is on Books Category page
        When User is on Books Category page
        And Click on 'Sort by' Filter
        And Select 'Name: A to Z' Filter
        Then All products are dishplayed in alphabetuical order



        }
