
Build Instructions:

1. Checkout the project
2. ShoppingCart is the root folder for the project.
3. run "mvn test" command from this folder to execute the test case. There is only one test case.
4. run "mvn package" command which will create an executable jar in target folder.
5. run "java -jar target/shopping-cart-1.0-SNAPSHOT-jar-with-dependencies.jar" to execute the application.
6. Result will be itemized bill with cost and levy for each item. Also total for these is printed at the end.



 
Approach to the solution:

1. I have used the Visitor pattern to implement the solution to the problem #1.
2. Scanner is the Visitor and Products are Visitables.
3. Products are of type CategoryAProduct, CategoryBProduct and CategoryCProduct.
4. Product has an accept method which in turns calls the scan method of the scanner passing itself as an argument.
5. Levy is Category specific and so is the total price of the product.
6. We have to add products to ShoppingCart and when called checkout() will print the itemised Bill with respective totals.
