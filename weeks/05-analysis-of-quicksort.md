# Week 5 — Analysis of Quicksort

> Topic: *Analysis of Quicksort*

**Previous:** [Week 4](04-quicksort.md) · **Next:** [Week 6](06-medians-and-order-statistics.md)

## Goals
- Derive the expected running time of randomized quicksort.
- Use indicator random variables in an analysis.

## Key concepts
- **Indicator random variable** `X_ij = 1` if `z_i` and `z_j` are ever compared.
- `Pr{z_i compared to z_j} = 2/(j − i + 1)` — the key step.
- Expected comparisons `= Σ Σ 2/(j−i+1) = O(n lg n)`, via the harmonic series.
- Linearity of expectation removes the need for independence.
- Worst-case analysis via the recurrence `T(n) = max_q (T(q) + T(n−q−1)) + Θ(n)`.

## Reading

- [CLRS — Ch. 7.4 (analysis of quicksort)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=191)
- [CLRS — Ch. 5 (probabilistic analysis, indicator variables)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=135)

## Practice
- [ ] Reproduce the `2/(j−i+1)` argument from memory
- [ ] CLRS 5.2, 7.4 exercises

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
- [ ] Exercises done

## From past terms

**Slides (2025-2026 Fall)**
- [lecture06a.pdf](../resources/2025-2026-fall/slides/lecture06a.pdf) — analysis of quicksort
- [lecture06b.pdf](../resources/2025-2026-fall/slides/lecture06b.pdf) — randomized quicksort

**Past exam questions**
- [Undated final, Q1(b)](../exams/undated/final-transcribed.md) — best, worst and average case of a randomized SlowSort
- [2019-2020 Q3](../exams/2019-2020/questions-Q3.txt) — worst-case `O(n lg n)` quicksort with a median pivot

**Code**
- [RandomizedHoareQuickSort.java](../code/java/lecture-examples/algorithm-analysis/QuickSort/RandomizedHoareQuickSort.java) · [RandomizedLomutoQuickSort.java](../code/java/lecture-examples/algorithm-analysis/QuickSort/RandomizedLomutoQuickSort.java)

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
