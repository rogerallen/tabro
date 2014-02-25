# tabro

Guitar Tabulature Rotate Libary

I wrote this to use as a basis for getting guitar tabs to play in
Overtone.  After coding it up, I'm not sure it is all that useful, but
maybe it will be someday.

Turns this

```
  Gtr I - Intro
|------------------|------------------|
|---9-----10-----7-|-----9-----10---7-|
|---9------9-----8-|-----9------9---8-|
|---9------9-----9-|-----9------9---9-|
|-----7-7----7-7---|-7-7---7-7----7---|
|------------------|------------------|

  Rock on.
|-------------------|
|-----7-----8-----5-|
|-----7-----7-----6-|
|-----7-----7-----7-|
|-7s5---5-5---5-5---|
|-------------------|
```

into this

```
||||||
------
------G
------t
--999-r
------
-7----I
------
-7-----
------
----1-I
--990-n
------t
-7----r
------o
-7----
------
--987-
------
||||||
------
-7----
------
-7----
------
--999-
------
-7----
------
-7----
------
----1-
--990-
------
-7----
------
--987-
------
||||||
||||||
------
-7----R
-s----o
-5----c
------k
--777-
------o
-5----n
------.
-5----
------
--778-
------
-5----
------
-5----
------
--765-
------
||||||
```

## Installation

git clone this repo

## Usage

`lein run test.txt`

Will parse test.txt file and try to find the guitar tab notation and
output the file rotated for further processing.

The source contains routines useful to this manipulation
and may provide some further help in manipulating this
data for your own use.

The code makes 2 assumptions about tab files:

1. The guitar tabulature notation will be a series of lines all
starting with the '|' character.

2. There will be a blank line after the last string in the guitar
tabulature notation.

I believe most tab text files match up with these assumptions, but tab
files are free-form.  You may need to edit the text file a bit.

## License

Copyright © 2014 Roger Allen

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
