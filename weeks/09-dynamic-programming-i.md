# Week 9 — Dynamic Programming I

> Topic: *Dynamic Programming*

**Previous:** [Week 8](08-midterm-week.md) · **Next:** [Week 10](10-dynamic-programming-ii.md)

## Goals
- Recognize optimal substructure and overlapping subproblems.
- Write both a top-down memoized and a bottom-up tabulated solution.

## Key concepts
- The two hallmarks: **optimal substructure** and **overlapping subproblems**. Both must hold.
- Top-down with memoization vs. bottom-up tabulation — same complexity, different constants and stack behaviour.
- **Rod cutting**: `r_n = max(p_i + r_{n−i})`.
- **Matrix-chain multiplication**: `Θ(n³)` time, `Θ(n²)` space; reconstructing the parenthesization.
- Reconstructing the solution, not just its value — keep a choice table.

## Reading

- [CLRS — Ch. 15 (dynamic programming)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=380)

## Practice
- [ ] Implement rod cutting three ways: naive, memoized, tabulated; time all three
- [ ] Matrix-chain by hand on 5 matrices
- [ ] CLRS 15.1, 15.2 exercises

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
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
