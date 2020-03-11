Feature: RegisterPage

  Scenario: どうぶつを登録する
    Given クリーニング
    And どうぶつ登録画面を表示する
    And なまえを入力する
    And 種別を入力する
    And 誕生日を入力する
    And 性別を入力する
    And エサ代を入力する
    When 登録する
    Then 一覧画面へ遷移する
    And どうぶつが１件登録されている