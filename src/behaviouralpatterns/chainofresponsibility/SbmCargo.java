package behaviouralpatterns.chainofresponsibility;

public class SbmCargo {

    public static CargoCompany getCargoCompany() {

        BakuBranch bakuBranch = new BakuBranch();
        GanjaBranch ganjaBranch = new GanjaBranch();
        BardaBranch bardaBranch = new BardaBranch();
        YevlakhBranch yevlakhBranch = new YevlakhBranch();
        SumqayitBranch sumqayitBranch = new SumqayitBranch();

        CargoCompany sbmCargo = sumqayitBranch
                .setNextCargoCompany(bakuBranch
                        .setNextCargoCompany(yevlakhBranch
                                .setNextCargoCompany(bardaBranch
                                        ))
                );
        return sbmCargo;
    }
}
