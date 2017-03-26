(defproject clojurewerkz/buffy "1.1.0-SNAPSHOT"
  :description  "Clojure library for working with binary data"
  :url          "http://github.com/clojurewerkz/buffy"

  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure     "1.6.0"]
                 [io.netty/netty-buffer   "4.0.26.Final"]
                 [org.clojure/test.check  "0.6.2"]]

  :profiles     {:1.7    {:dependencies [[org.clojure/clojure "1.7.0-alpha5"]]}
                 :master {:dependencies [[org.clojure/clojure "1.7.0-master-SNAPSHOT"]]}
                 :dev    {:resource-paths ["test/resources"]
                          :plugins [[codox "0.8.10"]]
                          :codox {:sources ["src/clojure"]
                                  :output-dir "doc/api"}}}

  :repositories {"sonatype"           {:url "http://oss.sonatype.org/content/repositories/releases"
                                       :snapshots false
                                       :releases {:checksum :fail :update :always}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}

  :aliases      {"all" ["with-profile" "dev:dev,1.5:dev,1.7:dev:dev,master"]})
