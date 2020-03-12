describe('Animal Management Test', () => {
  beforeEach(() => {
    cy.visit('http://localhost:8080/animal-management')
  })
  it('Dashboard Test', () => {
    cy.title().should('eq', 'animal-management')

    cy.get('h1').contains('どうぶつえん')
    cy.get('#list').contains('どうぶつ一覧')

    cy.get('#register').contains('どうぶつ登録').click()
    cy.title().should('eq', 'animal-management')

    cy.get('#name').type('ぞうぞうまる')
    cy.get('#animal_type').select('ぞう')
    cy.get('#birthday').type('1999-01-01')
    cy.get('#feeding_fee').click()
    cy.get('#gender').select('メス')
    cy.get('#feeding_fee').type('1000')

    cy.get('#register').contains('登録').click()
  })
})