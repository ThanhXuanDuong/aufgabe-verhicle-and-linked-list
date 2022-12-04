
# Aufgabe Vehicle

Erstelle ein Interface Accelerateable
- mit der Methoden Definition int accelerate(int kmh)
Erstelle eine abstrakte Klasse Vehicle
- lasse diese Klasse das Interface Implementieren
-und den Eigenschaften:
  +id
  +name
  +velocity
  
Erstelle eine konkrete Klasse Auto welche von der Klasse Vehicle erbt
- implementiere die Methode accelerate so das:
- die Geschwindikeit vom Auto erhört wird,
- die neue Endgeschwindigkeit zurückgegeben wird
- und eine entsprechende Ausgabe im Terminal kommt.

Erstelle eine konkrete Klasse Fahrrad welche von der Klasse Vehicle erbt
- implementiere die Methode accelerate so das:
- die Geschwindikeit vom Fahrrad nur dann erhöht wird, wenn die Geschwindigkeit unter 35kmh bleibt, ansonsten schmeiß eine entsprechende Fehlermeldung,
- Die neue Endgeschwindigkeit zurückgegeben wird
- und eine entsprechende Ausgabe im Terminal kommt.

# Aufgabe Linked List

Schreibe eine Klasse AnimalListItem mit
- einer Variable value vom Typ Animal
- einer Variable next vom Typ AnimalListItem
- einem Konstruktor mit value als Parameter

Schreibe eine Klasse AnimalList mit
- einer Variable head vom Typ AnimalListItem, die den Anfang der Liste speichert
- einer Methode toString, welche die Liste, wenn sie die Elemente a, b und c enthält, wie folgt als String zurückgibt: “a -> b -> c”
- einer Methode add mit einem Animal als Parameter, die ein Element an die Liste anhängt

🏋️ BONUS: einer Methode remove mit einem Animal als Parameter, die alle entsprechenden Animals entfernt Schreibe entsprechende Tests!
