# Week 3 — Divide and Conquer Design Paradigm

> Topic: *Divide and Conquer Design Paradigm*

**Previous:** [Week 2](02-solving-recurrences.md) · **Next:** [Week 4](04-quicksort.md)

## Goals
- Design a divide-and-conquer algorithm and analyse it.
- Explain how Strassen beats the naive matrix multiplication bound.

## Key concepts
- The three steps: divide, conquer, combine.
- **Maximum subarray** in `Θ(n lg n)` by divide and conquer (and `Θ(n)` by Kadane).
- **Strassen's algorithm**: 7 multiplications instead of 8 → `Θ(n^lg7) ≈ Θ(n^2.81)`.
- Binary search, merge sort, and powering a number as the simple cases.

## Reading

- [CLRS — Ch. 4 (divide-and-conquer)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=86)
- [CLRS — Ch. 4.2 (Strassen)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=86)

## Practice
- [ ] Implement max-subarray both ways and compare empirically
- [ ] Work through one Strassen step by hand
- [ ] CLRS 4.1, 4.2 exercises

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
- [ ] Exercises done

## From past terms

**Slides (2025-2026 Fall)**
- [lecture04.pdf](../resources/2025-2026-fall/slides/lecture04.pdf) — the divide-and-conquer design paradigm

**Labs (2025-2026 Fall)**
- [Pre-lab week 2 — merge sort exercise](../resources/2025-2026-fall/labs/pre-lab/week-02-Merge%20Sort%20Exercise.pdf) ("The Cosmic Echo Problem")
- [Pre-lab week 3 — divide and conquer exercise](../resources/2025-2026-fall/labs/pre-lab/week-03-Divide%20and%20Conquer%20Exercise.pdf) (maximum subarray, "Peak Profitability")
- [Group 2, week 2](../resources/2025-2026-fall/labs/group-2/week-02/) — count of range sums via merge sort
- [Group 3, week 2](../resources/2025-2026-fall/labs/group-3-week-02/) — skyline problem, divide and conquer
- [Group 4, week 4](../resources/2025-2026-fall/labs/group-4-week-04/) — "Special Fractal Grid", recursive quadrant fill

**Past exam questions**
- [2019-2020 Q5](../exams/2019-2020/questions-Q5.txt) — find the first missing number

**Exercises and code**
- [Bank Office Problem](../exercises/algorithm-analysis/version-1/BankOfficeProblem/) — search a circularly shifted sorted array ([version 2](../exercises/algorithm-analysis/version-2/BankOfficeProblem/))
- [Missing Patient Problem](../exercises/algorithm-analysis/version-1/MissingPatientProblem/) ([version 2](../exercises/algorithm-analysis/version-2/MissingPatientProblem/), [take-home 1 solution](../exercises/practice/take-home-exam/1/), [Fall 2022 take-home statement](../exercises/problem-statements/CSE301TakeHome1.pdf))
- [Majority element](../exercises/practice/majority-element/) — divide and conquer vs. Boyer-Moore; a past student's [majority-element assignment](../assignments/undated-unattributed/submissions/other-students/CSE301_Assignment_20190808035.pdf)
- [Java merge sort](../code/java/lecture-examples/algorithm-analysis/MergeSort/) · [other D&C (binary search, power)](../code/java/lecture-examples/algorithm-analysis/OtherDivideAndConquerAlgorithms/) · [Python divide and conquer](../code/python/reference/divide-and-conquer/) · [Python merge sort](../code/python/reference/sorting/merge/) · [Python week 2 coursework](../code/python/coursework/week02/)

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
