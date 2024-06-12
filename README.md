### Strategy Pattern

Wzorzec Strategia jest behawioralnym wzorcem projektowym, który znajduje zastosowanie w sytuacjach, gdy istnieje potrzeba wielu możliwych implementacji danego zachowania. Porządkuje on taką sytuację, oddzielając implementacje konkretnego zachowania od siebie oraz powiązując je poprzez wspólny interfejs. 

Ten interfejs jest używany w polu klasy kontekstowej strategii, gdzie poprzez metodę `setStrategy()` można ustawić konkretną implementację w zależności od potrzeby. Takie podejście pozwala na modelowanie kodu aplikacji w sposób zgodny z zasadami **Single Responsibility Principle (SRP)** i **Open/Closed Principle**.

### Konstruktor vs. Setter
Strategia może być wstrzykiwana do kontekstu zarówno przez konstruktor, jak i przez metodę setter. 

- **Wstrzykiwanie przez konstruktor**: Gwarantuje niezmienność, co oznacza, że strategia jest ustalana raz podczas tworzenia obiektu kontekstowego i nie może być zmieniona. Jest to korzystne, gdy wymagana jest pewność co do używanej strategii przez cały czas życia obiektu.

- **Wstrzykiwanie przez setter**: Zapewnia większą elastyczność, ponieważ pozwala na dynamiczną zmianę strategii w trakcie życia obiektu kontekstowego. Jest to bardziej odpowiednie, gdy aplikacja musi reagować na zmieniające się warunki i dostosowywać swoje zachowanie bez konieczności tworzenia nowych obiektów kontekstowych.
