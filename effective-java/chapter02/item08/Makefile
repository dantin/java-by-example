
default: build

.PHONY: build
build: *.java
	@javac Adult.java
	@javac Teenager.java

.PHONY: run
run: build
	@echo "try-with-resources"
	@java Adult
	@echo "no guarantee"
	@java Teenager

.PHONY: clean
clean:
	@rm -f *.class
