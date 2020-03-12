import {Given, Then} from 'cypress-cucumber-preprocessor/steps';

Given(`ダッシュボード画面を表示する`, () => {
  cy.visit('http://localhost:8080/animal-management/')
});

Then(`一覧リンクが表示される`, () => {
  cy.get('#list').should('have.text', 'どうぶつ一覧')
});

Then(`登録リンクが表示される`, () => {
  cy.get('#register').should('have.text', 'どうぶつ登録')
});
