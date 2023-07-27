Explanation:

A colleague of your has been tasked with creating a library that allows for the creation of a directed graph structure.

They have come up with the attached code, and they have asked for feedback and some help.

The requirements were as follows:

A) We need the ability to create a tree-like structure. For example that should allow me to encode a family tree as
follows:

```
Andreas
-Maria
--Kate
--Nicolas
-Tom
--Jerry
---Jim
-Alice
```
B) For any node of the graph, I want to the ability to directly retrieve the children. For the above example:
The children of Maria would Kate and Nicolas

C) For any node of the graph, I want the ability to get all descendants. For the above example:
The descendants of Andreas is everyone, but the descendants of Tom is Jerry and Jim.
