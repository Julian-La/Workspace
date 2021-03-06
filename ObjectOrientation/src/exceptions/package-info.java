package exceptions;

/**
 * Read url: https://stackify.com/best-practices-exceptions-java/
* Exceptions shut down programs. You need to handle them. 
* You should create a new exception class for each case, else the same exception will be cast twice. 
* To shorten code you can insert the "finally method". finally will alwas trigger. 
* Exceptions should be priorized: unusual exceptions first. 
* You can refer to exceptions and inform others:
* @throw nameOfException if case x happens, this nameOfException will be shown etc. 
* You can build logfiles: 
* } catch(nameOfException e){
* 	log.errors("What happened and what to do "+e)
* }
* 
* There are to exception types: 
* -> runtimeException (Don't need to be catched. It's a programming failure. 
* -> normalExcaption (Must be try/catched.) 
*/
