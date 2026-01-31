# edn-formatter

To compile
```
npm run build
```

To install (doesn't work with GitHub Actions, don't know how to add to npm registry yet, so just copied manually to [roam2github repo](https://github.com/everruler12/roam2github))
```
npm i https://github.com/everruler12/edn-formatter/tarball/main -s
```

To use
```
const edn_formatter = require('edn-formatter').edn_formatter.core
edn_formatter.format(edn_string) // returns prettified EDN string
```
