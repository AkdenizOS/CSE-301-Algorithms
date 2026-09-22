# CSE 301 — Algorithms

Akdeniz University · Computer Engineering (English) · Fall

**An open study archive for this course.** It collects the syllabus, a week-by-week
study plan linked to exact textbook pages, past exam papers going back to 2019,
worked implementations in Java and Python, and the coursework of the students who
took the course before you.

Anyone taking CSE 301 can study from it. If you take the course, your notes belong
here too — see [Taking notes](#taking-notes).

## How to study with this repository

**1. Start from the week you are in.** [`weeks/`](weeks/) has one note per week,
built from the official course outline. Each note lists the goals, the key concepts
with their actual definitions, what to read, and what to practice — and, under
`## From past terms`, the slides, labs, exam questions and code from earlier years
that cover the same topic.

**2. Follow the reading links.** They open the textbook at the exact page:

> [CLRS — Ch. 7 (quicksort)](resources/books/clrs-introduction-to-algorithms-3e.pdf#page=191)

No searching for chapters. In Obsidian the PDF opens at that page; on GitHub it
opens the file.

**3. Do the practice list, then check the box.** The `- [ ]` items are clickable in
Obsidian's reading mode, so the week note doubles as your progress tracker.

**4. Write under your own `## Notes — <Name> (<term>)` heading at the bottom of the
week note.** That section is yours. Everything above it is the shared plan.

**5. Before an exam, go to [`exams/`](exams/README.md).** It has real papers from
2019 onward, one folder per academic year. [`exams/practice/`](exams/practice/) has
practice sets with solutions. [`exams/prep/`](exams/prep/) holds compiled analyses
written by previous students.

**6. When you get stuck on an implementation**, [`code/`](code/) has working Java and
Python versions of nearly every algorithm in the course, and
[`exercises/`](exercises/) has past problems with solutions.

## Layout

```
README.md        This page
course-info.md   Resource map (CLRS page offsets), Fall 2025-2026 outline, pseudocode convention, glossary
weeks/NN-*.md    One file per week: the shared plan on top, links to past-term material, everyone's notes below
exams/           Past papers by academic year (2019-2020 … 2025-2026, undated), practice/ sets, prep/ analyses
resources/       books/, bilkent/, lecture-notes/, and resources/<term>/ for what an instructor issued that term
code/            Java and Python implementations (java/, python/)
exercises/       Named problem collections, the Crazy Eights case study, practice solutions, problem statements
assignments/     Coursework, one folder per <term>-<person>; see assignments/README.md
```

`code/java/algorithms/` is a buildable project whose packages follow its folder
layout — do not move files inside it.

## Taking notes

Open the week, scroll to the bottom, write under your own heading:

```markdown
## Notes — <Name> (<term>)
### Lecture
### Worked out by hand
### Questions
### Exam-worthy
```

Add your heading below the existing ones and never edit someone else's section —
different sections merge in git without conflicts. Everything under your own
heading is **yours**. The shared plan at the top of the week is not — if the course
changed, fix it there so the next person gets the corrected version.

## Who changes what

| What | Who edits it | When |
|------|-------------|------|
| Top of `weeks/NN-*.md` (goals, reading, practice, from past terms) | **anyone** | Only when the course itself changes — a new topic, a better reading, a correction. Never for personal notes. |
| `## Notes — <you>` in a week file | **only you** | Every week. This is your notebook. |
| `course-info.md`, `exams/README.md` | **anyone** | When you learn something durable: a new exam pattern, a better source. |
| `assignments/<term>-<you>/` | **only you** | Your assignments, projects, submissions. Use a lowercase, hyphenated name — `2026-2027-fall-efe-kurucay`, not `Efe Kuruçay`. Material from a term whose author is not known goes in `assignments/<term>-unattributed/`. |
| `resources/<term>/` | **anyone in that term** | Slides, syllabus and lab sheets the instructor issued that term — they are the same for everyone taking the course that term. |
| `exams/<YYYY>-<YYYY>/` | **anyone** | When you get hold of a new paper — blank or answered. Put the writer's surname in the filename (`final-answered-altungoz.pdf`). Exam papers never go under `assignments/`. |

Two students in different years never touch the same file except to improve the
shared plan — which is the point.

If you take the course in a new term, add a row to the table below naming the
instructor and the dates, and if the course outline changed, update `weeks/` — that
is the shared plan and it should reflect reality. Keep `weeks/` and
`course-info.md` general; keep anything personal, dated or term-specific in
`assignments/<term>-<you>/` or `resources/<term>/`.

## Terms

| Term | Instructor | What exists |
|------|-----------|-------------|
| Fall 2025-2026 | Hüseyin Gökhan Akçay | [resources/2025-2026-fall/](resources/2025-2026-fall/): syllabus, 12 lecture slide decks plus `dp_examples.pdf` (`excluded-from-2025-final/` holds lecture08 and lecture09, dropped from the final's scope), lab questions for 4 groups plus pre-lab exercises, biweekly contest, standalone exercises. Outline and grading in [course-info.md](course-info.md#fall-2025-2026-as-taught). Graded final pages in [exams/2025-2026/](exams/2025-2026/). Efe's contest assignment with Burak Yalçın in [assignments/2025-2026-fall-efe-kurucay/](assignments/2025-2026-fall-efe-kurucay/). |
| Fall 2026-2027 | TBD — fill in during week 1 | Schedule TBD · Midterm TBD · Final TBD. Student guide in [resources/2026-2027-fall/](resources/2026-2027-fall/). Efe — notes in every week file. Exam papers from this term go in `exams/2026-2027/`. |
| undated | unknown | Student submissions, reference homeworks, an analysis assignment and 2023 scans in [assignments/undated-unattributed/](assignments/undated-unattributed/) — see [assignments/README.md](assignments/README.md). One student's week 1 notes are in [weeks/01](weeks/01-analysing-and-designing-algorithms.md#notes--unknown-student-undated). Undated exam paper in [exams/undated/](exams/undated/). |


## Textbook

Primary: **CLRS, _Introduction to Algorithms_, 3rd edition** —
[`resources/books/clrs-introduction-to-algorithms-3e.pdf`](resources/books/clrs-introduction-to-algorithms-3e.pdf).
Every reading link in `weeks/` points into it. A Turkish translation and the 4th
edition are in the same folder, plus Sedgewick-Wayne and Kleinberg-Tardos.

## Grading (Fall 2026-2027)

From the instructor's [student guide](resources/2026-2027-fall/Algorithms_Student_Guide.pdf):

| Component | Weight |
|-----------|--------|
| Labs | 45% |
| Midterm | 15% |
| Final | 40% |
| Attendance bonus | up to +10 points on the final |

- Attendance points are earned during the semester; no extra-point requests at the end.
- Lab rules are announced separately by the TA, Ömer Kuru — required reading.
- No AI tools in exams.
- The guide follows the lecture schedule and resources of
  [Stanford CS161, Winter 2026](https://stanford-cs161.github.io/winter2026/lectures/):
  pre-lecture exercise, notes and slides, Python notebook, concept checks, readings
  (CLRS, *Algorithms Illuminated*), recording.

Fall 2025-2026 used Lab 25% · Assignment 10% · Midterm 25% · Final 40% — see
[course-info.md](course-info.md#fall-2025-2026-as-taught).

The topic list in [`weeks/`](weeks/) is derived from the Fall 2025 course outline
(the most recent one on record, in
[`course-info.md`](course-info.md#fall-2025-2026-as-taught) and
[`resources/2025-2026-fall/syllabus.pdf`](resources/2025-2026-fall/syllabus.pdf)). If
your term's outline differs, update `weeks/` — it is the shared plan and should
reflect reality.

## Academic integrity

Previous students' submissions are here as **reference**, not as answers to copy.
Copying them is academic fraud and the course syllabus is explicit about the
consequences. Read them the way you would read a solved example — then close the
file and write your own.
