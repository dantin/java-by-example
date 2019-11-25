
.PHONY: init
init:
	@cp $$PWD/../Point.java .
	@cp $$PWD/../Color.java .

ColorPoint.class: init ColorPoint.java
	@javac ColorPoint.java

CounterPointTest.class: init CounterPointTest.java CounterPoint.java
	@javac CounterPointTest.java

.PHONY: build
build: ColorPoint.class CounterPointTest.class 

.PHONY: run
run: build
	@java ColorPoint
	@java CounterPointTest

.PHONY: clean
clean:
	@rm -rf *.class Point.java Color.java
