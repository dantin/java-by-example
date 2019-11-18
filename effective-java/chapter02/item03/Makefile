SOURCE_DIR := $(shell pwd)

DEMOS := field static-factory serializable enum-type

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
