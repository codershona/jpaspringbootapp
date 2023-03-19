# JPA, Hibernate and Spring Boot:

## Building a simple JPA Apps using Modern Spring Boot Approach.
## Hands on with JPA, Hibernate and Spring boot

 * Why JPA? Why Hibernate? (JPA vs Hibernate)
 * Why SPing Boot and Spring Boot Data JPA?
 
### Approach:

* Create a Spring boot Project with H2.
* Create COURSE table.
* Use Spring JDBC to play with COURSE table.
* Use JPA and Hibernate to play with COURSE table.
* Use Spring Data JPA to play with COURSE table.

* Dependency we add in Spring Initializr project setup:
  * Spring web;
  * Spring data JDBC;
  * Spring Data JPA;
  * H2 Database;

* Launching up H2 Console and Creating Course Table in H2

* Go to browser : ```http://localhost:8080/h2-console/```


### JDBC to Spring JDBC to JPA to SPring DAta JPA:

* Go to h2 console and check the SQL table:

```
   insert into course (id, name, author)
   values(1, 'Learn AWS','myjavajpatask')

   select * from course
   
   delete from course where id=1


```

* Run or click Run selected by selecting delete or select line in the table.


### JDBC:

 * Write a lot of SQL queries!(delete from todo where id=?)
 * And write a lot of JAva Code.

### Spring JDBC:  

  * Write a lot of SQL queries(delete from todo where id=?)
  * BUT lesser Java Code
  
### JDBC to Spring JDBC code example:

```
    public void deleteTodo(int id) {
     PreparedStatement st = null;
     try {
      st = db.conn.prepareStatement("delete from todo where id=?");
      st.setInt(1, id);
      st.execute();
     } catch (SQLException e) {
       logger.fatal("Query Failed : ", e);
     } finally {
     if (st != null) {
       try {st.close();}
       catch(SQLException e) {}
       }
     }
    }

```


```
   public void deleteTodo(int id) {
     jdbcTemplate.update("delete from todo where id=?", id);
   }
```







#  Project: RESTFUL WEB SERVICES with Spring Boot:

* <b> 1: Build Simple Hello World REST API</b>
   * Understand the magic of spring boot
   * Understand fundamentals of building REST API with Spring Boot.
       * @RestController,
       * @RequestMapping,
       * @PathVariable,
       * JSON conversion
       
* <b> 2: Build REST API for a Social Media Application:</b>
   * Design and Build a Great REST API:
      * Choosing the right URI for resources(/users, /users/{id}/posts)
      * Choosing the right request method for actions (GET, POST, PUT, DELETE, ...)
      * Designing Request and Response structures
      * Implementing Security, Validation and Exception Handling
   
   * <b>Build Advanced REST API Features:</b>
      * Internationalization, HATEOAS, Versioning, Documentation, Content Negotiation, ...
   
   * <b>Connect your REST API to a Database:</b>
      * Fundamentals of JPA and Hibernate;
      * Use H2 and MYSQL as Databases.
   













