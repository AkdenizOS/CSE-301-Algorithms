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

---

Your own notes for this week go in `terms/<your-term>/notes/week-01.md`, not here.
This file is the shared plan — improve it if the course changes, but keep it general.
