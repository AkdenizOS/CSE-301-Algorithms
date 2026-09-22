# Lecture 3 — Solving Recurrences and the Master Theorem

> Stanford CS161 Winter 2026, lecture 3: *Solving Recurrences and the Master Theorem* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-3-solving-recurrences-and-the-master-theorem)

**Previous:** [Lecture 2](02-asymptotics-and-mergesort.md) · **Next:** [Lecture 4](04-median-and-selection.md)

## Goals
- Solve a recurrence by substitution, recursion tree, and the master method.
- Know when the master theorem does not apply.

## Key concepts
- **Substitution**: guess the bound, prove it by induction. The guess is the hard part.
- **Recursion tree**: sum the cost per level; use it to produce a guess for substitution.
- **Master theorem** for `T(n) = aT(n/b) + f(n)`: compare `f(n)` with `n^(log_b a)`.
-   Case 1 `f = O(n^(log_b a − ε))` → `Θ(n^(log_b a))`. Case 2 `f = Θ(n^(log_b a))` → `Θ(n^(log_b a) lg n)`. Case 3 `f = Ω(n^(log_b a + ε))` **and** regularity → `Θ(f(n))`.
- The gaps: when `f` sits between cases (e.g. `n lg n` vs `n`), the master theorem is silent.
- Changing variables for recurrences like `T(n) = 2T(√n) + lg n`.

## Reading

- [CLRS — Ch. 4.3 (substitution method)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=104)
- [CLRS — Ch. 4.4 (recursion tree)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=109)
- [CLRS — Ch. 4.5 (master method)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=114)
- *Algorithms Illuminated* Part I — 4

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture3-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture3-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture3-slides.pdf) [PowerPoint](https://stanford-cs161.github.io/winter2026/assets/files/lecture3-slides.pptx)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/recurrence.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/recurrence.pdf)

## Practice
- [ ] Solve 10 recurrences, at least 3 falling in a master-theorem gap
- [ ] CLRS 4.3, 4.4, 4.5 exercises

## Checklist
- [ ] Pre-lecture exercise done
- [ ] Lecture attended
- [ ] Textbook section read
- [ ] Notebook done
- [ ] Concept check done
- [ ] Lab done
- [ ] Exercises done

## From past terms

**Slides (2025-2026 Fall)**
- [lecture03.pdf](../resources/2025-2026-fall/slides/lecture03.pdf) — solving recurrences

**Past exam questions**
- [2019-2020 Q2](../exams/2019-2020/questions-Q2.jfif) — `T(n) = T(√n) + 1` solved by iteration
- [Bilkent CS473 — recurrence relations](../resources/bilkent/Recurrence%20Relations_cs473.final_2.pdf) · [asymptotics and recurrences (make-up)](../resources/bilkent/asymptotic_recurrence_cs473.makeup_1.pdf)

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
