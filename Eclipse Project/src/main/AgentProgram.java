package main;

import models.MatrixBoard;
import models.PassengerCar;
import models.RoadNetwork;
import models.Vertex;
import jade.core.*;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

public class AgentProgram {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Runtime rt = Runtime.instance(); // Get Jade Runtime
        
        // Create a default Profile
        Profile defaultProfile = new ProfileImpl();
        defaultProfile.setParameter(Profile.PLATFORM_ID, "platform");
        defaultProfile.setParameter(Profile.CONTAINER_NAME, "mainContainer");
        
        // Create the Main Container
        ContainerController mainContainer = rt.createMainContainer(defaultProfile);
 
       try {
    	   // Create the Agent
        	AgentController agentController = mainContainer.createNewAgent(
        			"MaxtrixUtrechtGroningen", 
        			"models.MatrixBoard", 
        			null);
        	// Start Agent
        	agentController.start();

       } catch (StaleProxyException e) {
			e.printStackTrace();
		}
	}
}
