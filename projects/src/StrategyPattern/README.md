# The Strategy Pattern

Please run the *Main* class from bin/.

## Explanation

Here, the strategy pattern is implemented for sorting algorithms (just BubbleSort and SelectionSort for now to be precise).

The "context" is the *Sorter* class which gets called from *Main*, which is the "client".
*Sorter* interacts with each *SortingAlgorithm* only through a common interface, the "strategy".
Each "concrete strategy" which is either BubbleSort or SelectionSort in this case, then implements that interface.

The "client" or *Main* updates the current strategy employed by *Sorter* ("context") by using its exposed setter method *setSortingAlgorithm*.
