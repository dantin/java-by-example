.PHONY: clean

default: build

build: Welcome.class

Welcome.class: Welcome.java
	javac Welcome.java

clean:
	rm -rf *~ *.class

run: build
	java Welcome
