
default: build

.PHONY: build
build: Stack.java PhoneNumber.java
	@javac PhoneNumber.java
	@javac Stack.java

.PHONY: run
run: build
	@java PhoneNumber
	@java Stack 1 2 3 4 5

.PHONY: clean
clean:
	@rm -f *.class
