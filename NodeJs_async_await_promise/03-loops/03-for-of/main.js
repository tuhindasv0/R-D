const PowerPlant=require("./PowerPlant");

async function main(){

    try {
        const powerPlants = [];

    powerPlants.push(new PowerPlant("01"));
    powerPlants.push(new PowerPlant("02"));
    powerPlants.push(new PowerPlant("03"));
    powerPlants.push(new PowerPlant("04"));
    powerPlants.push(new PowerPlant("05"));

    // Let's turn all of them ON
    for(powerPlant of powerPlants) {
      await powerPlant.turnOn();
    };

    // Let's turn all of them OFF
    for(powerPlant of powerPlants) {
      await powerPlant.turnOff();
    };

    } catch (error) {
        console.error(error);
    }
}

main();