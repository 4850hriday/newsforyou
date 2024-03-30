# Spring Boot + JSoup + ROME
## Web scraper and RSS feed generator
Spring Boot based example application for website scraping and RSS feed generation.


## Technologies

+ Spring Boot
+ Gradle
+ JSoup
+ ROME
+ Lombok
+ PostgreSQL

## Configuration

+ Create PostgreSQL database and configure connection in **application.properties**
+ Build with Gradle

    `./gradlew build`


## Endpoints

+ **GET /scrap** – Scrap all websites on demand

+ **GET /rss** – Get general RSS feed

+ **GET /rss/<TARGET_WEBSITE_ID>** – Get RSS feed for specific website


## More information

+ Blog post: [Web scraper and RSS feed generator with Spring Boot](https://blog.mestwin.net/web-scraper-and-rss-feed-generator-with-spring-boot/)


***** Run below SQL Queries after starting the application***************


INSERT INTO public.user_details
(id, created_at, email, "password", user_name)
VALUES(24, NULL, 'hirday.tripathi@gmail.com', '123456', 'hirday tripathi');


INSERT INTO public.parse_entry_rule
(id, "content", link, news_container, title)
VALUES(1, 'description', 'link', 'item', 'title');

INSERT INTO public.target_website
(id, url, parse_entry_rule_id, category)
VALUES(2, 'https://timesofindia.indiatimes.com/rssfeeds/1898055.cms', 1, 'Business');



***********Run webscrapper Api to generate RSS Feeds*****************


curl -X GET "http://localhost:8080/website/scrap" -H "accept: */*"



**************Swagger url***********************

http://localhost:8080/swagger-ui.html