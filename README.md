This project was homework.

### Installation
Install the library and start.

```sh
$ git clone https://github.com/mukireus/RandomLibrary.git
- open with Java IDE
- create new class
RastgeleKarakter random = new RastgeleKarakter();
```
For use of functions...
**Random()**
This function generates a random letter.
```
random.Random();
```
**Random(int)**
This function produces the desired number of random letters.
```
random.Random(3);
```
**Random(int,int)**
This function returns one letter from the desired letters.
```
random.Random('a','k');
```
**Random(int,int,int)**
This function returns one letter from the desired letters.
```
random.Random('a','k',2);
```
**specifiedRandom(...)**
This function is variadic function. Returns a letter from the letters sent as parameters.
```
random.specifiedRandom('g','y','u','c','n','e');
```
**specifiedBetweenRandom(int, ...)**
This function is variadic function. Returns a letter from the letters sent as parameters.
```
random.specifiedBetweenRandom(6, 'g','y','u','c','n','e');
```
**Sentence(int)**
This function returns up to int random letter. Sentence...
```
random.Sentence(100);
```
![run:](https://github.com/mukireus/RandomLibrary/blob/master/run.png)


### Updates
**28 Nisan 2019**
* Added Project Files.
