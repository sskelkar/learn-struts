### Struts toy app with unit tests

To run tests: `gradle test`

To deploy on Tomcat:
+ Create the war file: `gradlew clean build`
+ Copy the war into Tomcat webapps folder: `cp build/libs/struts.war $CATALINA_BASE/webapps/`
+ Start tomcat: `catalina run`
+ All together: 
`gradlew clean build && cp build/libs/struts.war $CATALINA_BASE/webapps/ && catalina run`
