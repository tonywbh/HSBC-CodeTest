(ns validate-parentheses.core
  (:gen-class))

(defn insert [symbol]
  (def input (conj input symbol)))

(defn judge [symbol]
  (if (= symbol (get input (dec (count input))))
    (def input (pop input))
    (def flag 1)))

(defn validate [s]
  (def input (vector))
  (def flag 0)
  (loop [i 0]
    (when (and (< i (count s)) (= flag 0))
      (let [{x i} s]
        (case (format "%s" x)
          "(" (insert (format "%s" x))
          ")" (judge "(")
          "[" (insert (format "%s" x))
          "]" (judge "[")
          "{" (insert (format "%s" x))
          "}" (judge "{")
          ())
        (recur (inc i)))))
  ;(println input)
  (println (if (and (= flag 0) (empty? input)) "true" "false")))

(defn -main
  [& args]
  (println "Please input the string: ")
  (let [reader (java.io.BufferedReader. *in*)
        s (.readLine reader)]
    (validate s)))