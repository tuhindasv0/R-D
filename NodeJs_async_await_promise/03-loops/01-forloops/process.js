const util=require("util");
const wait=util.promisify(setTimeout);

function getRandom(a,b){
    return Math.floor(Math.random()*b)+a;
}
module.exports={

    async funAlgo(){
        console.time("process 1 ended");
        await wait(getRandom(1,9)*100);
        console.timeEnd("process 1 ended");
        }
}