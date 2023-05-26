#Autor: Luis Fernando Pinillos Sanchez

  @HistoriaDeUsuario
  Feature: Verify the validation form
    Me as a user WANT to enter the colorlib page TO verify the validation form

  Scenario Outline: Verify the validation form
    Given I enter with my credentials
      | User   | Password   |
      | <User> | <Password> |
    When I proceed with the authentication
    And go to the main view of the page
    And enter submenu form validation
    And check the tittle of the form on the screen
    And fill all the fields
      | Required   | Select   | MultipleSelect   | Url   | Email   | PasswordVFP   | ConfirmPasswordVFP   | MinField   | MaxField   | Number   | Ip   | Date   | DateEarlier   |
      | <Required> | <Select> | <MultipleSelect> | <Url> | <Email> | <PasswordVFP> | <ConfirmPasswordVFP> | <MinField> | <MaxField> | <Number> | <Ip> | <Date> | <DateEarlier> |
    And click button validate
    Then fields required will be empty

    Examples:
      | User  | Password | Required | Select  | MultipleSelect | Url                | Email      | PasswordVFP | ConfirmPasswordVFP | MinField | MaxField | Number | Ip            | Date       | DateEarlier |
      | admin | admin    | prueba   | option2 | option3        | http://youtube.com | hola@q.com | 123         | 123                | 1234567  | 1        | 33.88  | 184.202.2.148 | 2012-12-24 | 2012/09/11  |