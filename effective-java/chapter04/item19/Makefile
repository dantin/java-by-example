
default: build

build: Sub.java Super.java
	@javac Sub.java

.PHONY: run
run: build
	@java Sub

.PHONY: clean
clean:
	@rm -f *.class
