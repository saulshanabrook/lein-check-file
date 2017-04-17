(ns leiningen.check-stdin
  "Check syntax and warn on reflection."
  (:require [leiningen.core.eval :as eval]
            [clojure.data.json :as json]))

(defn check-stdin
  "Check syntax and warn on reflection."
  [project]
  (eval/eval-in-project project
                        `(try
                          (with-out-str (load-string (slurp *in*)))
                          (catch java.lang.RuntimeException e#
                            (println
                              (json/write-str
                                {:line (.line e#)
                                 :file (or (.source e#) "")
                                 :message (.getMessage (.getCause e#))}))))))
