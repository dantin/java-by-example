
default: build

.PHONY: build
build: RomanNumerals.java Sum.java
	@javac RomanNumerals.java
	@javac Sum.java

.PHONY: run
run: build
	@echo "Default object"
	@java RomanNumerals 10 10 false
	@echo "Reuse object"
	@java RomanNumerals 10 10 true
	@echo
	@echo "With Autoboxing"
	@java Sum 2 false
	@echo "Without Autoboxing"
	@java Sum 2 true

.PHONY: clean
clean:
	@rm -f *.class
