HL.class: HL.jjt
	jjtree HL.jjt
	javacc ./AST/HL.jj
	javac @options  AST/*.java
	javac @options  *.java
