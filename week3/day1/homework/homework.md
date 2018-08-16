# SQL Homework

The GFT is having a Marvel Movie Marathon! They have asked you to help maintain their database of movies with times and attendees.

## To access the database:

First, create a database called 'marvel'

```
# terminal
createdb marvel
```

Next, run the provided SQL script to populate your database:

```
# terminal
psql -d marvel -f marvel.sql
```

Use the supplied data as the source of data to answer the questions.  Copy the SQL command you have used to get the answer, and paste it below the question, along with the result they gave.

## Questions

1. Return ALL the data in the 'movies' table.

SELECT * FROM Movies;

1 | Iron Man                            | 2008 | 23:00
2 | The Incredible Hulk                 | 2008 | 18:05
3 | Iron Man 2                          | 2010 | 21:25
4 | Thor                                | 2011 | 14:40
5 | Captain America: The First Avenger  | 2011 | 13:25
6 | Avengers Assemble                   | 2012 | 22:45
7 | Iron Man 3                          | 2013 | 19:00
8 | Thor: The Dark World                | 2013 | 19:50
9 | Batman Begins                       | 2005 | 13:45
10 | Captain America: The Winter Soldier | 2014 | 16:00
11 | Guardians of the Galaxy             | 2014 | 16:50
12 | Avengers: Age of Ultron             | 2015 | 23:55
13 | Ant-Man                             | 2015 | 18:40
14 | Captain America: Civil War          | 2016 | 16:15
15 | Doctor Strange                      | 2016 | 12:20
16 | Guardians of the Galaxy 2           | 2017 | 22:25
17 | Spider-Man: Homecoming              | 2017 | 22:25
18 | Thor: Ragnarok                      | 2017 | 16:30
19 | Black Panther                       | 2018 | 15:00

2. Return ONLY the name column from the 'people' table

SELECT name FROM people;

name          
-----------------------
Angelina Blyth
Steven Bonner
Matthew Bryce
Stephan Constantial
Roddy Daly
Adri Forczek
David Fulton
Derek Leach
Craig McDowall
Tara McKeaney
Cambel Millar
Farheen Mulla
Jack Murning
Richard Phillips-Kerr
Joe Pollock
Alan Russell
Greg Rutherford
Harjit Singh
Debi Skea
Cleyra Uzcategui
Peter Whittle
(21 rows)




3. Oh bother! Someone at CodeClan spelled Campbell's name wrong! Change it to reflect the proper spelling (change 'Cambel Millar' to 'Campbell Miller').

UPDATE people SET name = 'Campbell Millar' WHERE name = 'Cambel Millar';

name         
-----------------------
Angelina Blyth
Steven Bonner
Matthew Bryce
Stephan Constantial
Roddy Daly
Adri Forczek
David Fulton
Derek Leach
Craig McDowall
Tara McKeaney
Farheen Mulla
Jack Murning
Richard Phillips-Kerr
Joe Pollock
Alan Russell
Greg Rutherford
Harjit Singh
Debi Skea
Cleyra Uzcategui
Peter Whittle
Campbell Millar
(21 rows)


4. Return ONLY your name from the 'people' table.

SELECT name FROM people WHERE name = 'Peter Whittle';

name      
---------------
Peter Whittle
(1 row)


5. The cinema is showing 'Batman Begins', but Batman is DC, not Marvel! Delete the entry from the 'movies' table.

DELETE FROM movies WHERE title = 'Batman Begins';

id |                title                | year | show_time
----+-------------------------------------+------+-----------
 1 | Iron Man                            | 2008 | 23:00
 2 | The Incredible Hulk                 | 2008 | 18:05
 3 | Iron Man 2                          | 2010 | 21:25
 4 | Thor                                | 2011 | 14:40
 5 | Captain America: The First Avenger  | 2011 | 13:25
 6 | Avengers Assemble                   | 2012 | 22:45
 7 | Iron Man 3                          | 2013 | 19:00
 8 | Thor: The Dark World                | 2013 | 19:50
10 | Captain America: The Winter Soldier | 2014 | 16:00
11 | Guardians of the Galaxy             | 2014 | 16:50
12 | Avengers: Age of Ultron             | 2015 | 23:55
13 | Ant-Man                             | 2015 | 18:40
14 | Captain America: Civil War          | 2016 | 16:15
15 | Doctor Strange                      | 2016 | 12:20
16 | Guardians of the Galaxy 2           | 2017 | 22:25
17 | Spider-Man: Homecoming              | 2017 | 22:25
18 | Thor: Ragnarok                      | 2017 | 16:30
19 | Black Panther                       | 2018 | 15:00
(18 rows)


6. Create a new entry in the 'people' table with the name of one of the instructors.

INSERT INTO people (name) VALUES ('John McCollum');

id |         name          
----+-----------------------
 1 | Angelina Blyth
 2 | Steven Bonner
 3 | Matthew Bryce
 4 | Stephan Constantial
 5 | Roddy Daly
 6 | Adri Forczek
 7 | David Fulton
 8 | Derek Leach
 9 | Craig McDowall
10 | Tara McKeaney
12 | Farheen Mulla
13 | Jack Murning
14 | Richard Phillips-Kerr
15 | Joe Pollock
16 | Alan Russell
17 | Greg Rutherford
18 | Harjit Singh
19 | Debi Skea
20 | Cleyra Uzcategui
21 | Peter Whittle
11 | Campbell Millar
22 | John McCollum
(22 rows)

7. Oh no! Nefarious G5 instructor Alan Russell has decided to hijack our movie evening! Remove him from the table of people.

DELETE FROM people WHERE name ='Alan Russell';

