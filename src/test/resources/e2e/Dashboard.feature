Feature: Dashboard
#  Background:
#    ダッシュボード画面を表示する

# success case

  Scenario: ダッシュボード画面を表示する
    Given ダッシュボード画面を表示する
    Then 一覧リンクが表示される
    And 登録リンクが表示される
