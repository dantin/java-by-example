
default: build

.PHONY: build
build: *.java
	@javac PizzaMain.java

.PHONY: run
run: build
	@java PizzaMain

.PHONY: clean
clean:
	@rm -f *.class
