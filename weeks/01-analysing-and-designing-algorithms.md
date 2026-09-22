# Week 1 — Analysing and Designing Algorithms

> Topic: *Introduction: analysing algorithms, designing algorithms*

**Next:** [Week 2](02-solving-recurrences.md)

## Goals
- Analyse an algorithm's running time and express it asymptotically.
- Prove correctness with a loop invariant.

## Key concepts
- Insertion sort as the running example; best, worst and average case.
- **Loop invariant**: initialization, maintenance, termination — the standard correctness proof.
- Asymptotic notation: `Θ`, `O`, `Ω`, `o`, `ω`. `O` is an upper bound, `Θ` is tight — exams punish confusing them.
- The RAM model: what counts as one step.
- Divide-and-conquer preview via merge sort: `T(n) = 2T(n/2) + Θ(n) = Θ(n lg n)`.

## Reading

- [CLRS — Ch. 1 (the role of algorithms)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=26)
- [CLRS — Ch. 2 (getting started)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=37)
- [CLRS — Ch. 3 (growth of functions)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=64)

## Practice
- [ ] Prove insertion sort correct with a loop invariant
- [ ] Rank a list of functions by growth rate
- [ ] CLRS 2.1-1..4, 3.1-1..8

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
- [ ] Exercises done

## From past terms

**Slides (2025-2026 Fall)**
- [Intro.pdf](../resources/2025-2026-fall/slides/Intro.pdf) — course advice and syllabus
- [lecture01.pdf](../resources/2025-2026-fall/slides/lecture01.pdf) — introduction to analysis of algorithms
- [lecture02.pdf](../resources/2025-2026-fall/slides/lecture02.pdf) — asymptotic notation

**Labs (2025-2026 Fall)**
- [Pre-lab week 1](../resources/2025-2026-fall/labs/pre-lab/week-01/) — insertion sort exercise ("The Shifting Sands of Time") with Java solutions
- [Group 2, week 1](../resources/2025-2026-fall/labs/group-2/week-01/) — "The Chronomancer's Tapestry of Fate", an insertion-sort problem, with solution

**Past exam questions**
- [2019-2020 Q1.1](../exams/2019-2020/questions-Q1.1.jfif), [Q1.2](../exams/2019-2020/questions-Q1.2.jfif) — O / Θ / o proofs for pairs of functions
- [Bilkent CS473 — asymptotic analysis](../resources/bilkent/Asymptotic%20Analysis_cs473.final_1.pdf)
- [Undated midterm practice](../assignments/undated-unattributed/analysis-assignment/AlgorithmsMidtermPractice.pdf) — Q1: insertion sort on a pairwise-swapped array

**Exercises and code**
- [Analysis assignment](../assignments/undated-unattributed/analysis-assignment/) — theoretical vs. measured complexity of three algorithms, with graphs
- [Sifted insertion (take-home 3)](../exercises/practice/take-home-exam/3/SiftedInsertion.java)
- [Java insertion sort](../code/java/lecture-examples/algorithm-analysis/InsertionSort/) · [Python insertion sort](../code/python/reference/sorting/insertion-sort/) · [Python week 1 coursework](../code/python/coursework/week01/)

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

## Notes — unknown student (undated)

### Algorithm

A sequence of computational steps that transform the input to the desired output.

- An algorightm must be halt.

- Algorithms must be:
    * fast
    * use little memory
    * correct

- Two things affect the running times: 
    - input size.
    - state / position of the input.
        * worst, avarage or best case depends on it.
#### Sorting problem

##### Insertion sort
- make sorted proviously iterated part.
