(defproject lein-check-stdin "0.4.0-SNAPSHOT"
  :description "Prints errors encountered when reading stdin as clojure code"
  :url "http://example.com/saulshanabrook/lein-check-stdin"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[org.clojure/data.json "0.2.6"]]
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env
                                     :sign-releases false
                                     :password :env}]]
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "v" "--no-sign"] ; disable signing and add "v" prefix
                  ["deploy"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]])
