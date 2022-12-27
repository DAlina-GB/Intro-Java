package HW-6;

public class main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        LaptopModels modelsLine = new LaptopModels();
        modelsLine.addLaptop(400, 4, 256, 12);
        modelsLine.addLaptop(300, 4, 400, 14);
        modelsLine.addLaptop(1400, 32, 500, 15);
        modelsLine.addLaptop(1100, 8, 256, 14);
        modelsLine.addLaptop(1300, 16, 500, 16);
        modelsLine.addLaptop(1100, 8, 256, 13);
        modelsLine.addLaptop(1250, 16, 400, 13);
        modelsLine.addLaptop(1400, 16, 500, 14);
        modelsLine.addLaptop(1000, 8, 256, 15);
        logger.info(modelsLine.searchModels());
    }
}
