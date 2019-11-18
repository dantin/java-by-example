
default: build

.PHONY: build
build: NutritionFacts.java
	@javac NutritionFacts.java

.PHONY: run
run: build
	@echo "JavaBeans Pattern"
	@java NutritionFacts
	@echo "  allows inconsistency, mandates mutability"

.PHONY: clean
clean:
	@rm -f *.class
