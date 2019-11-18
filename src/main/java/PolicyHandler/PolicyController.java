package PolicyHandler;

import java.util.ArrayList;

public class PolicyController {
    private ArrayList<IPolicyHandler> listOfPolicyHandlers = new ArrayList<>();

    private static PolicyController policyController;

    private PolicyController(){

    }

    public static PolicyController getPolicyController(){
        if (policyController == null){
            policyController = new PolicyController();
        }
        return policyController;
    }

    public void addPolicyHandler(IPolicyHandler iPH){
        if (listOfPolicyHandlers != iPH && iPH != null){
            listOfPolicyHandlers.add(iPH);
        }
    }
}
