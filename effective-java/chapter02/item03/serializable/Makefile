
default: build

.PHONY: build
build: Elvis.java
	@javac Elvis.java

.PHONY: run
run: build
	@java Elvis

.PHONY: clean
clean:
	@rm -f *.class
