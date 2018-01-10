(ns rackhdui.core
  (:require
    [rackhdui.components :refer [app-state home-page login]]
    [rackhdui.api :refer [load-data]]
    [cljsjs.material-ui]
    [cljs-react-material-ui.core :refer [get-mui-theme color]]
    [cljs-react-material-ui.icons :as ic]
    [cljs-react-material-ui.rum :as ui]
    [rum.core :as rum :refer [defc]]
    [clojure.string :as str]
    [com.stuartsierra.component :as component]))

(enable-console-print!)



(defn on-js-reload [])
;; optionally touch your app-state to force rerendering depending on
;; your application
;; (swap! app-state update-in [:__figwheel_counter] inc)



;
;(rum/defc show-snackbar < rum/reactive
;  []
;  (let [show-snackbar (rum/cursor-in app-state [:snackbar :state])
;        snackbar-message @(rum/cursor-in app-state [:snackbar :snackbar-message])
;        snackbar-error? @(rum/cursor-in app-state [:snackbar :snackbar-error?])
;        error-style {:background-color "red"}
;        body {:open               (rum/react show-snackbar)
;              :message            snackbar-message
;              :on-request-close   #(reset! show-snackbar false)}]))



;:hosts (host-table hosts))))



;(footer-template app-state)]])))

;  (rum/with-key (show-dialog local-model-input "Local Model" ld-cursor) :local)
;  (rum/with-key (show-dialog select-base-model-remote "Remote Model" rd-cursor) :remote)
;  (rum/with-key (show-dialog local-template-input "Local Template" lt-cursor) :lt))))

;(rum/mount (login app-state) (js/document.getElementById "app"))

(rum/mount (home-page app-state) (js/document.getElementById "app"))

