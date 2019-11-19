
default: build

.PHONY: build
build: *.java
	@javac Copy.java
	@javac TopLine.java
	@javac TopLineWithDefault.java

.PHONY: run
run: build
	@echo "top line"
	@java TopLine ./TopLine.java
	@echo "top line with default"
	@java TopLineWithDefault ./TopLine.java
	@echo "copy file"
	@java Copy ./Copy.java ./tmp.txt
	@rm ./tmp.txt

.PHONY: clean
clean:
	@rm -f *.class
