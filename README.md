# MemoryLeakDemonstration
A "smart bathroom" made in Java has a memory leak

_This README is a work in progress. Feel free to contribute to the code or documentation._

* * *

This program is a simple demonstration of a memory leak in Java.

The `Bathroom` stores `StallNumber`s in a `HashMap`, but does not provide a proper `.equals()` and `.hashCode()` implementations.
This causes the `HashMap` to store each `StallNumber` in a unique location instead of reusing stalls.

## Usage

Run with `-Xmx500m` to make it fail faster.