id |         name          
----+-----------------------
 1 | Angelina Blyth
 2 | Steven Bonner
 3 | Matthew Bryce
 4 | Stephan Constantial
 5 | Roddy Daly
 6 | Adri Forczek
 7 | David Fulton
 8 | Derek Leach
 9 | Craig McDowall
10 | Tara McKeaney
12 | Farheen Mulla
13 | Jack Murning
14 | Richard Phillips-Kerr
15 | Joe Pollock
17 | Greg Rutherford
18 | Harjit Singh
19 | Debi Skea
20 | Cleyra Uzcategui
21 | Peter Whittle
11 | Campbell Millar
22 | John McCollum
(21 rows)

8. The cinema has just heard that they will be holding an exclusive midnight showing of 'Avengers: Infinity War'!! Create a new entry in the 'movies' table to reflect this.

INSERT INTO movies (title, year, show_time) VALUES ('Avengers: Infinity War', 2018, '00:00');

id |                title                | year | show_time
----+-------------------------------------+------+-----------
 1 | Iron Man                            | 2008 | 23:00
 2 | The Incredible Hulk                 | 2008 | 18:05
 3 | Iron Man 2                          | 2010 | 21:25
 4 | Thor                                | 2011 | 14:40
 5 | Captain America: The First Avenger  | 2011 | 13:25
 6 | Avengers Assemble                   | 2012 | 22:45
 7 | Iron Man 3                          | 2013 | 19:00
 8 | Thor: The Dark World                | 2013 | 19:50
10 | Captain America: The Winter Soldier | 2014 | 16:00
11 | Guardians of the Galaxy             | 2014 | 16:50
12 | Avengers: Age of Ultron             | 2015 | 23:55
13 | Ant-Man                             | 2015 | 18:40
14 | Captain America: Civil War          | 2016 | 16:15
15 | Doctor Strange                      | 2016 | 12:20
16 | Guardians of the Galaxy 2           | 2017 | 22:25
17 | Spider-Man: Homecoming              | 2017 | 22:25
18 | Thor: Ragnarok                      | 2017 | 16:30
19 | Black Panther                       | 2018 | 15:00
20 | Avengers: Infinity War              | 2018 | 00:00
(19 rows)

9. The cinema would also like to make the Guardian movies a back-to-back feature. Update the 'Guardians of the Galaxy' show time from 16:50 to 20:00

UPDATE movies SET show_time = '20:00' WHERE title = 'Guardians of the Galaxy';

id |                title                | year | show_time
----+-------------------------------------+------+-----------
 1 | Iron Man                            | 2008 | 23:00
 2 | The Incredible Hulk                 | 2008 | 18:05
 3 | Iron Man 2                          | 2010 | 21:25
 4 | Thor                                | 2011 | 14:40
 5 | Captain America: The First Avenger  | 2011 | 13:25
 6 | Avengers Assemble                   | 2012 | 22:45
 7 | Iron Man 3                          | 2013 | 19:00
 8 | Thor: The Dark World                | 2013 | 19:50
10 | Captain America: The Winter Soldier | 2014 | 16:00
12 | Avengers: Age of Ultron             | 2015 | 23:55
13 | Ant-Man                             | 2015 | 18:40
14 | Captain America: Civil War          | 2016 | 16:15
15 | Doctor Strange                      | 2016 | 12:20
16 | Guardians of the Galaxy 2           | 2017 | 22:25
17 | Spider-Man: Homecoming              | 2017 | 22:25
18 | Thor: Ragnarok                      | 2017 | 16:30
19 | Black Panther                       | 2018 | 15:00
20 | Avengers: Infinity War              | 2018 | 00:00
11 | Guardians of the Galaxy             | 2014 | 20:00
(19 rows)

## Extension

1. Research how to delete multiple entries from your table in a single command.

DELETE FROM movies WHERE id BETWEEN 1 and 3;
DELETE FROM people WHERE name = 'Peter Whittle' OR 'Craig McDowall';
DELETE FROM movies WHERE year < 2010;
DELETE FROM movies WHERE yead <> 2013; <!-- <> means does NOT equal. -->
DELETE FROM movies WHERE title LIKE '%man%'; <!-- -- %% is a wildcard character. This would cause anything which has the phrase 'man' in it to be removed. Note that it is case sensitive. Anything with 'Man' in it would remain. -->
DELETE FROM movies WHERE LOWER(movies.title) LIKE %man%; <!-- This operation would cause the movie titles to be changed to lower case, allowing capitalised entries to also be targetted. -->
DELETE FROM movies WHERE id IN (1,2,4); <!-- Allows us to target specific entries to be deleted. -->



id |                title                | year | show_time
----+-------------------------------------+------+-----------
 4 | Thor                                | 2011 | 14:40
 5 | Captain America: The First Avenger  | 2011 | 13:25
 6 | Avengers Assemble                   | 2012 | 22:45
 7 | Iron Man 3                          | 2013 | 19:00
 8 | Thor: The Dark World                | 2013 | 19:50
10 | Captain America: The Winter Soldier | 2014 | 16:00
12 | Avengers: Age of Ultron             | 2015 | 23:55
13 | Ant-Man                             | 2015 | 18:40
14 | Captain America: Civil War          | 2016 | 16:15
15 | Doctor Strange                      | 2016 | 12:20
16 | Guardians of the Galaxy 2           | 2017 | 22:25
17 | Spider-Man: Homecoming              | 2017 | 22:25
18 | Thor: Ragnarok                      | 2017 | 16:30
19 | Black Panther                       | 2018 | 15:00
20 | Avengers: Infinity War              | 2018 | 00:00
11 | Guardians of the Galaxy             | 2014 | 20:00
(16 rows)
