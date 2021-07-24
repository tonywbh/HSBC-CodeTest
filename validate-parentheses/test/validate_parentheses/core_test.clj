(ns my-test.core-test
  (:require [clojure.test :refer :all]
            [validate-parentheses.core :refer :all]))

(deftest test1
  (testing "Failed"
    (true? (validate "()"))))

(deftest test2
  (testing "Failed"
    (true? (validate "()[]{}"))))

(deftest test3
  (testing "Failed"
    (false? (validate "(]"))))

(deftest test4
  (testing "Failed"
    (false? (validate "([)]"))))

(deftest test5
  (testing "Failed"
    (true? (validate "{[]}"))))

(deftest test6
  (testing "Failed"
    (false? (validate "{[}]()"))))