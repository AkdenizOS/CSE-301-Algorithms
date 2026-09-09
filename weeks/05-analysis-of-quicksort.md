# Week 5 — Analysis of Quicksort

> Fall 2025 outline: *Analysis of Quicksort*

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

## My notes

<!-- Lecture: what was actually covered. -->

<!-- Worked derivations and proofs. -->

<!-- Questions to ask. -->

<!-- Exam-worthy: complexities, proof templates, pitfalls. -->
