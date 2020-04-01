const util=require("util");
const wait=util.promisify(setTimeout);

module.exports={

    async process01(){
        console.log("process 1 started");
        console.time("process 1 ended");
        await wait(3000);
        console.timeEnd("process 1 ended");
        console.log();
        return "process-01";
    },

    async process02(){
        console.log("process 2 started");
        console.time("process 2 ended");
        await wait(3000);
        console.timeEnd("process 2 ended");
        console.log();
        return "process-02";
    }
}