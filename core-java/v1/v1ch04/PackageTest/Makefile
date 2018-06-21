BIN := PackageTest

.PHONY: clean

default: build

build: $(BIN).class

$(BIN).class: $(BIN).java
	javac $(BIN).java

clean:
	find . -type f \( -name "*.class" -or -name "*~" \) -print0 | xargs -0 rm -rf

run: build
	java $(BIN)
