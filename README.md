# Online-Library
This is an Java progamme created by me when i was learning java and this can act as an actual libary.
Prerequisites
Node 16+
Java 17+
Create schema with name of 'librarymanagement' in MySql
Service
update username and password value of 'spring.datasource.username' and 'spring.datasource.password' in the application-dev.properties
cd services
mvn spring-boot: run
Data will load from books-lite.csv in the resources folder.
For full data change file name to book.csv in the InitialLoad. This can take around 30 minutes.
Front end
cd FrontEnd
npm install
npm run start
