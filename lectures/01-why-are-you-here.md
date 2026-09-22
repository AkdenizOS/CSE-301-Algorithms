# Lecture 1 — Why Are You Here? — Karatsuba Multiplication

> Stanford CS161 Winter 2026, lecture 1: *Why are you here?* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-1-why-are-you-here)

**Next:** [Lecture 2](02-asymptotics-and-mergesort.md)

## Goals
- Explain what the course is about: designing algorithms, proving them correct, analysing them.
- Follow Karatsuba's divide-and-conquer integer multiplication and why it beats the grade-school method.

## Key concepts
- Grade-school multiplication of two n-digit numbers takes `Θ(n²)` digit operations.
- Divide and conquer: split each number in half, recurse on the pieces, combine.
- **Karatsuba**: 3 recursive multiplications instead of 4 → `T(n) = 3T(n/2) + O(n) = O(n^lg3) ≈ O(n^1.585)`.
- "Can we do better?" — the question every lecture asks.

## Reading

- *Algorithms Illuminated* Part I — 1.1, 1.2, 1.3, 3.1 (not in this repository)

## CS161 resources

- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture1-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/Lecture1.pdf)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture1_karatsuba.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture1_karatsuba.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/multiplication.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/multiplication.pdf)

## Practice
- [ ] Multiply two 4-digit numbers with Karatsuba by hand
- [ ] Write the recurrence for the naive split (4 multiplications) and for Karatsuba; compare

## Checklist
- [ ] Pre-lecture exercise done
- [ ] Lecture attended
- [ ] Textbook section read
- [ ] Notebook done
- [ ] Concept check done
- [ ] Lab done
- [ ] Exercises done

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
