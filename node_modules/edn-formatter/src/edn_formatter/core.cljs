(ns edn_formatter.core
  (:require [clojure.pprint :as pp] [cljs.reader :as edn]))

(defn ^:export format [^String str]
  (with-out-str (pp/pprint (edn/read-string str))))
