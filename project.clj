(defproject lein-check-stdin "0.2.0"
  :description "Prints errors encountered when reading stdin as clojure code"
  :url "http://example.com/saulshanabrook/lein-check-stdin"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :sign-releases false}]])
