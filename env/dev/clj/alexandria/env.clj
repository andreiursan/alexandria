(ns alexandria.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [alexandria.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[alexandria started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[alexandria has shut down successfully]=-"))
   :middleware wrap-dev})
