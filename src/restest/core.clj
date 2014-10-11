(ns restest.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "JVM started. Press <enter> to slurp the file from resources and printout.")
  (read-line)
  (-> "file.txt"
      clojure.java.io/resource
      .getFile
      slurp
      println
      ))
