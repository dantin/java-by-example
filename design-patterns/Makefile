
SOURCE_DIR := $(shell pwd)

PATTERNS := $(notdir $(shell find $(SOURCE_DIR) -maxdepth 1 -type d -exec basename \{\} \;))

DEFAULT: build

.PHONY: build
build:
	@for pattern in $(PATTERNS) ; do \
		cd $(SOURCE_DIR)/$$pattern && make; \
	done

.PHONY: clean
clean:
	@for pattern in $(PATTERNS) ; do \
		cd $(SOURCE_DIR)/$$pattern && make clean; \
	done
