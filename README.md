Bookstore.com

•	Due to my final week in Codelex courses, and other required assignments, unfortunately I was short on time to create user interface for this application. The functionality still is testable with steps described below. Steps for creating user interface would be – 
1.	I would use React for creating user form for book title and authors name input; 
2.	Providing already added book would result in user understandable error log;
3.	Create link tag, that would direct user to book list page, with options to navigate through pages;

•	The main components of the application are – 
1.	Book class (specifying Book object properties);
2.	Controller class (allowing to access defined end points using browser, or API development tool such as Postman);
3.	Service class (performs business logic for application functionality);
4.	Repository class (storing saved data to database, for example PostgreSQL);

•	The application is built using Spring Boot framework for its inbuilt options for accessing API and connecting database, utilizing necessary dependencies. 

•	Meeting the requirement of a main page load time not exceeding 2 seconds could be challenging, especially if the application is dealing with a large number of book records. The requirement to support 10 parallel user sessions per second could lead to performance issues, especially during peak hours. Ensuring that the application is scalable and can handle the expected load is crucial.

•	To successfully deploy application, please check that Your system has - 
1.	Installed Java, to perform .jar file execution;
2.	Installed API development tool such as Postman, to send requests to specific application endpoints;
3.	Installed Docker, to use PosgreSQL database; 

•	Steps for starting the application – 
1.	Open Docker application;
2.	Using terminal run - docker pull postgres;
3.	In terminal -  docker run --name postgres-container -e POSTGRES_PASSWORD=docker -p 5432:5432 -d postgres
4.	Navigate to release-v.1.0.jar file location using terminal;
5.	Run java -jar release-v.1.0.jar command in terminal;
6.	Open Postman, create several PUT requests using http://localhost:8080/admin/addBook in body providing JSON type data, like – 
{
  	  "title": "Fourth Wing",
 	   "author": "Rebecca Yarros"
}
to save several books;
•	Create GET request using http://localhost:8080/admin/books/?page= adding desired page number value after the = character to view saved books by most recently added and having 50 books per page; Adding the same book twice results in Status 409 - CONFLICT error. 
