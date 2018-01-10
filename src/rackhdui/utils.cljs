(ns rackhdui.utils
  (:require
            [rum.core :as rum]
            [cljs.pprint :as pprint]))


(defn get-compute [coll]
  (filter #(= (:type %) "compute")
          (mapv (fn [node]
                  (select-keys node [:id :name :type])) coll)))

(defn json->clj [string]
  (try
    (print string)
    (js->clj (.parse js/JSON string) :keywordize-keys true)
    (catch js/SyntaxError err
      (print "Error: Error parsing object " err))))






