package week7;

public class PetSold extends ItemSold {
    boolean isVaccinated, isNeutered, isHouseBroken;
    PetSold(int number, String description, double price, boolean isVaccinated, boolean isNeutered, boolean isHouseBroken){
        super(number, description, price);
        this.isVaccinated = isVaccinated;
        this.isNeutered = isNeutered;
        this.isHouseBroken = isHouseBroken;
    }
    void setVaccinated(boolean isVaccinated){
        this.isVaccinated = isVaccinated;
    }
    void setNeutered(boolean isNeutered){
        this.isNeutered = isNeutered;
    }
    void setHouseBroken(boolean isHouseBroken){
        this.isHouseBroken = isHouseBroken;
    }
    boolean getVaccinated(){
        return isVaccinated;
    }
    boolean getNeutered(){
        return isNeutered;
    }
    boolean getHouseBroken(){
        return isHouseBroken;
    }
}
