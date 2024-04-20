PART 1
MINI MOVIE DATABASE

SELECT * FROM movies WHERE genre = 'sci-fi';
SELECT * FROM movies WHERE IMDB Score > 6.5;
SELECT * FROM movies WHERE Rating = 'G' OR 'PG' AND runtime < 100;
SELECT genre, AVG(runtime) AS average_runtime FROM movies WHERE rating < 7.5 GROUP BY genre;
UPDATE movies SET rating = 'R' WHERE title = 'Starship Troopers';
SELECT id, title, rating FROM movies WHERE genre IN ('Horror', 'Documentary');
SELECT rating, AVG(IMDB Score) AS average_score, MAX(IMDB Score) AS maximum_score, MIN(IMDB Score) AS minimum_score
FROM movies GROUP BY rating;
SELECT rating, AVG(IMDB Score) AS average_score, MAX(IMDB Score) AS maximum_score, MIN(IMDB Score) AS minimum_score
FROM movies GROUP BY rating HAVING COUNT(*) > 1;
DELETE FROM movies WHERE rating = 'R';

PART 2
