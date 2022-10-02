Feature: Bookcategory

            Background: I should be able to see homepages
            Given I enter URL "https://demo.nopcommerce.com/" in browaser
            And I am on home page

            Scenario Outline: I should be able to see top menu tabs on homepage with categories
            When I am on home page
            Then I should be able to see top menu tabs with"<categories>"
            Examples:
            |Categories          |
            |comptuer            |
            |Electronic          |
            |Apparel             |
            |Digital downloads   |
            |Books               |
            |jewellery           |
            |Gift card           |

            Scenario Outline: I should be able to see book page with filters
            When I select book category from top menu tabs on home page
            Then I should be navigated to book category
            And I should be able to see "<filters>"
            Examples:
            |filters          |
            |Short by         |
            |Display          |
            |the Grid         |
            |List Tab         |

            Scenario Outline: I should be able to see list of terms of each filter
            Given I am on book Page
            When I click on "<filter>"
            Then I should be able to see "<list >" in dropdown menu
            Examples:
            |filters          | list                                                                            |
            |Short by         | Name:A to Z, Name:Z to A, Price: Low to High, Price: High To Low, Created on    |
            |Display          |3,6,9                                                                            |

            Scenario Outline: I should be able to choose any filter option with specific result
            Given I am on book Page
            When I click on "<filter>"
            And I click on any "<option>"
            Then I should be able to choose any filter option from the list
            And i should be able to see "<result>"
            Examples:
            |filters          |option               |result                                                             |
            |Short by         |Name:A to Z          |sorted product with the product name in alphabetical order A to Z  |
            |Short by         |Name:Z to A          |sorted product with the product name in alphabetical order Z to A  |
            |Short by         |Price: Low to High   |sorted product with the price in descending order                  |
            |Short by         |Price: High To Low   |sorted product with the price in ascending order                   |
            |Short by         |Created on           |Recently added product should be show frist                        |
            |Display          |3                    |3 prodcuts in a page                                               |
            |Display          |6                    |6 prodcuts in a page                                               |
            |Display          |9                    |9 prodcuts in a page                                               |

            Scenario Outline: I should be able to see prodcut display formet according display format typs as per given picture in srs document
            Gien I am on book Page
            When I Click On "<display formet icon>"
            Then I should be able to see prodcut display formet according display formet typs as per given picture in SRS document
            Examples:
            |display formet icon        |
            |Grid                       |
            |List                       |
