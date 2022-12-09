const { Router }=require("express");
const route=require("./route");

const router=new Router();
router.use("/",route);

module.exports=router;