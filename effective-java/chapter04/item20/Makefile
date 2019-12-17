
default: build

build: IntArrays.java AbstractMapEntry.java
	@javac IntArrays.java
	@javac AbstractMapEntry.java

.PHONY: run
run: build
	@java IntArrays

.PHONY: clean
clean:
	@rm -f *.class
