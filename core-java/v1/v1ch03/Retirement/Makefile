BIN := Retirement Retirement2

.PHONY: clean

default: build

build: Retirement.class Retirement2.class

Retirement.class: Retirement.java
	javac Retirement.java

Retirement2.class: Retirement2.java
	javac Retirement2.java

clean:
	rm -rf *~ *.class

run: build
	java Retirement  < data/input
	java Retirement2 < data/input2
