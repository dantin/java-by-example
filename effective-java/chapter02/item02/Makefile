SOURCE_DIR := $(shell pwd)

DEMOS := telescoping-constructor javabeans builder hierarchical-builder

default: run

.PHONY: run
run:
	@for subdir in $(DEMOS); \
		do \
	    make -C $(SOURCE_DIR)/$$subdir run; \
		done

.PHONY: clean
clean:
	@for subdir in $(DEMOS); \
		do \
	    make -C $(SOURCE_DIR)/$$subdir clean; \
		done
