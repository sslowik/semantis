# Intro: Requirement states that amountToPay should be calculated based on exchange rate:  amountToPay = amountToGet * rate
# The problem: Requirement was changed and now amountToPay can have 5% tolerance

Feature: User can get price for any currency pair

  Background: Mock exchange rates
    Given Exchange rates are:
      | currencyPair | rate    |
      | EURUSD       | 1.35    |
      | EURJPY       | 125     |
      | EURRUB       | 62.5211 |

  Scenario Outline: Exchange amount is calculated correctly
    Given User logs into application
    When User sends request for price:
      | currencyToGet | amountToGet | currencyToPay   |
      | EUR           | 1000        | <currencyToPay> |

    Then User receives amount to pay: <amountToPay> with tolerance: <toleranceRate>

    Examples:
      | currencyToPay | amountToPay | toleranceRate |
      | USD           | 1350        | 0.05          |
      | JPY           | 125000      | 0.05          |
      | RUB           | 62521.1     | 0.05          |


