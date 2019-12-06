.PHONY: run

default: build

build: InstrumentedHashSet.java InstrumentedSet.java
	javac InstrumentedHashSet.java InstrumentedSet.java

run: build
	java InstrumentedHashSet
	java InstrumentedSet

clean:
	rm -f *.class
