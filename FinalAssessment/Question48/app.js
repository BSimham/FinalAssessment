var express = require('express');
var routes=require('./routers');
var app = express();
const bodyParser = require("body-parser");
app
    .use(bodyParser.json({ limit: "50mb" }))
    .use(bodyParser.urlencoded({ limit: "50mb", extended: true, parameterLimit: 50000 }))
    .use("/",routes);
    

module.exports = app;

var server = app.listen(3001, function () { });