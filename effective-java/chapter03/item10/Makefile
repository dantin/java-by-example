
default: build

build: CaseInsensitiveString.class Point.class PhoneNumber.class

CaseInsensitiveString.class: CaseInsensitiveString.java
	@# code - violate symmetry
	@javac CaseInsensitiveString.java

Point.class: Point.java
	@# code - violate Liskov substitution principle
	@javac Point.java

PhoneNumber.class: PhoneNumber.java
	@# code - typical equals method
	@javac PhoneNumber.java

.PHONY: inheritance
inheritance:
	@cd inheritance; make build

.PHONY: run
run: build
	@echo "violates symmetry!"
	@java CaseInsensitiveString
	@cd inheritance; make run
	@cd composition; make run

.PHONY: clean
clean:
	@rm -f *.class
	@cd inheritance; make clean
	@cd composition; make clean
