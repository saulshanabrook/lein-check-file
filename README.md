# `lein-check-stdin`

A Leiningen plugin that prints erros when parsing some clojure code.

It's output is in the form `<line number> <error message>` if it encounters
an error.

## Usage

Put `[lein-check-stdin "0.1.0"]` into the `:plugins` vector of your `:user`
profile.

```bash
$ echo '(+ 1 1)' | lein check-stdin
# no output on good file
$ echo '(+ 1 1)\n(+ true false)' | lein check-stdin
2 java.lang.Boolean cannot be cast to java.lang.Number
```
