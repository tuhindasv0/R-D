const{process01,process02}=require("./process");

async function main(){

    try {
        console.time("Total running time");
        var data=await Promise.all([process01(),process02()]);
        

        console.log("process 1 returned",data[0]);
        console.log("process 2 returned",data[1]);

        console.log();
        console.timeEnd("Total running time");

    } catch (error) {
        console.error(error);
    }
}

main();