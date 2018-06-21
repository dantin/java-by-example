.PHONY: clean

default: build

build: ImageViewer.class

ImageViewer.class: ImageViewer.java
	javac ImageViewer.java

clean:
	rm -rf *~ *.class

run: build
	java ImageViewer
