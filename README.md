# movie-booking-system

This project implements a core feature of a Movie Booking Platform using Spring Boot:
Show discovery for users and show management for theatre partners.

**Use Cases Implemented**********
1️⃣ Browse Theatres Running a Movie
End users can:
Select a movie
Choose a city/town
Pick a date
View all theatres currently running that movie with show timings

2️⃣ Theatre Partner – Show Management
Theatre partners can:
Create shows for the day
Update existing shows
Delete shows when needed

**Tech Stack**
-Java 17
-Spring Boot
-REST APIs
-In-memory data store (HashMap)
-Maven


**API Endpoints**
🔍 Browse Shows (User Flow)
GET
/shows/browse

Query Params
Movie 
City / Town
Show date (YYYY-MM-DD)

Example
curl --location "http://localhost:8080/shows/browse?movieId=M1&town=Bangalore&date=2026-02-15"

Sample Response
[
  {
    "showId": "S1",
    "movieId": "M1",
    "theatreId": "T1",
    "theatreName": "PVR Forum",
    "town": "Bangalore",
    "showDate": "2026-02-15",
    "showTime": "18:30"
  }
]

➕ Create Show (Theatre Partner)
POST
/shows

curl --location "http://localhost:8080/shows" \
--header "Content-Type: application/json" \
--data '{
  "showId": "S1",
  "movieId": "M1",
  "theatreId": "T1",
  "theatreName": "PVR Forum",
  "town": "Bangalore",
  "showDate": "2026-02-15",
  "showTime": "18:30"
}'

✏️ Update Show
PUT
/shows/{showId}

curl --location --request PUT "http://localhost:8080/shows/S1" \
--header "Content-Type: application/json" \
--data '{
  "movieId": "M1",
  "theatreId": "T1",
  "theatreName": "PVR Forum Mall",
  "town": "Bangalore",
  "showDate": "2026-02-15",
  "showTime": "21:00"
}'

❌ Delete Show
DELETE
/shows/{showId}

curl --location --request DELETE "http://localhost:8080/shows/S1"


 **How to Run**
mvn clean install
mvn spring-boot:run
-**Server starts at:******
http://localhost:8080
