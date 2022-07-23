Passwords Exercise
=====================

Set up:
============
Checkout the passwords tag and create a new branch.

    git checkout -b passwords-exercise passwords

We'll use the BCrypt algorithm to hash passwords. We can find an implementation of bcrypt through this library:

    <!-- https://mvnrepository.com/artifact/org.mindrot/jbcrypt -->
    <dependency>
        <groupId>org.mindrot</groupId>
        <artifactId>jbcrypt</artifactId>
        <version>0.4</version>
    </dependency>

Input above code into your maven "pom.xml" file

TIPS
=======
Servlets used. 

    LoginServlet
    RegisterServlet
    CreateAdServlet


TODO:
===========
1. Make sure passwords are being hashed before they enter the database
2. Change your login logic to check against users' hashed passwords
3. Don't allow ad creation unless a user is logged in
4. When a new ad is created, assign the user id of the logged in user to the ad


Test/Demo
===========



Walk-through Notes
========
Q.1-2
1. user bcrypt
2. loginservlet => validAttempt
3. Test
4. /register
5. Fill out form
6. verify hash password in database => users table
7. logout if logged in and test a plain text password

Q.3
1. CreateServlet, doGet, httpsession, user

Q.4
1. CreateAdServlet, doPost
2. restart server
3. try to create "/create"
4. create ad
5. verify ad in the database ads table
6. 