# Week 10 — Dynamic Programming II

> Topic: *Dynamic Programming*

**Previous:** [Week 9](09-dynamic-programming-i.md) · **Next:** [Week 11](11-greedy-algorithms.md)

## Goals
- Apply DP to LCS and optimal BSTs.
- Compare DP against greedy on the same problem.

## Key concepts
- **Longest common subsequence**: `Θ(mn)` table, backtrack for the subsequence itself.
- **Optimal binary search tree**: expected search cost, `Θ(n³)` (or `Θ(n²)` with Knuth's optimization).
- **0-1 knapsack** is DP; **fractional knapsack** is greedy — the difference is the exam question.
- Longest increasing subsequence, coin change, edit distance as the standard extras.
- Space optimization: keeping only the last row.

## Reading

- [CLRS — Ch. 15.4-15.5 (LCS, optimal BSTs)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=380)

## Practice
- [ ] Implement LCS with backtracking
- [ ] Implement 0-1 knapsack and explain why greedy fails on it
- [ ] Compare with the Java implementations in [`code/java`](../code/java/)

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
- [ ] Exercises done

---

Your own notes for this week go in `terms/<your-term>/notes/week-10.md`, not here.
This file is the shared plan — improve it if the course changes, but keep it general.
