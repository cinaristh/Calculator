public class MemoryCalculator extends BasicCalculator {

    private Double mem;

    //constructor
    public MemoryCalculator(){
        mem=0.0;

    }

    public void addToMemory(Double memory){
        mem= mem + memory;

    }

    public void clearMemory(){mem=0.0;}

    public Double memoryRecall(){
        return mem;
    }



}
