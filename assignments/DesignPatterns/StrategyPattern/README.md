# The Strategy Pattern

Please run either *Sort* or *BaseConvert* class from ../bin/.

```bash
# You need to cd out of this directory first:
cd ../

# From DesignPatterns/ directory, run this command. 
java -cp bin/ Sort
# or
java -cp bin/ BaseConvert
```

## Implementation

Here, the strategy pattern is implemented for
- Sorting algorithms (BubbleSort and SelectionSort), and 
- Base conversion algorithms (Binary, Octal, Hexadecimal).

The "context" for the former is the *Sorter* class which gets called from *Sort*, 
which is the "client". For the latter, *BaseConverter* is the "context" and the 
*BaseConvert* is the "client".

*Sorter* interacts with each *SortingAlgorithm* only through a common interface, 
which is the "strategy". Likewise, *BaseConverter* only interacts with the different
base conversion algorithms through its "strategy", the *Base* interface. Each 
"concrete strategy" in turn implements those interfaces.

The clients update the current strategy employed by the contexts by using its publicly
exposed setter method, i.e. setSortingAlgorithm() method or setBase() method.
