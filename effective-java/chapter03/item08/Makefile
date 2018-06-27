.PHONY: run

default: build

build: *.java
	# violates symmetry!
	javac CaseInsensitiveString.java

run: build
	java CaseInsensitiveString

clean:
	rm -f *.class
