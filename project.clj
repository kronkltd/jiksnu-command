(defproject net.kronkltd/jiksnu-command "0.1.0-SNAPSHOT"
  :description "Command Module for Jiksnu"
  :url "https://github.com/duck1123/jiksnu-command"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[codox          "0.8.10"]
            [lein-midje     "3.1.3"]]
  :dependencies [
                 [net.kronkltd/jiksnu-core "0.1.0-SNAPSHOT"]
                 [org.clojure/clojure "1.7.0"]
                 ]
  :profiles {:dev {:resource-paths ["test-resources"]
                   :dependencies [[midje "1.7.0"]
                                  [org.slf4j/slf4j-api "1.7.12"]
                                  [org.slf4j/slf4j-log4j12 "1.7.12"]]}}

  )
