default: build

.PHONY: build
build: NutritionFacts.java
	@javac NutritionFacts.java

.PHONY: run
run: build
	@echo "Telescoping constructor pattern"
	@java NutritionFacts
	@echo "  Does not scale well!"

.PHONY: clean
clean:
	@rm -f *.class
