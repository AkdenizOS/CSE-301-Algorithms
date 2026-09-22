# Lecture 16 — Max-Flow and the Ford-Fulkerson Algorithm

> Stanford CS161 Winter 2026, lecture 16: *Max-Flow and the Ford-Fulkerson Algorithm* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-16-max-flow-and-the-ford-fulkerson-algorithm)

**Previous:** [Lecture 15](15-minimum-spanning-trees.md) · **Next:** [Lecture 17](17-stable-matchings-and-gale-shapley.md)

## Goals
- Compute a maximum flow with Ford-Fulkerson and certify it with a minimum cut.

## Key concepts
- Flow network: capacities, conservation; value of a flow.
- **Residual graph** and **augmenting paths**.
- **Max-flow min-cut theorem**: max flow value = min cut capacity.
- Ford-Fulkerson `O(E·|f*|)` with integer capacities; Edmonds-Karp (BFS paths) `O(VE²)`.
- Reductions to max-flow: bipartite matching.

## Reading

- [CLRS — Ch. 26.1-26.3 (flow networks, Ford-Fulkerson, bipartite matching)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=730)
- [Alexander Schrijver — On the history of the transportation and maximum flow problems](https://homepages.cwi.nl/~lex/files/histtrpclean.pdf)

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture16-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture16-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture16-slides.pdf) [PowerPoint](https://stanford-cs161.github.io/winter2026/assets/files/lecture16-slides.pptx)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/maxflow.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/maxflow.pdf)

## Practice
- [ ] Run Ford-Fulkerson by hand on a 6-vertex network and find the min cut
- [ ] Reduce bipartite matching to max-flow
- [ ] CLRS 26.1, 26.2, 26.3 exercises

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
