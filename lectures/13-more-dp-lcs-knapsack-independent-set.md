# Lecture 13 — More Dynamic Programming: LCS, Knapsack, Independent Set

> Stanford CS161 Winter 2026, lecture 13: *More Dynamic Programming: LCS, Knapsack, Independent Set* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-13-more-dynamic-programming-lcs-knapsack-independent-set)

**Previous:** [Lecture 12](12-dp-bellman-ford-and-floyd-warshall.md) · **Next:** [Lecture 14](14-greedy-algorithms.md)

## Goals
- Apply DP to LCS and optimal BSTs.
- Compare DP against greedy on the same problem.
- Solve maximum-weight independent set on a path/tree by DP.

## Key concepts
- **Longest common subsequence**: `Θ(mn)` table, backtrack for the subsequence itself.
- **Optimal binary search tree**: expected search cost, `Θ(n³)` (or `Θ(n²)` with Knuth's optimization).
- **0-1 knapsack** is DP; **fractional knapsack** is greedy — the difference is the exam question.
- Longest increasing subsequence, coin change, edit distance as the standard extras.
- Space optimization: keeping only the last row.
- **Max-weight independent set** on a path: `A[i] = max(A[i−1], A[i−2] + w_i)`.

## Reading

- [CLRS — Ch. 15.4 (longest common subsequence)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=411)
- *Algorithms Illuminated* Part III — 16

## CS161 resources

- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture13-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/Lecture13.pdf)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/dp2.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/dp2.pdf)

## Practice
- [ ] Implement LCS with backtracking
- [ ] Implement 0-1 knapsack and explain why greedy fails on it
- [ ] Compare with the Java implementations in [`code/java`](../code/java/)

## Checklist
- [ ] Pre-lecture exercise done
- [ ] Lecture attended
- [ ] Textbook section read
- [ ] Notebook done
- [ ] Concept check done
- [ ] Lab done
- [ ] Exercises done

## From past terms

**Slides (2025-2026 Fall)**
- [dp_examples.pdf](../resources/2025-2026-fall/slides/dp_examples.pdf) — subset sum and other DP problems

**Past exam questions**
- [2025-2026 final, page 2](../exams/2025-2026/final-answered-page-2.png) — "Company Hiring Split" (DP + greedy)
- [2023 make-up / final analysis](../exams/prep/but.md) — two-truck knapsack, minimum edit distance
- [Bütwork answers](../exams/prep/butwork-README.md) — edit distance, matrix chain; [statement](../exercises/problem-statements/Algorithms_Butwork.pdf), [Medetkan Kutlu's submission](../assignments/undated-unattributed/submissions/cse301/Butowork_Medetkan_Kutlu_20170808068.pdf)
- [Other DP problems (slides transcribed)](../exams/prep/ex.md) · [practice DP photo](../exams/practice/dynamic-programming-practice.jpg)
- Bilkent CS473: [DP final](../resources/bilkent/Dynamic%20Programming_cs473.final_3.pdf) · [DP midweek 4](../resources/bilkent/dynamic_prog_cs473.mwe4_2.pdf.pdf) · [DP midweek 3](../resources/bilkent/dynamic_programming_Midweek%20Exam%20III%20.pdf) · [DP and greedy examples](../resources/bilkent/Dynamic%20Programming_%20Greedy_examples.pdf)

**Exercises and code**
- [Optimal Binary Search Tree](../exercises/algorithm-analysis/version-1/OptimalBinarySearchTree/)
- [Complete Binary Tree Min Path](../exercises/algorithm-analysis/version-1/CompleteBinaryTreeMinPath/) ([version 2](../exercises/algorithm-analysis/version-2/Complete-BT-FindMinPath/), [reference homework 2](../assignments/undated-unattributed/reference-homeworks/Assignment%202/))
- [Crazy Eights](../exercises/crazy-eight/) — DP case study with MIT 6.006 lectures 18-21
- [LCS practice](../exercises/practice/dynamic-programming/lcs/) · [max subarray](../exercises/practice/dynamic-programming/max-sub-array/) · [lab 5 (LCS timing)](../exercises/practice/lab5/)
- [LongestCommonSubsequence.java](../code/java/coursework/2024/LongestCommonSubsequence.java) · [recursive](../code/java/coursework/2024/LongestCommonSubsequenceRecursive.java)

---

This file is the shared plan — improve it if the course changes, but keep it general.
Personal notes go below, one `## Notes — <Name> (<term>)` section per person.

## Notes — Efe (2026-2027 Fall)

### Lecture
<!-- What was actually covered, and what the lecturer emphasised. -->

### Worked out by hand
<!-- Derivations, proofs, traced algorithms. -->

### Questions
<!-- Unclear things. Ask, then answer them here. -->

### Exam-worthy
<!-- Formulas, conditions, algorithm steps, pitfalls. -->
