package structuralpatterns.adapter;

public class MobilePhoneElectricalHomeApplianceAdapter implements ElectricalHomeAppliance {
    private MobilePhone mobilePhone;

    public MobilePhoneElectricalHomeApplianceAdapter(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public int run() {
        return mobilePhone.charge();
    }
}
