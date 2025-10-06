
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Architecture summary;

The Java Capstone Project application is the creation of a clinical/healthcare management system. 
The technologies used are as follows:

Back-End: Java with Spring Boot;
Front-End: HTML, CSS, and JavaScript;
Databases: MySQL and MongoDB;

The simplified architecture of the project looks like this:

1) Presentation Layer – The user interface, consisting of Thymeleaf templates and REST API consumers;
2) Application Layer – The Spring Boot backend that contains the controllers, services, and business logic;
3) Data Layer – The databases: MySQL for structured data and MongoDB for flexible, document-based data;

The main considerations when designing the structure are scalability, sustainability, and flexibility. 
The three layers listed above can be developed, tested, and scaled independently of each other, 
which is extremely important.

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Numbered flow of data and control;

1) The user accesses AdminDashboard/DoctorDashboard or Appointment pages;
2) The user request is routed to the appropriate Thymeleaf or REST controller;
3) The controller calls the service layer, which applies business rules and coordinates workflows among other tasks;
4) The service layer depending on the request and thus the user type, uses the appropriate MySQL or MongoDB repositories;
5) These repositories accesses the appropriate MySQL or MongoDB databases in the database layer;
6) MySQL data is converted into JPA entities, while MongoDB data is loaded into document objects;
7) The response layer: in MVC flows, models are passed from the controller to Thymeleaf templates, but in REST flows, the same models are serialized into JSON;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

