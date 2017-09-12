3 pegs - A B C, peg A is the location, peg B is the destination, and peg C is the helper.
n number of disks.
passed the number of disk n as m, peg A as from, peg B as to, peg C as via in the towers function.

Base condition:
if 1 disk - directly move the disk from location to destination. move from A to B.
Print the base condition.

Inductive condition:
else if more than 1 disk - e.g. 3(n = 3);
move 2 i.e. (n-1) disks from location to helper using destination - (n-1, from, via, to)
move 1 disk from location to destination (base condition) print it
move 2 i.e. (n-1) disks from helper to destination using location - (n-1, via, to, from)
