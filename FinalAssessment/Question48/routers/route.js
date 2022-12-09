const { Router }=require("express");
const router=new Router();

const Service = require("../service/service");
router.get("/users",Service.getEmployee);

router.get("/users/:id",Service.getEmpById);


module.exports=router;