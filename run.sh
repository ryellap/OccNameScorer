#!/bin/bash
filePath="$1"
if [ $# -eq 0 ]; then
  read -p "* Please provide full path to the names files: " filePath
fi

javac -d out src/com/occ/score/board/*/*.java src/com/occ/score/board/*.java
java -cp out com.occ.score.board.Calculator "$filePath"
