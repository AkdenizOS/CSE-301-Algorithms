# Week 2 — Solving Recurrences

> Topic: *Solving Recurrences*

**Previous:** [Week 1](01-analysing-and-designing-algorithms.md) · **Next:** [Week 3](03-divide-and-conquer.md)

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

- [CLRS — Ch. 4.3-4.6 (substitution, recursion tree, master method)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=86)

## Practice
- [ ] Solve 10 recurrences, at least 3 falling in a master-theorem gap
- [ ] CLRS 4.3, 4.4, 4.5 exercises

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
- [ ] Exercises done

---

Your own notes for this week go in `terms/<your-term>/notes/week-02.md`, not here.
This file is the shared plan — improve it if the course changes, but keep it general.
