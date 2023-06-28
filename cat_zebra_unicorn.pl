#!/usr/bin/perl
#First we create a file handle for the  output file
open (my $fh, '>', 'the_think_tank_output.txt') or die $!;

#We are using the for loop to write the 2000 lines of code
for (my $i = 1; $i <= 2000; $i++){
	#We are using printf here to write the code and format the output
	printf $fh "%05d: %-20s %s\n", $i, 'print "Hello World";', '# This line prints a message';
}

#Finally we close the output file
close $fh;