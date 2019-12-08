# gender-detector

Guess gender from first name.

## Usage

```clojure
(require '[gender-detector.core :refer [guess-gender]])

(guess-gender "Örjan")
=> :male

(guess-gender "aaf")
=> :mostly-female

(guess-gender "Emma")
=> :female

(guess-gender "Pauley")
=> :unknown
```

Valid values are `#{:male :female :mostly-male :mostly-female :unknown}`

## License

Copyright © 2014 Erik Strömberg

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
