(require 'cljs.build.api)

(cljs.build.api/watch "src"
  {:main 'the-9th-question.core
   :output-to "out/main.js"})
