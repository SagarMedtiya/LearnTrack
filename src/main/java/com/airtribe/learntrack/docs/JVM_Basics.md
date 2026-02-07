-- What is JDK, JRE, JVM
-- What is bytecode
-- What does "write once, run anywhere" mean (1-2 short paragraphs)

JDK - It is a java Development kit. It compromises of JRE and JVM. It consists of tools and libraries 
to build a java application. JDK contains, Java Runtime Environment, an interpreter/loader, compiler.
JRE - It consist of runtime environment for java programs. Jre handle tasks such as loading classes,
bytecode verifier and interpreter. 
JVM - It is a core to run the java program. Jvm loads the bytecode, verifies it, links it, and then executes it.
The main component of JVM are Class Loader, JVM Memory, Execution Engine, Native Method Interface and Native
Method Libraries. 

ByteCode - It is an intermediate, platform-independent code generated when a .java file is compiled into a .class
file. This bytecode is executed by the Java Virtual Machine(JVM). Java programs are not directly converted into
machine code of a specific operating system. Instead, they are converted into bytecode, which is independent of hardware
and OS. Any system with a compatible JVM can execute the same byte code.

Write once, run anywhere - 
'write once, run anywhere' means we can run the bytecode anywhere in the system which have compatible JVM installed.

