.PHONY: clean

default: build

build: WelcomeApplet.class

WelcomeApplet.class: WelcomeApplet.java
	javac WelcomeApplet.java

clean:
	rm -rf *~ *.class

run: build
	appletviewer WelcomeApplet.html
