Feature: Login User
  Функциональность: Вход в систему по вкладке "Вход"
  Как: Пользователь
  Я хочу: Войти в свой аккаунт
  Чтобы: Убрать надоедливую рекламу

  Scenario: Login user
    #Given User is on Login Page #Допустим пользователь находится на странице логина
    #When User enters following credentials and submit #Когда пользователь вводит следующие данные
    #  |Name       |Value      |
    #  |Login      |test_user  |
    #  |Password   |pass       |
    Then Input login
    Then Input password
    Then Click "submit" button
    Then Subscription message "profile" visible
    #Тогда должно появиться окно с управлением подписки