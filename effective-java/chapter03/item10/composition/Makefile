
.PHONY: init
init:
	@cp $$PWD/../Point.java .
	@cp $$PWD/../Color.java .

ColorPoint.class: init ColorPoint.java
	@javac ColorPoint.java

.PHONY: build
build: ColorPoint.class

.PHONY: run
run: build

.PHONY: clean
clean:
	@rm -rf *.class Point.java Color.java
