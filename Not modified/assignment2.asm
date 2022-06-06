#Laboratory Exercise 4, Home Assignment 2
.text
	li 		$s0, 0x02d154563 					# Load test value for these function
	andi		$t0, $s0, 0xff000000				# Extract MSB of $s0
	andi		$t1, $s0, 0xffffff00					# Clear LSB of $s0
	or		$t2, $s0, 0x000000ff				# Set LSB of $s0 to 1 (ff)
	xor		$t3, $s0, $s0						# Clear $s0 using logical instructions