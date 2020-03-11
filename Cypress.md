### Cypress

#### cypress install

```sh
$ mkdir e2e
$ cd e2e
$ npm install --save-dev cypress
```

#### package.jsonにscripts設定
```json
...
"scripts": {
  "cy:open": "cypress open",
  "cy:run": "cypress run"
},
...
```

#### GUI OPEN
- cypressのディレクトリが構築される
```sh
$ npm run cy:open 
```

