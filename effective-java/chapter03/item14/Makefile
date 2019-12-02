
default: build

.PHONY: build
build: WordList.java CaseInsensitiveString.java PhoneNumber.java
	@javac WordList.java
	@javac CaseInsensitiveString.java
	@javac PhoneNumber.java

.PHONY: run
run: build
	@java WordList alice bob tom bob
	@java CaseInsensitiveString alice Bob moo
	@java PhoneNumber

.PHONY: clean
clean:
	@rm -f *.class
