.PHONY: run

default: build

build: symmetry transitivity transitivity2

symmetry: CaseInsensitiveString.java
	# violates symmetry!
	javac CaseInsensitiveString.java

transitivity: Point.java ColorPoint.java
	javac ColorPoint.java

transitivity2: CounterPointTest.java CounterPoint.java
	javac CounterPointTest.java

run: build
	java CaseInsensitiveString
	java ColorPoint
	java CounterPointTest

clean:
	rm -f *.class
