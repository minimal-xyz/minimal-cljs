
(ns minimal-cljs.core)

(defn -main []
  (enable-console-print!)
  (println "Hello world!"))

(set! (.-onload js/window) -main)
