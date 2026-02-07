-- JDK version used\
-- Brief explanation of "Hello World" program run.

I've used JDK version 8, 17 and 22

Java is a platform-independent language that follws a two-step execution process:\
-- Compilation (source code -> bytecode)\
-- Execution (bytecode -> machine code via JVM)

1) Compilation in Java\
   Java source code (.java files) is compiled by the java compiler (javac) into bytecode, stored in\
   .class files. This bytecode is platform-independent and ready to run on any system with a JVM.\
   Internally, compilation involves:\
   -- Parsing: Converts code into syntax trees(ATS)\
   -- Entering: Populates symbol tables.\
   -- Annotation Processing: Handles annotations.\
   -- Attribution: Performs type checking and name resolution.\
   -- Flow Analysis: Checks for variable use and reachability.\
   -- Desugaring: Removes syntactic shortcuts.\
   -- Generation: Produces .class files.\
2) Execution via JVM\
   the .class files are executed by the Java Virtual Machine(JVM), which includes the following stages:\
   2.1 Class Loader\
   Loads the main class and other dependencies into memory\
   -- Primordial Loader: Default system loader.\
   -- Non-primordial Loader: Custom loaders for advanced control.

Class r = loadclass(String className, boolean resolveIt);

2.2 Bytecode Verifier\
Checks that the loaded bytecode is safe to execute. It ensures:\
-- Variables are initialized\
-- Method signatures are correct\
-- Private access rules aren't violated\
-- No stack overflows\
2.3 Just-In-Time (JIT) Compiler\
Converts bytecode into native machine code at runtime for faster execution.
 
