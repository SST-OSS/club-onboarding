# K Occurrences

Groot has `N` trees lined up in front of him where the height of the `i`'th tree is denoted by `H[i]`.

He wants to select some trees to replace his broken branches.

But he wants uniformity in his selection of trees.

So he picks only those trees whose heights have frequency `A`.

He then sums up the heights that occur `A` times. (He adds the height only once to the sum and not `A` times).

In case no such cluster exists, Groot becomes sad and prints `-1`.

```
# Example input
A = 2
H = [1 2 2 3 3]

# Example output
5
```
