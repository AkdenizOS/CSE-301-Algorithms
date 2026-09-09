# Week 4 — Quicksort

> Fall 2025 outline: *Quicksort*

**Previous:** [Week 3](03-divide-and-conquer.md) · **Next:** [Week 5](05-analysis-of-quicksort.md)

## Goals
- Implement Lomuto and Hoare partitioning correctly.
- State quicksort's best, worst and average case.

## Key concepts
- Partition is the whole algorithm; the sort is just recursion around it.
- **Lomuto**: pivot at the end, one index scan. Simpler, more swaps.
- **Hoare**: two pointers moving inward. Fewer swaps, trickier boundary conditions.
- Worst case `Θ(n²)` on already-sorted input with a fixed pivot; best/average `Θ(n lg n)`.
- **Randomized quicksort**: random pivot makes the worst case depend on the coin, not the input.
- In-place, not stable.

## Reading

- [CLRS — Ch. 7 (quicksort)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=191)

## Practice
- [ ] Implement both partition schemes; find an input that makes each degenerate
- [ ] Trace a partition by hand on 8 elements
- [ ] CLRS 7.1, 7.2 exercises

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
