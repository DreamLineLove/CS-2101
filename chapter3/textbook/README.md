# Chapter 3 

## Ex 12
        
total  currentValue; is not a statement!
Therefore, `total currentValue;` will error upon compilation.

As for `total = total  currentValue;`, the result of the division is assigned 
back to variable total.

## Chap3BitwiseOp

```java
c = ~a; 
```
Binary 1111 1010 starts with negative bit (first bit 1). Therefore it is a 
negative number.
         
Negative numbers are represented by taking the two's complement of the original 
number.
         
To find out what 1111 1010 is the negative of, we have to find out the original 
number first. 
         
To do so, first turn it back to one's complement form, i.e. 1111 1001, and then 
negate the one's complement, 0000 0110, which is 6 in decimal.
         
Therefore, c is negative 6 or -6.

```java
c = ~a >>> 2; 
```
Taking the complement of a results in a number starting with 1 (negative). 
It is then shifted two positions to the right disregarding sign.
(Meaning the leftmost 2 bits are now filled with 0).
         
This means the resulting number is a very huge positive number, since c is 
defined as an int (32-bits)

