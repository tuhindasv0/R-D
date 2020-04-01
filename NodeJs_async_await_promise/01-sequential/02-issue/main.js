const{process01,process02}=require("./process");

async function main(){

    try {
        console.time("Total running time");
        var process1=await process01();
        var process2=await process02();

        console.log("process 1 returned",process1);
        console.log("process 2 returned",process2);

        console.log();
        console.timeEnd("Total running time");

    } catch (error) {
        console.error(error);
    }
}

main();