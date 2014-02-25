(ns tabro.core
  (:require [tabro.tabro :as tabro])
  (:gen-class))

(defn -main
  "Parse & rotate a guitar tab file."
  [& args]
  (let [filename (first args)]
    (println "tabro reading..." filename)
    (doseq [line (tabro/tab-seq filename)]
      (println line))
    (println "tabro done." filename)))
