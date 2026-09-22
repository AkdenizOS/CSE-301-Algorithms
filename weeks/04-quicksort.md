# Week 4 — Quicksort

> Topic: *Quicksort*

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

## From past terms

**Slides (2025-2026 Fall)**
- [lecture05.pdf](../resources/2025-2026-fall/slides/lecture05.pdf) — quicksort

**Past exam questions**
- [Undated final, Q1(a)](../exams/undated/final-transcribed.md) — insertion, merge and Hoare quicksort when all elements are equal

**Exercises and code**
- [Hungarian Folk Dance](../exercises/algorithm-analysis/version-1/HungarianFolkDance/) — the quicksort danced in the video ([version 2](../exercises/algorithm-analysis/version-2/HungarianFolkDance/), [take-home 2](../exercises/practice/take-home-exam/2/Hungarian.java), [coursework](../code/java/coursework/hungarian-quicksort/))
- [Java quicksort (Hoare, Lomuto)](../code/java/lecture-examples/algorithm-analysis/QuickSort/) · [Python quicksort](../code/python/reference/sorting/quick/)

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
