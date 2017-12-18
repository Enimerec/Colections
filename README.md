# Kolekcje

## W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?

* Na szczycie hierarchi jest Collections
* Pochodznymi interfejsu sa list, set, queue, deque
* Interfejs map nie znajduje sie w powyzszej hierarcjhi
* Interfejs SortedSet, SortedMap umożliwiaja przechowywanie posortowanych kolekcji

## Jakie są podstawowe implementacje poszczególnych interfejsów?

* Implementacjami interfejsu List są: ArrayList, LinkList
* Implementacjami interfejsu Set są: HashSet, TreeSet, LinkedHashSet
* Implementacje interfejsu Queue: LinkList, LinkedBlockingQueue, 
ArrayBlockingQueue, PririorityBlockingQueue, DelayQueue, 
SynchronousQueue
* Implementajce interfejsu Deque: LinkedBlockingDeque, LinkList
* Implementacje interfejsu Map: HashMap, TreeMap, LinkedHashMap

## W których kolekcjach elementy są sortowane i w jaki sposób?

* Interfejsy SortedSet, SortedMap przechowuja posortowane obiekty, 
wykorzystywany jest naturalny porzadek obiektów lub wskazany komparator. 
Implementacjami sa TreeSet i Tree Map.

## Implementacje interfejsu List – złożoność operacji

* Klasa ArrayList wykorzystuje wewnetrznie implementacje tablicową.
* Klasa LinkedList wykorzystuje wewnetrznie implementacje dowiązaniową.
* Różnice pojawiaja sie podczas wykonywanie operacji odczytywania i-tego elementu listy
, dodawania elementu na poczatek listy, usuwania elementu z początku listy.

## Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy

* Zaimplementowac metody: dodawanie n elementów na poczatek listy, usuwanie n elementow z poczatku listy,
odczytywanie wszystkich n elementów listy, metody przyjmuja parametr 
typu List<Integer>
* Porównać czas wykowania powyszych metod dla LinkedList i ArrayList
## Do których kolekcji można wstawiać wartości null?

## Napisać operacje wykorzystującą różne implementacje Set i sprawdzić różnice w operacjach dodawania do zbioru