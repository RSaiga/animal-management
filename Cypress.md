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
- cypressの最初のdry runを行い、Cypressのフォルダ構造を準備
```sh
$ npm run cy:open 
```

