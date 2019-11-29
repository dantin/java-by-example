
default: build

.PHONY: build
build: Stack.java PhoneNumber.java
	@javac PhoneNumber.java
	@javac Stack.java

.PHONY: run
run: build
	@java PhoneNumber
	@java Stack 3 1 4 1 5 9 3

.PHONY: clean
clean:
	@rm -f *.class
