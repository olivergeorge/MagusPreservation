(ns cnd-magus.magus-c-test
  (:require [clojure.test :refer [deftest is testing]]
            [clojure.test.check :as tc]
            [clojure.test.check.results :as tcr]
            [clojure.test.check.clojure-test :as tcct]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [cnd-magus.magus-c :refer [Rand]]))

(def Rand-range-property
  (prop/for-all [x gen/small-integer]
    (let [n (Rand x)]
      (if (pos? x)
        (and (nat-int? n) (< n x))
        (= 0 n)))))

(deftest Rand-test
  (is (= 0 (Rand -1)))
  (is (tcct/assert-check (tc/quick-check 100 Rand-range-property))))

(comment
  (tc/quick-check 100 Rand-range-property)
  (tcr/result-data (tc/quick-check 100 Rand-range-property))
  (clojure.test/run-tests))