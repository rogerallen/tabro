(defproject tabro "0.1.0-SNAPSHOT"
  :description "tabro: guitar tabulature rotator"
  :url "http://github.com/rogerallen/tabro"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot tabro.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
