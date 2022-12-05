PROBLEM : To show how throwable class handle the user define exception in java 

SOLUTION 
CODE 
public class Junk {
     public static void main(String args[]) {
         try {
             a();
         } catch(HighLevelException e) {
             e.printStackTrace();
         }
     }
     static void a() throws HighLevelException {
         try {
             b();
         } catch(MidLevelException e) {
             throw new HighLevelException(e);
         }
     }
     static void b() throws MidLevelException {
         c();
     }
     static void c() throws MidLevelException {
         try {
             d();
         } catch(LowLevelException e) {
             throw new MidLevelException(e);
         }
     }
     static void d() throws LowLevelException {
        e();
     }
     static void e() throws LowLevelException {
         throw new LowLevelException();
     }
 }

 class HighLevelException extends Exception {
     HighLevelException(Throwable cause) { super(cause); }
 }

 class MidLevelException extends Exception {
     MidLevelException(Throwable cause)  { super(cause); }
 }

 class LowLevelException extends Exception {
 }


OUTPUT 
HighLevelException: MidLevelException: LowLevelExceptionat Junk.a(Junk.java:13)
	at Junk.main(Junk.java:4)
Caused by: MidLevelException: LowLevelException
at Junk.c(Junk.java:23)
	at Junk.b(Junk.java:17)
	at Junk.a(Junk.java:11)
... 1 more
Caused by: LowLevelException
	at Junk.e(Junk.java:30)
	at Junk.d(Junk.java:27)
	at Junk.c(Junk.java:21)
	... 3 more

 
