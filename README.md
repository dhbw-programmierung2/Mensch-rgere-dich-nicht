# Gruppenprojekt Mensch ärgere dich nicht - Programmierung II

## Anforderungen an das Projekt
Funktionalität
  -  vollständige Umsetzung der Aufgabenstellung
  -  korrekte Umsetzung der Aufgabenstellung

Zuverlässigkeit
   - ausgereift
   - fehlertolerant

Usability
  -  leicht verständlich
  -  gut bedienbar
  -  Fehlbedienungen durch Nutzer*innen werden in geeigneter Weise abgefangen
  -  ansprechende Benutzeroberfläche

Wartbarkeit
  -  Lesbarkeit des Quellcodes
  -  Durchgängige Kommentare für Teamkolleg*innen und einen selbst (hier sind "normale" Kommentare und nicht Dokumentationskommentare gemeint)
  -  modularer Aufbau
  -  Wiederverwendbarkeit der enthaltenen Komponenten
  -  lose Kopplung, hohe Kohäsion
  -  Responsibility-driven design
  -  Nutzung der besprochenen Konzepte (abstrakte Klassen, Interfaces, Vererbung etc.)
  
  ## JavaDoc und Kommentare
  -   Durchgängigkeit der Dokumentationskommentare
  -  Korrektheit der Kommentare (Beachtung der beschriebenen Regeln)
  -  Nutzung von Javadoc-Tags
  -  Inhalt der Kommentare

## Aufgabenstellung

Programmieren Sie eine Variante des klassischen Würfelspiels Mensch-ärgere-Dich-nicht in Java! 
Dabei sollen die folgenden Regeln umgesetzt werden (diese finden Sie auch in der beigefügten offiziellen Anleitung des Herstellers):
      -  Das Spiel soll von zwei bis sechs Spieler*innen gespielt werden können.
          >  Falls zwei oder vier Spieler*innen spielen, soll das Layout des Spielfelds dem beigefügten Spielfeld für vier                        Personen entsprechen.
          >  Falls drei, fünf oder sechs Spieler*innen spielen, soll das Layout des Spielfelds dem beigefügten Spielfeld für sechs Personen entsprechen. 
           > Es soll sowohl möglich sein, gegen Computergegner als auch gegen menschliche Gegner (am selben Endgerät) zu                      spielen!
           > Beim Spielstart soll ausgewählt werden können, wie viele Gegner es geben soll, ob es sich beim jeweiligen Gegner um einen Menschen oder einen Computergegner handelt und welche Farbe die menschlichen Spieler haben
           > Falls zwei oder drei Spieler*innen spielen, sollte sichergestellt werden, dass diese keine unmittelbar "benachbarte" Farbe auswählen, sondern dass jeweils eine "nicht besetzte" Farbe dazwischen liegt.
      -  Jeder Spieler besitzt vier Figuren seiner Farbe, von denen zu Spielbeginn eine Figur auf das Feld "A" gestellt wird, die anderen drei werden auf Felder im Bereich "B" gestellt.
      -  Um zu bestimmen, wer beginnt, muss zunächst jeder Spieler ein Mal "würfeln". Der Spieler mit der höchsten Zahl darf beginnen, anschließend wird im Uhrzeigersinn nach Position der Farbe auf dem Spielfeld gespielt.
      -  "Der Spieler, der an der Reihe ist, würfelt und setzt seinen Spielstein um die gewürfelte Augenzahl in Pfeilrichtung auf der Laufbahn vor."
      -  Eigene und fremde Figuren können übersprungen werden
      -  Wenn mehrere Spielfiguren auf der Laufbahn stehen, kann ein menschlicher Spieler auswählen, mit welcher davon gefahren werden soll. Ein Computerspieler soll in diesem Fall zufällig auswählen, mit welcher Figur gefahren wird.
      -  Wer am Ende des Spielzugs auf eine fremde Figur trifft, schlägt diese. Geschlagene Figuren werden in den Bereich "B" des jeweiligen Spielers zurückgesetzt, eigene Figuren können nicht geschlagen werden. Wenn alternative Spielzüge möglich sind, müssen weder menschliche Spieler noch Computerspieler zwingend schlagen!
      -  Solange sich im Bereich "B" noch Figuren befinden, muss der jeweilige Spieler so bald wie möglich das Feld "A" räumen.
      -  Die Steine im Bereich "B" können nur dann auf das Feld "A" gesetzt werden, wenn eine 6 gewürfelt wird.
      -  Nach dem Würfeln einer 6 hat der jeweilige Spieler einen weiteren Spielzug frei. Solange noch Figuren im Bereich "B" stehen, muss beim Erzielen einer 6 je eine dieser Figuren ins Spiel gebracht werden. Wenn man mit dem Würfeln einer 6 den letzten Spielstein ins Ziel bringt, muss nicht noch einmal gewürfelt werden!
      -  Nach Durchlaufen der Laufbahn mit der Spielfigur zieht man auf die Zielfelder der eigenen Farbe vor. Wenn die Augenzahl des Wurfs dabei zu groß ist, muss im nächsten Spielzug erneut gewürfelt werden, falls keine 6 gewürfelt wurde.
    Zudem sollen die folgenden Ergänzungsregeln (in der offiziellen Anleitung als "Spielvarianten" bezeichnet) umgesetzt werden: 
       - Dreimal würfeln 
          >  "Wer keinen Spielstein auf der Laufbahn hat, weil alle Steine geschlagen wurden und auf den B-Feldern auf Ihren Einsatz warten, darf dreimal würfeln."
          >  "Das gilt auch, wenn schon ein oder mehrere Figuren ihre Zielfelder erreicht haben, aber nur dann, wenn sie dort nicht noch vorrücken könnten."
       - Überspringen im Ziel verboten
