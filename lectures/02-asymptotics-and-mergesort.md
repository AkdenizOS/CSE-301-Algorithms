# Lecture 2 — Asymptotics, Worst-Case Analysis, and MergeSort

> Stanford CS161 Winter 2026, lecture 2: *Asymptotics, Worst-Case Analysis, and MergeSort* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-2-asymptotics-worst-case-analysis-and-mergesort)

**Previous:** [Lecture 1](01-why-are-you-here.md) · **Next:** [Lecture 3](03-recurrences-and-master-theorem.md)

## Goals
- Analyse an algorithm's running time and express it asymptotically.
- Prove correctness with a loop invariant.
- Design a divide-and-conquer algorithm and analyse it.
- Explain how Strassen beats the naive matrix multiplication bound.

## Key concepts
- Insertion sort as the running example; best, worst and average case.
- **Loop invariant**: initialization, maintenance, termination — the standard correctness proof.
- Asymptotic notation: `Θ`, `O`, `Ω`, `o`, `ω`. `O` is an upper bound, `Θ` is tight — exams punish confusing them.
- The RAM model: what counts as one step.
- Divide-and-conquer preview via merge sort: `T(n) = 2T(n/2) + Θ(n) = Θ(n lg n)`.
- The three steps: divide, conquer, combine.
- **Maximum subarray** in `Θ(n lg n)` by divide and conquer (and `Θ(n)` by Kadane).
- **Strassen's algorithm**: 7 multiplications instead of 8 → `Θ(n^lg7) ≈ Θ(n^2.81)`.
- Binary search, merge sort, and powering a number as the simple cases.

## Reading

- [CLRS — Ch. 1 (the role of algorithms)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=26)
- [CLRS — Ch. 2 (getting started; 2.3 merge sort)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=37)
- [CLRS — Ch. 3 (growth of functions)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=64)
- [CLRS — Ch. 4.1-4.2 (maximum subarray, Strassen)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=86)
- *Algorithms Illuminated* Part I — 1.4, 1.5, 1.6, 2

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture2-pre.pdf)
- Pre-lecture Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture2_pre.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture2_pre.zip)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture2-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/Lecture2.pdf)
- Proof that InsertionSort is Correct: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/CS161Lecture02_handout.pdf)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture2_sorting.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture2_sorting.zip)
- Concept check questions on asymptotics: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/asymptotics.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/asymptotics.pdf)
- Concept check questions on sorting: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/sorting.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/sorting.pdf)

## Practice
- [ ] Prove insertion sort correct with a loop invariant
- [ ] Rank a list of functions by growth rate
- [ ] CLRS 2.1-1..4, 3.1-1..8
- [ ] Implement max-subarray both ways and compare empirically
- [ ] Work through one Strassen step by hand
- [ ] CLRS 4.1, 4.2 exercises

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
