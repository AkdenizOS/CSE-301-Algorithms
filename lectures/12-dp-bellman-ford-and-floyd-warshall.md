# Lecture 12 — Dynamic Programming: Bellman-Ford and Floyd-Warshall

> Stanford CS161 Winter 2026, lecture 12: *Dynamic Programming: Bellman-Ford and Floyd-Warshall* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-12-dynamic-programming-bellman-ford-and-floyd-warshall)

**Previous:** [Lecture 11](11-dijkstra-and-bellman-ford.md) · **Next:** [Lecture 13](13-more-dp-lcs-knapsack-independent-set.md)

## Goals
- Recognize optimal substructure and overlapping subproblems.
- Write both a top-down memoized and a bottom-up tabulated solution.
- See Bellman-Ford and Floyd-Warshall as dynamic programs.

## Key concepts
- The two hallmarks: **optimal substructure** and **overlapping subproblems**. Both must hold.
- Top-down with memoization vs. bottom-up tabulation — same complexity, different constants and stack behaviour.
- **Rod cutting**: `r_n = max(p_i + r_{n−i})`.
- **Matrix-chain multiplication**: `Θ(n³)` time, `Θ(n²)` space; reconstructing the parenthesization.
- Reconstructing the solution, not just its value — keep a choice table.
- **Bellman-Ford as DP**: `d^(k)[v]` = shortest path using at most `k` edges.
- **Floyd-Warshall**: `D^(k)[i][j]` = shortest `i→j` path through vertices `1..k`; `Θ(V³)` all-pairs.

## Reading

- [CLRS — Ch. 15.1 (rod cutting)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=381)
- [CLRS — Ch. 25.2 (Floyd-Warshall)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=714)
- *Algorithms Illuminated* Part III — 18

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture12-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture12-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/Lecture12.pdf)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture12_dp.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture12_dp.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/dp1.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/dp1.pdf)

## Practice
- [ ] Implement rod cutting three ways: naive, memoized, tabulated; time all three
- [ ] Matrix-chain by hand on 5 matrices
- [ ] CLRS 15.1, 15.2 exercises
- [ ] Run Floyd-Warshall by hand on a 4-vertex graph

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
- [lecture10new.pdf](../resources/2025-2026-fall/slides/lecture10new.pdf) — dynamic programming (matrix chain, LCS, optimal BST)

**Labs (2025-2026 Fall)**
- [Pre-lab week 5 — Fibonacci with memoization](../resources/2025-2026-fall/labs/pre-lab/week-05-fib.java)
- [Group 1, week 5 — integer break](../resources/2025-2026-fall/labs/group-1-week-05-problem-integer-break.txt) · [Group 2, week 5 — triangle minimum path sum](../resources/2025-2026-fall/labs/group-2/week-05-triangle%20sorusu.txt)
- [In-class exercises](../resources/2025-2026-fall/exercises/) — unique paths, matrix multiply, min coin

**Past exam questions**
- [2025-2026 final, page 1](../exams/2025-2026/final-answered-page-1.jpeg) — "Mario's Chick Rescue Detours" (DP)
- [Undated final, Q2-Q4](../exams/undated/final-transcribed.md) — longest palindromic subsequence, coin change, two-container knapsack
- [Final analysis](../exams/prep/final.md) and [final + make-up transcription](../exams/prep/analysproof.md) — the thief with 1/3/5 kg items; [make-up analysis](../exams/prep/mu.md) — the coffee-stop traveller
- [Final exam structure](../exams/prep/algorithm-Final.txt) — DP 50, greedy 30, amortized analysis 20
- [CLRS Part IV summary](../exams/prep/bk.md) — rod cutting, matrix chain

**Exercises and code**
- [Thief problem (reference homework 3)](../assignments/undated-unattributed/reference-homeworks/Assignment%203/ALGORITHMS%20HW%203.pdf), solved in [HW3_Assignment.java](../assignments/undated-unattributed/reference-homeworks/Assignment%201/HW3_Assignment.java)
- [Rod-cutting lab (2019 student)](../assignments/undated-unattributed/submissions/other-students/Lab05_20190808008.java) · [rod cutting and LCS timing](../assignments/undated-unattributed/submissions/individual/Assignment05_20200808019.java)
- [Fibonacci practice](../exercises/practice/dynamic-programming/fib/)
- [Java DP (top-down and bottom-up)](../code/java/lecture-examples/algorithm-analysis/DynamicProgramming/) · [RodCuttingRecursive.java](../code/java/coursework/2024/RodCuttingRecursive.java) · [Python DP](../code/python/reference/dynamic-programming/)

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
