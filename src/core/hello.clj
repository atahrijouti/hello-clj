(ns core.hello)

(defn say-hello [] (println "Hi. I said hello didn't I?"))

(defn -main []
  (println "hello clj"))

(comment
  (require '[core.hello :as h])
  (def x 0)
  (def x (inc x))
  (println x)
  (h/say-hello)
  (-main)

  (core.hello/say-hello))
