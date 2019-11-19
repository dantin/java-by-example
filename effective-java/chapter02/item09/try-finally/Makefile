
default: build

.PHONY: build
build: *.java
	@javac Copy.java
	@javac TopLine.java

.PHONY: run
run: build
	@echo "top line"
	@java TopLine ./TopLine.java
	@echo "copy file"
	@java Copy ./Copy.java ./tmp.txt
	@rm ./tmp.txt

.PHONY: clean
clean:
	@rm -f *.class
