// TESTHL CLASS USED TO TEST CPS710 ASSIGNMENT 3
//
class TestHL {

    private static SimpleCharStream instream;
    private static HLTokenManager scanner;
    private static HL parser;

    public static void main(String args[]) throws ParseException{

	// Figure out input stream from args or stdin
	java.io.InputStream infile;
	if (args.length < 1) {
	 	infile = System.in;
	} 
	else try {  
	  	infile = new java.io.FileInputStream(args[0]);
	} catch (java.io.FileNotFoundException e) {
	   	System.out.println("File " + args[0] + " not found."); 
	   	return;
	} 

	// Create scanner and parser
	instream = new SimpleCharStream(infile);
	scanner = new HLTokenManager(instream);
	parser = new HL(scanner);

	// Call parser until EOF reached
	while (nextParse());
    	}

private static boolean nextParse() {
	SimpleNode tree;
	try {
		tree = parser.start();
		tree.dump("");
		System.out.println();
	} catch (ParseException e) {	// catch EOF
     if (!e.getMessage().contains("EOF") && !e.getMessage().contains("End of File"))
       System.out.println("Syntax error: " + e +". Try recompiling with DEBUG_PARSER=true");
       return false;
	}
	return true;
	}

}