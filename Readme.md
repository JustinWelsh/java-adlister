JDBC Exercise
=====================
Checkout the jdbc tag in your repository and create a new branch.
=====================
    git checkout jdbc
    git checkout -b jdbc-exercise

You'll notice we've added several things
=====================
-an insert method on the Ads interface and implementation in the ListAdsDao class
-a form for creating an ad that is visible at /ads/create
(When the form is submitted, a new ad is created)
-a servlet that displays this form, and creates new ads from a post request

Create a database for our application
=====================

1.Create a new database adlister_db and user that only has permissions on that database

    CREATE DATABASE adlister_db;
    CREATE USER 'justin'@'localhost' IDENTIFIED BY 'welsh33';
    GRANT SELECT ON adlister_db.* TO 'justin'@'localhost';

2. Create a migration script for two tables, users, and ads. They should have the following structure:


+----------+             +-------------+
|  users   |             |    ads      |
+----------+             +-------------+
| id       |<------,     | id          |
| username |       `-----| user_id     | <-- foreign key to users table
| email    |             | title       |
| password |             | description |
+----------+             +-------------+

Swap out the Ads implementation
=====================

1. Add Config.java to the .gitignore

2. Create a class named Config.java that will hold our database configuration This class should have three public methods, getUrl, getUsername, and getPassword, all of which should return strings for those properties.

3. Create a class named MySQLAdsDao that implements the Ads interface
    -This class should have a private instance property named connection of type Connection that is initialized in the constructor. Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials.
    -Implement the methods in the Ads interface
    -Your methods should retrieve ads from the database and insert new ads into the database

The connection object will be created just once, in this class' constructor, and the individual methods that query the database should use the connection object to create statements.

4. In the DaoFactory class, switch out the ListAdsDao for your MySQLAdsDao
    -You should have to make little, if any, changes to the existing code
    -When you create an instance of MySQLAdsDao, create an instance of your Config class to pass to the MySQLAdsDao constructor
    -Verify that your application still functions as before, but that now information is being pulled from and saved to your database

In order to test the above functionality, you will need to make a couple changes to your application. We defined a one to many relationship between ads and users, so in order to create an ad, we will need to tie it to an existing user record. For now, manually insert a record into the users table and note the id of the newly created record. In your controller, when an ad is being created, hardcode this id into the ad.