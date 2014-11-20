(ns gender-detector.core-test
  (:require [clojure.test :refer :all]
            [gender-detector.core :refer :all]))

(def test-line1 "F  Jenny                      424 1  26 5431325473                              1     $")
(def test-line2 "M  Jos� Mar�a                       8                                                 $")
(def test-line3 "?F Aaf                                  1                                             $")
(def test-line4 "M  �dne                      +                 1                                      $")

(deftest core-test
  (is (= :male (guess-gender "Örjan")))
  (is (= :female (guess-gender "Lisa")))
  (is (= :mostly-female (guess-gender "Aaf")))
  (is (= :unknown (guess-gender "Pauley")))
  (is (= ["Jenny" "F" 7] (parse-line test-line1)))
  (is (= ["Jos� Mar�a" "M" 8] (parse-line test-line2)))
  (is (= ["Aaf" "?F" 1] (parse-line test-line3)))
  (is (= ["�dne" "M" 1] (parse-line test-line4))))
