Exercise
===================================================================

    Create a branch named "servlets-with-jsps" off of the
    "jsp-and-jstl-solution" tag and add the needed controller
    and view logic to do the following:

PIZZA ORDER FORM: 
------------------------------------------------------------------
A user goes to /pizza-order and sees a pizza order form. This form features choices to select the crust type, sauce type, size type (use select inputs), toppings (checkboxes), and delivery address (text input). Use System.out.println to output the values submitted by the user.

    -use a POST request on the form
    -use one JSP and one servlet
    -don't worry about styling

COLOR PAGE:
------------------------------------------------------------------
A user goes to /pickcolor and sees a page where they are prompted to enter their favorite color (using a text input). Upon clicking submit, they are redirected to /viewcolor and see a page with a background color of the submitted color.

    -use a POST request on the form
    -use two JSPs and two servlets
    -use style tags to set the background color on the HTML body
    -pass the data from one servlet to another by adding the color value in a query string

GUESSING GAME:
------------------------------------------------------------------
A user goes to /guess and is prompted to guess a number between 1 and 3. If correct, the user will be redirected to /correct or /incorrect, depending on if they guess correctly. In either case, the user will see the same view but with an outcome-specific message in a heading (e.g. "You Won!" or "You Lose!").

    -use a POST request on the form
    -use two JSPs (one for guessing and another to view the outcome)
    -use three servlets:
        a. one servlet for sending the guess view and processing the guess
        b. another servlet for serving up the outcome JSP with a win message
        c. another servlet for serving up the outcome JSP with a loss message

Bonus: If a user submits a number other than 1, 2, or 3, redirect them back to the guessing form.