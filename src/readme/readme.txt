This is a simulated Mini Kernel written in Java. The original assignment(as far as I could find) can be found at http://pages.cs.wisc.edu/~solomon/cs537/html/minikernel.html

My own contributions to the code are in the Kernel and Library. The original project was to implement the create, read, write, format, and ls functions in the kernel and OS library so they could be run in user-space.

To run, compile all .java files, and in the command line the program can be started with "java Boot <cacheSize> <diskName> <diskSize> <shell>".

The most extensive example for shell is the FileTester program. For example, run "java Boot 32 Disk 1024 FileTester". Type "help" in the prompt for a list of working commands.

Simple example:
acoughlin@acoughlin-PC ~/javawork/build/classes $ java Boot 10 Disk 2048 FileTester
Creating new disk
Boot: Starting kernel.
Kernel: Disk is 2048 blocks
Kernel: Disk cache size is 10 blocks
Kernel: Loading initial program.
--> ls
--> create foo
--> ls
foo
--> write foo this is my text
--> read foo
this is my text
--> quit
Kernel: FileTester has terminated.
Saving contents to DISK file...
0 read operations and 0 write operations performed
Boot: Kernel has stopped.

Much more could be done with this project, lots of the original code is still unused. To create a disk of a different size, the DISK file must be deleted in the project folder. 
