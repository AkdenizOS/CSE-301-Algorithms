# Lecture 7 — Binary Search Trees and Red-Black Trees

> Stanford CS161 Winter 2026, lecture 7: *Binary Search Trees and Red-Black Trees* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-7-binary-search-trees-and-red-black-trees)

**Previous:** [Lecture 6](06-bucketsort-and-sorting-lower-bounds.md) · **Next:** [Lecture 8](08-hashing.md)

## Goals
- Implement search, insert and delete on a binary search tree and state their cost in terms of height.
- Explain how red-black trees keep the height `O(lg n)`.

## Key concepts
- **BST property**: left subtree < node < right subtree; in-order walk gives sorted order.
- Search, min, max, successor, insert, delete all run in `O(h)`; `h` can be `n` if unbalanced.
- **Red-black tree** rules: every node red or black, root black, no red node has a red child, every root-to-NIL path has the same number of black nodes.
- Those rules force `h ≤ 2 lg(n + 1)`.
- **Rotations** restore the rules after insert/delete in `O(1)` each, `O(lg n)` total.

## Reading

- [CLRS — Ch. 12.1-12.3 (binary search trees)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=307)
- [CLRS — Ch. 13 (red-black trees)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=329)
- *Algorithms Illuminated* Part II — 11

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture7-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture7-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture7-slides.pdf) [PowerPoint](https://stanford-cs161.github.io/winter2026/assets/files/lecture7-slides.pptx)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/bst.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/bst.pdf)

## Practice
- [ ] Insert 10 keys into a BST, then delete a node with two children
- [ ] Insert 1..8 into a red-black tree by hand, recolouring and rotating
- [ ] CLRS 12.1, 12.2, 12.3, 13.1-13.3 exercises

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
