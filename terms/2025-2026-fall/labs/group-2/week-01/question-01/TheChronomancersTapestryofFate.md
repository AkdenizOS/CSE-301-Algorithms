The Chronomancer's Tapestry of Fate

Story



In a realm beyond time, the Chronomancer Kaelen was tasked with weaving the flow of history on the Tapestry of Fate. Each thread in this tapestry represented a significant historical event. Every event had an Importance Score and a Temporal Flux value, which signified its potential to influence future events. For the tapestry to be balanced, the events had to be woven in ascending order of their Importance Scores.



Kaelen performed this weaving using an ancient technique called the Needle of Time, which followed the logic of an Insertion Sort. He would take the next event in line (the key event) and weave it into its correct position among the events already placed on the tapestry.



However, reweaving time came at a perilous cost. When a key event had to move past a more significant event (a thread with a higher Importance Score) to find its rightful place in fate, a paradox storm would erupt. This interaction did not alter the key event's Importance Score, but it would permanently erode its influence on the future—its Temporal Flux.



The cost of the paradox was this for every more important event the key event moved past, its own Temporal Flux would be diminished by the difference in their Importance Scores.



Kaelen's task was to foresee the final Temporal Flux value of each thread after weaving all the events into their correct sequence.



Task (Problem Definition)



You are given two initial arrays for N historical events



EventImportance An integer array containing the initial importance score of each event.



TemporalFlux An integer array containing the initial potential of each event to influence the future. (EventImportance\[i] and TemporalFlux\[i] belong to the same event.)



Your goal is to sort the EventImportance array in ascending order while synchronously updating the TemporalFlux array. You must use the Insertion Sort algorithm.



The key rule of the algorithm is as follows as a key event (EventImportance\[i]) is being inserted into its correct place in the sorted subarray, for every element EventImportance\[j] that is greater than the key and is shifted to the right, the key event's TemporalFlux value is permanently modified



The key's TemporalFlux value is decreased by the difference (EventImportance\[j] - key\_importance).



The key's EventImportance value does not change during this process.



Required Output



The final TemporalFlux array after the sorting process is complete. (The EventImportance array must also be sorted.)



Example Scene



Scene 1

Initial EventImportance Array \[60, 25, 40]

Initial TemporalFlux Array \[10, 20, 15]

Expected Output \[-15, -5, 10]



Explanation (Insertion Sort Steps and Value Changes)



Initial State

Importance = \[60, 25, 40], Flux = \[10, 20, 15]



i = 1 Processing key\_importance = 25, key\_flux = 20.



Importance\[0] (60)  key\_importance (25). A shift is required.



Interaction The key\_flux is reduced by the difference in importance.



Paradox Cost = Importance\[0] - key\_importance = 60 - 25 = 35.



key\_flux = 20 - 35 = -15.



The pair (60, 10) is shifted to the right.



The updated key pair (25, -15) is inserted at the beginning.



Result Importance = \[25, 60, 40], Flux = \[-15, 10, 15].



i = 2 Processing key\_importance = 40, key\_flux = 15.



Importance\[1] (60)  key\_importance (40). A shift is required.



Interaction The key\_flux is reduced by the difference in importance.



Paradox Cost = Importance\[1] - key\_importance = 60 - 40 = 20.



key\_flux = 15 - 20 = -5.



The pair (60, 10) is shifted to the right.



Importance\[0] (25)  key\_importance (40), so the loop stops.



The updated key pair (40, -5) is inserted at index 1.



Result Importance = \[25, 40, 60], Flux = \[-15, -5, 10].



Sort complete. Final TemporalFlux Array \[-15, -5, 10]

