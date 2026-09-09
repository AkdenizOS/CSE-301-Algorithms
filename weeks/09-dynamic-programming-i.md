# Week 9 — Dynamic Programming I

> Fall 2025 outline: *Dynamic Programming*

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

## My notes

<!-- Lecture: what was actually covered. -->

<!-- Worked derivations and proofs. -->

<!-- Questions to ask. -->

<!-- Exam-worthy: complexities, proof templates, pitfalls. -->
