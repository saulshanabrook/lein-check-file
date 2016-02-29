(ns leiningen.check-file
  "Check syntax and warn on reflection."
  (:require [leiningen.core.eval :as eval]))

(defn check-file
  "Check syntax and warn on reflection."
  [project path]
  (eval/eval-in-project project
                        `(try
                          (with-out-str (load-file ~path))
                          (catch java.lang.RuntimeException ~'e
                            (println (.line ~'e) ":" (.getMessage (.getCause ~'e)))))))
