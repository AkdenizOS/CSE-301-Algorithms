# Week 6 — Medians and Order Statistics

> Fall 2025 outline: *Medians and Order Statistics*

**Previous:** [Week 5](05-analysis-of-quicksort.md) · **Next:** [Week 7](07-holiday.md)

## Goals
- Find the i-th smallest element in expected linear time.
- Explain the median-of-medians worst-case linear algorithm.

## Key concepts
- Selection problem: i-th order statistic without fully sorting.
- **RANDOMIZED-SELECT**: quicksort's partition, recurse on one side only → expected `Θ(n)`.
- **SELECT (median of medians)**: groups of 5, median of each, recurse → worst-case `Θ(n)`.
- Why 5: it guarantees discarding at least `3n/10 − 6` elements, making `T(n) ≤ T(n/5) + T(7n/10) + O(n)` solvable.
- Minimum and maximum together in `⌈3n/2⌉ − 2` comparisons.

## Reading

- [CLRS — Ch. 9 (medians and order statistics)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=234)

## Practice
- [ ] Implement both selection algorithms and compare
- [ ] Show why groups of 3 fail
- [ ] CLRS 9.1, 9.2, 9.3 exercises

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
