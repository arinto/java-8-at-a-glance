java-8-at-a-glance
------------------

This small project contains lambda expresions and interface evolution examples on [What's New on JavaSE 8](http://www.slideshare.net/chukmunnlee/nus-hackers-club-mar-21-whats-new-in-javase-8) presented by Chuk Lee during [NUS Hackers meetup, 21 March 2014](http://nushackers.org/2014/03/friday-hacks-67-march-21/).
<!---([summary](http://www.otnira.com)) -->

Requirements
------------

1. Java 8
2. Maven 3.0.5

Use Maven to compile the sources, i.e. `mvn clean compile`.

Running
-------

There are several main classes:

1. `com.otnira.evolution.main.BasicMain`: main class that only uses the original method of `Awesome` interface, which is `sayHello`. This class does not have any argument.
2. `c.o.e.m.InterfaceEvolutionMain`: main class that uses the method from evolution of `Awesome` interface, which is `eat`. This class does not have any argument.
3. `c.o.lambda.main.GetMaxRandom`: main class that randomly generates collection of students and finds the maximum of the grade for student in specific year using sequential and parallel stream. This class has two optional arguments:
  * year: year/batch that we are interested to find the maximum
  * number of students per year/batch: self-explained
4. `c.o.l.m.GetMaxNotRandom`: main class that generates collection of students deterministically and finds the maximum grade of the specified batch. This class has one optional argument:
  * year: year/batch that we are interested to find the maximum

Use `java` to execute the main classes, example

```java -CP $CLASSPATH com.otnira.evolution.main.BasicMain```

License
-------

The MIT License (MIT)

Copyright (c) 2014 Arinto Murdopo
