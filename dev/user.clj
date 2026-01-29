(ns user
  (:require [clojure.tools.namespace.repl :refer [refresh]]
            [core.hello :refer :all]))

(defn reset [] (refresh))

(in-ns 'core.hello)
