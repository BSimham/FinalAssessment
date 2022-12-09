var emps=require("./employees.json");
module.exports.getEmployee=async(req,res,next)=>{
    console.log("Books sending..");
    res.send(emps);
};
module.exports.getEmpById=async(req,res,next)=>{
    var id=req.params.id;
    var e=emps.find(x=>x.id==id);
    res.send(e);
};
