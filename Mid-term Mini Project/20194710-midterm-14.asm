#Mid-term Mini Project, Task 14
#Nguyen Trong Tue - 20194710
.data
	s1:		.space	100
	s2:		.space	100
	mes_1:	.asciiz	"Enter the first string s1: "
	mes_2:	.asciiz	"Enter the second string s2: "
	mes_out:	.asciiz	"commonCharacterCount(s1, s2) = "
	mes_err:	.asciiz	"Invalid string input!"
.text
main:
str1_input:
	li	$v0, 54	
	la	$a0, mes_1
	la 	$a1, s1
	la	$a2, 100
	syscall
	beq 	$a1, $0, str1_copy			#check status value if != 0 (OK)
	li 	$v0, 59
	la	$a0, mes_err
	syscall
	j exit
str1_copy:
	la	$s0, s1					#$s0 = str1
str2_input:
	li	$v0, 54	
	la	$a0, mes_2
	la 	$a1, s2
	la	$a2, 100
	syscall
	beq 	$a1, $0, str2_copy			#check status value if != 0 (OK)
	li 	$v0, 59
	la	$a0, mes_err
	syscall
	j exit
str2_copy:
	la	$s1, s2					#$s1 = str2
function_calling:
	j	commonCharacterCount
commonCharacterCount:
	addi	$t0, $0, 0					#$t0 = count = init 0
	addi	$t1, $0, 0					#$t1 = i = init -1
	addi $t2, $0, 0					#$t2 = j = init -1
L1:
	add	$t3, $s0, $t1 				#$t3 = $s0 + $t1 = x[0] + i = x[i]
	lb	$t4, 0($t3)				#$t4 = value at $t3 = x[i]
	beq	$t4, 0x20, L2_end			#check whether x[i] == space or not, if equals => skip to the next character of x
	beq 	$t4, 0x0a, end				#check whether x[i] =='\n' or not, if equals => end of x <=> end of function
	 j 	L2
L2:
	add	$t5, $s1, $t2				#$t5 = $s1 + $t2 = y[0] + j = x[j]
	lb	$t6, 0($t5)				#$t6 = value at $t4 = y[j]
	beq	$t6, 0x0a, L2_end			#check whether y[j] = '\n' or not => end of L2
	bne	$t4, $t6, L2_next			#if x[i] != y[j] => move to L2_next to continue the inner loop, else
common_character_found:	
	addi	$t0, $t0, 1				#count += 1 <=> common character found
	addi	$t1, $t1, 1				#i += 1 to traverse the next character of x
	li	$t7, 32					#$t7 = ' ' = 0x20 = 32
	sb	$t7, 0($t5)				#y[i] = $t7 = 0x20 = 32 = ' ' = space character
	addi	$t2, $0, 0					#j = 0 to traverse y with the next character of x
	j	L1						#jump to L1 to continue
L2_next:
	addi $t2, $t2, 1				#j += 1 to traverse the next character of y
	j 	L2
L2_end:
	addi	$t1, $t1, 1				#i += 1 to traverse the next character of x
	addi	$t2, $0, 0					#j = 0 to traverse y with the next character of x
	j	L1						#jump to L1 to continue
end:
	li	$v0, 	4
	la	$a0, mes_out
	syscall
	li	$v0,	1
	la	$a0,  0($t0)
	syscall
exit:
