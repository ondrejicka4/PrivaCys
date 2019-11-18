package PolicyHandler;

public class PrivacyPolicyHandler implements IPolicyHandler {

    public PrivacyPolicyHandler(){
        PolicyController.getPolicyController().addPolicyHandler(this);
    }

    @Override
    public Policy doesItViolate() {
        return null;
    }
}
