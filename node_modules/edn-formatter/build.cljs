(require '[lumo.build.api :as b])

(b/build "src"
  {:main 'edn_formatter.core
   :output-to "dist/edn-formatter.js"
   :optimizations :advanced
   :target :nodejs})