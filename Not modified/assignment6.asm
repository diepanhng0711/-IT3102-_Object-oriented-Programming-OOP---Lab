# Assignment 6	- Lab 03
.data
	i:		.word	0
	n:		.word	6
	sum:		.word	0
	A: 		.word	1, 2, 3, 11, 5, 6
.text
	la	$t7, i
	lw	$s1, 0($t7)
	la	$s2,	A
	la	$t7,	n
	lw	$s3, 0($t7)
	la	$t7,	sum
	lw	$s5, 0($t7)
	
   loop:
   	beq 	$s1, $s3	endloop
   	sll	$t1, $s1, 2
   	add	$t1, $t1, $s2
   	
   	lw	$t0, 0($t1)
   	slt	$t2, $s5, $t0
   	beq	$t2, $0, next
   	add	$s5, $0, $t0
   next:
   	addi $s1, $s1, 1
   	j	loop
   endloop:
   	syscall
   	