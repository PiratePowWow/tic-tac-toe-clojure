(ns tic-tac-toe-clojure.core
  (:gen-class))

(def board [[:e :e :e]
            [:e :e :e]
            [:e :e :e]])

(defn solve [x]
  (let [[[a b c]
         [d e f]
         [g h i]] x
        solutions (hash-set
                    [a b c]
                    [d e f]
                    [g h i]
                    [a d g]
                    [b e h]
                    [c f i]
                    [a e i]
                    [g e c])]
    (cond
      (contains? solutions [:x :x :x]) :x
      (contains? solutions [:o :o :o]) :o
      :else nil)))
    


(defn -main []
  (println "Hello, World!"))
