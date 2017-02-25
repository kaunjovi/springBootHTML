# springBootHTML
SpringBoot with vanilla HTML. No Thymeleaf. 


# Step by step 
  
  - Create a project in github. Import it in eclipse. Add it to sublime. 
  - Fix .gitignore. sublime is better for this one.   
  - In eclipse, convert the project to a maven project. Add java 8, logback and SpringBoot. Update project. 
  - Add a main class. Boot it up with SpringBoot. 
  - Add application.properties for logback debug to work. 

```
mvn -e clean install spring-boot:run
```
  - Hit the homepage. Nothing will show up in browser. But in command prompt you will get the log of main class. 

```
http://localhost:8080/
```
  - Create a controller file. Map a request. Redirect to a html file. 
  - Create a html file in /resources/static 
  - Hit the homepage again. You should get the html file. 


# eclipse short cuts 

  - command + F6 - toggle. 