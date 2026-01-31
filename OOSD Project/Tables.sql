CREATE TABLE users (
    userID INT PRIMARY KEY,
    userName VARCHAR(30),
    email VARCHAR(50),
    password VARCHAR(255),
    loyaltyPoints INT,
    notUser TINYINT
);
CREATE TABLE movie (
    movieID INT PRIMARY KEY,
    title VARCHAR(50),
    genre VARCHAR(30),
    duration INT,
    description VARCHAR(255)
);
CREATE TABLE screening (
    screeningID INT PRIMARY KEY,
    movieID INT,
    startTime DATETIME,
    FOREIGN KEY (movieID) REFERENCES movie(movieID)
);
CREATE TABLE seat (
    seatID INT PRIMARY KEY,
    screeningID INT,
    isAvailable TINYINT,
    FOREIGN KEY (screeningID) REFERENCES screening(screeningID)
);
CREATE TABLE ticket (
    ticketID INT PRIMARY KEY,
    screeningID INT,
    userID INT,
    seatID INT,
    price DECIMAL(10,2),
    FOREIGN KEY (screeningID) REFERENCES screening(screeningID),
    FOREIGN KEY (userID) REFERENCES users(userID),
    FOREIGN KEY (seatID) REFERENCES seat(seatID)
);
CREATE TABLE purchase (
    purchaseID INT PRIMARY KEY,
    userID INT,
    totalPrice DECIMAL(10,2),
    purchaseDate DATETIME,
    FOREIGN KEY (userID) REFERENCES users(userID)
);
CREATE TABLE review (
    reviewID INT PRIMARY KEY,
    userID INT,
    movieID INT,
    rating INT,
    comment VARCHAR(255),
    reviewDate DATETIME,
    FOREIGN KEY (userID) REFERENCES users(userID),
    FOREIGN KEY (movieID) REFERENCES movie(movieID)
);
CREATE TABLE customerService (
    supportID INT PRIMARY KEY,
    userID INT,
    status TINYINT,
    created DATETIME,
    FOREIGN KEY (userID) REFERENCES users(userID)
);