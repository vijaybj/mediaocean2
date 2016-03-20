
Build Instructions:
1. Checkout the project
2. ShoppingCart is the root folder for the project.
3. run "mvn test" command from this folder to execute the test case. There is only one test case.
4. run "mvn package" command which will create an executable jar in target folder.
5. 



 

3. I have used the Visitor pattern to implement the solution to the problem #1.
4. Scanner is the Visitor and Products are Visitables.
5. Products are of type CategoryAProduct, CategoryBProduct and CategoryCProduct.
6. Product has an accept method which in turns calls the scan method of the scanner passing itself as an argument.
7. Levy is Category specific and so is the total price of the product.
