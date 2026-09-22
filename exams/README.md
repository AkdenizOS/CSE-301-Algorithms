# Exams

Every exam paper for this course, blank or answered, organized by academic year.
Answered papers keep the writer's name in the filename. Nothing is dated by
guesswork — if the year could not be established, it is in [`undated/`](undated/).
Sub-folders inside a year are folded into the filename: `2023-2024/midterm-*.jpeg`,
`2019-2020/questions-*`.

| Term | Files | What it is |
|------|-------|-----------|
| [2019-2020](2019-2020/) | `exams-2019.pdf`, `midterm-solutions.pdf`, `questions-Q1.1.jfif` … `questions-Q5.txt` | A collected exam set, partial midterm solutions, five loose questions |
| [2020-2021](2020-2021/) | `midterm.pdf`, `midterm-alt.pdf`, `final.pdf`, `makeup.pdf`, `single-course-exam.pdf` + three **answered** papers | The fullest year. Berkcan Altungöz's graded midterm and final, and Mert Karababa's graded final |
| [2021-2022](2021-2022/) | `final.pdf`, `final-alt.pdf` | Two final papers |
| [2023-2024](2023-2024/) | `midterm-*.jpeg` (6), `final-*.jpeg` (1), `makeup-*.jpg` (4), `screenshot.png` | Photographed papers |
| [2025-2026](2025-2026/) | `final-answered-page-1.jpeg`, `-2.png` | Pages 1-2 of a graded final, *30/12/2025, 115 minutes*. Page 1 "Mario's Chick Rescue Detours" (DP), page 2 "Company Hiring Split" (DP + greedy). The name on the paper is obscured in the photograph |
| [undated](undated/) | `final-transcribed.md` | A five-question final transcribed to Markdown with LaTeX. Its original filename hinted at 2024 but that is not proof |

Answered papers are one student's attempt, not an official solution key. Read them
that way.

## Midterm

In the CS161 order the midterm comes after [lecture 10](../lectures/10-strongly-connected-components.md)
and covers lectures 1-10. Weight: 15% in Fall 2026-2027 (25% in Fall 2025).

- Scope in Fall 2025: weeks 1-6 — asymptotics, recurrences, divide and conquer, quicksort, selection.
- Fall 2025 had no lecture in week 7 (Cumhuriyet Bayramı). Catch up. This is the buffer week before the midterm.

### Preparation
- [ ] Rework everything from the lectures before the midterm
- [ ] Start on the past midterms below
- [ ] See [prep/](prep/) and the past papers below

### Past midterms

- [2019-2020 midterm solutions](2019-2020/midterm-solutions.pdf)
- [2020-2021 midterm](2020-2021/midterm.pdf) · [alternate](2020-2021/midterm-alt.pdf) · [answered (Altungöz)](2020-2021/midterm-answered-altungoz.pdf)
- 2023-2024 midterm photos: [1](2023-2024/midterm-WhatsApp%20Image%202024-01-06%20at%2013.32.31%20%282%29.jpeg) · [2](2023-2024/midterm-WhatsApp%20Image%202024-01-06%20at%2013.32.31%20%283%29.jpeg) · [3](2023-2024/midterm-WhatsApp%20Image%202024-01-06%20at%2013.32.31.jpeg) · [4](2023-2024/midterm-WhatsApp%20Image%202024-01-06%20at%2013.32.32%20%281%29.jpeg) · [5](2023-2024/midterm-WhatsApp%20Image%202024-01-06%20at%2013.32.32%20%282%29.jpeg) · [6](2023-2024/midterm-WhatsApp%20Image%202024-01-06%20at%2013.32.32.jpeg)
- [Undated midterm practice](../assignments/undated-unattributed/analysis-assignment/AlgorithmsMidtermPractice.pdf) · [Bilkent midterm cheat sheet](../resources/bilkent/Midterm_cheat_sheet.pdf)

## Practice and prep

| Path | What it is |
|------|-----------|
| [`practice/`](practice/) | Practice quizzes, finals and examples with solutions — not real papers. `Example1-4.pdf` are DFS quizzes and assignments (EECS 340); most of the rest (`quiz1`, `quiz2`, `final`, …) are MIT 6.046 quizzes and finals, `midterm.solutions.pdf` is Yale CS 365 |
| [`prep/`](prep/) | Compiled analyses and exam-preparation notes written by previous students: transcribed lectures and papers (`10-11.md`, `bk.md`, `ex.md`, `but.md`, `mu.md`, `final.md`, `analysproof.md`), the final's question structure (`algorithm-Final.txt`), and Bütwork answers (`butwork-README.md`) |
| [`../resources/bilkent/`](../resources/bilkent/) | Bilkent CS473 exams — harder than this course, good stretch practice |

Each lecture file in [`../lectures/`](../lectures/) lists, under `## From past terms`, the
exam questions from this folder that match its topic.

## Adding a paper

File it under the academic year it was sat: `exams/<YYYY>-<YYYY>/`. Use
`midterm.pdf`, `final.pdf`, `makeup.pdf` for blank papers, and
`final-answered-<surname>.pdf` when it is somebody's graded answers.

Exam papers live here regardless of whose they are — they are study material, and
this is where you look when preparing. Only coursework you produced yourself
(assignments, projects, notes) goes under `assignments/<term>-<you>/`.
