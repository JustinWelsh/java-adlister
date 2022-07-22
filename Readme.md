User Input Exercise
===================
Check out the   user-input   tag and create a new branch.


    git checkout -b user-input-exercise user-input

Our project was starting to get pretty messy, so we broke it up into separate packages. Take a look around and familiarize yourself with the new structure.

-----------------------------------------------------
    Make sure to move the Config class into the dao packaged.

Update mysql dependency in the pom.xml file 

    "<version>8.0.23</version>"

EXERCISE:
==============
1. Refactor to use prepared statements.
    Refactor your   MySQLAdsDao   to use prepared statements. Test these changes and ensure everything still works.

2. Create an implementation for the   Users   interface.
    Create a class named   MySQLUsersDao   that implements   Users  . Add functionality to the   DaoFactory   class to return an instance of the users data access object.

3. Allow users to create an account in your application.
    -Create a form for users registration named   register.jsp.
    -Create a servlet named   RegisterServlet   and write the necessary logic.
    Make your login servlet actually log in users from your database

4. There are some comments marked TODO inside the LoginServlet to help you get started.

5. Don't allow raw user input in your HTML pages. Escape anything that is coming from our users.

Testing/Demo
=====================
1. Run the program
2. In the url add the "/register" to utilize the RegisterServlet.
   1. Fill out register form.
3. Verify entry to the database by:
   1. Going to the adlister_db
   2. Double click the "users" table.
4. If successful, try logging in by using previous entries.
5. If successful, you should see that you are greeted with a "Welcome, user!" message and see that the url change to indicate that you are in the profile page i.e "/profile".

