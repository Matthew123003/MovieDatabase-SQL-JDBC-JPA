PART 1
MINI MOVIE DATABASE

Missing this dependency to access the H2 Servlet
        <dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.1</version> <!-- Or any other version compatible with your project -->
		</dependency>

CREATE DATABASE movies;
CREATE TABLE movies (title VARCHAR(255) not null, runtime INTEGER not null, genre VARCHAR(255) not null,
imdb_score DOUBLE not null, rating VARCHAR(255) not null);
INSERT INTO movies VALUES ('Howard The Duck', 100, 'Sci-Fi', 4.6, 'PG');
INSERT INTO movies VALUES ('Lavalantula', 83, 'Horror', 4.7, 'TV-14');
INSERT INTO movies VALUES ('Starship Troopers', 129, 'Sci-Fi', 7.2, 'PG-13');
INSERT INTO movies VALUES ('Waltz With Bashir', 90, 'Documentary', 8.0, 'R');
INSERT INTO movies VALUES ('Spaceballs', 96, 'Comedy', 7.1, 'PG');
INSERT INTO movies VALUES ('Monsters Inc.', 92, 'Animation', 8.1, 'G');


SELECT * FROM movies WHERE genre = 'sci-fi';
SELECT * FROM movies WHERE IMDB Score > 6.5;
SELECT * FROM movies WHERE Rating = 'G' OR 'PG' AND runtime < 100;
SELECT genre, AVG(runtime) AS average_runtime FROM movies WHERE rating < 7.5 GROUP BY genre;
UPDATE movies SET rating = 'R' WHERE title = 'Starship Troopers';
SELECT id, title, rating FROM movies WHERE genre IN ('Horror', 'Documentary');
SELECT rating, AVG(imdb_score) AS average_score, MAX(imdb_score) AS maximum_score, MIN(imdb_score) AS minimum_score
FROM movies GROUP BY rating;
SELECT rating, AVG(imdb_score) AS average_score, MAX(imdb_score) AS maximum_score, MIN(imdb_score) AS minimum_score
FROM movies GROUP BY rating HAVING COUNT(*) > 1;
DELETE FROM movies WHERE rating = 'R';

PART 2
