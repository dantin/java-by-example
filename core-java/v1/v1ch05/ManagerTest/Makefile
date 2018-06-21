BIN := ManagerTest

.PHONY: clean

default: build

build: $(BIN).class

$(BIN).class: $(BIN).java
	javac $(BIN).java

clean:
	rm -rf *~ *.class

run: build
	java $(BIN)
