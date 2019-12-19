CREATE TABLE IF NOT EXISTS animals (
  id VARCHAR(32) NOT NULL,
  name VARCHAR(32) NOT NULL,
  type INT NOT NULL,
  birthday DATE NOT NULL,
  gender VARCHAR(1) NOT NULL,
  feeding_fee INT NOT NULL,
  created_by VARCHAR(32) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_by VARCHAR(32) NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (id)
);