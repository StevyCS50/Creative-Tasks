Сортировка трех чисел
---

### Допустим, переменные *a, b, c, t* имеют один и тот же числовой примитивный тип. Покажите, что следующий код располагает значения *a, b, c* в порядке возрастания.

```java
if (a > b) { t = a; a = b; b = t; }
if (a > c) { t = a; a = c; c = t; }
if (b > c) { t = b; b = c; c = t; }
```
