
(set-env!
  :source-paths #{"src/"}
  :asset-paths #{"assets/"}
  :dependencies '[[org.clojure/clojurescript "1.9.216"     :scope "test"]
                  [org.clojure/clojure       "1.8.0"       :scope "test"]
                  [adzerk/boot-cljs          "1.7.228-1"   :scope "test"]])

(require '[adzerk.boot-cljs   :refer [cljs]])

(deftask build []
  (comp
    (cljs)
    (target)))
