const{funAlgo}=require("./process");
const now =require("performance-now");

const no_of_test=10;

async function main(){

    try {
        let totalTime=0;
        for(let i=0;i<no_of_test;i++)
        {
            const start=now();
            await funAlgo();
            const end=now();
            totalTime +=(end-start);

        }
        console.log()
        console.log("total time",totalTime);
        console.log("total cases",no_of_test);
        console.log("average time",totalTime/no_of_test);
    } catch (error) {
        console.error(error);
    }
}

main();