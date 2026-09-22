# Lecture 8 — Hashing

> Stanford CS161 Winter 2026, lecture 8: *Hashing* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-8-hashing)

**Previous:** [Lecture 7](07-binary-search-trees-and-red-black-trees.md) · **Next:** [Lecture 9](09-graphs-bfs-and-dfs.md)

## Goals
- Explain why hashing gives expected `O(1)` operations and what can go wrong.
- Choose between chaining and open addressing.

## Key concepts
- Hash table with **chaining**: expected `Θ(1 + α)` per operation, `α = n/m` the load factor.
- Any fixed hash function has a bad input; **universal hashing** picks the function at random.
- Universal family: `Pr[h(x) = h(y)] ≤ 1/m` for `x ≠ y`.
- **Open addressing**: linear probing, quadratic probing, double hashing.

## Reading

- [CLRS — Ch. 11 (hash tables)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=274)
- *Algorithms Illuminated* Part II — 12

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture8-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture8-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/Lecture8.pdf)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture8_hashing.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture8_hashing.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/hashing.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/hashing.pdf)

## Practice
- [ ] Show an adversarial input for `h(x) = x mod m`
- [ ] Prove the expected chain length under universal hashing
- [ ] CLRS 11.2, 11.3 exercises

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
