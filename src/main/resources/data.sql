/*
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('hong', 'password');
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('grace', 'grace');
*/
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('hong', '$2a$11$87.xnxkk4vUQdltmjszKuu6yMCrZlth0qQd13rAd/IY2pBNojJbF.');
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('grace', '$2a$11$9qrmZ2cQ8Wp1RlatUC88duZJ2tQgj3JPeRVJTAgq8Z0U22dgYl/6i');

INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('hong', 'USER');
INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('hong', 'ADMIN');
INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('grace', 'USER');