INSERT INTO users(username,password,enabled)
  VALUES('anilkumar','Welcome123',true);

INSERT INTO users(username,password,enabled)
  VALUES('anilverma','password123',true);

INSERT INTO authorities(username,authority)
  VALUES('anilkumar','ROLE_USER');

INSERT INTO authorities(username,authority)
  VALUES('anilverma','ROLE_ADMIN');