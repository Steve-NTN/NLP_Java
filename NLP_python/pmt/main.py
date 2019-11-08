import sys
import spellcheck

values = sys.argv[1:]
for value in values:
    if not spellcheck.is_spelled_correctly(value):
        print("The word is not spelled correctly: " + value)
