
default: build

build: InstrumentedHashSet.java InstrumentedSet.java
	@javac InstrumentedHashSet.java InstrumentedSet.java

.PHONY: run
run: build
	@echo "inappropriate use of inheritance"
	@java InstrumentedHashSet
	@echo "use composition instead of inheritance"
	@java InstrumentedSet

.PHONY: clean
clean:
	@rm -f *.class
