.PHONY: run

default: build

build: IntArrays.java AbstractMapEntry.java
	javac IntArrays.java
	javac AbstractMapEntry.java

run: build
	java IntArrays

clean:
	rm -f *.class
