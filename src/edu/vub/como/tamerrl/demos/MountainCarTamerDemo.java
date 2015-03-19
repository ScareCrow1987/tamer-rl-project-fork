package edu.vub.como.tamerrl.demos;

import org.rlcommunity.environments.mountaincar.MountainCar;
import org.rlcommunity.rlglue.codec.AgentInterface;
import org.rlcommunity.rlglue.codec.EnvironmentInterface;

import edu.utexas.cs.tamerProject.agents.tamer.TamerAgent;
import edu.utexas.cs.tamerProject.applet.RLApplet;
import edu.utexas.cs.tamerProject.applet.RLPanel;
import edu.utexas.cs.tamerProject.applet.RunLocalExperiment;

public class MountainCarTamerDemo extends RLApplet {

	private static final long serialVersionUID = 1L;
	
	public void initPanel() {
		
		AgentInterface agent = new TamerAgent();
		
		EnvironmentInterface env = new MountainCar(); 
		
		RunLocalExperiment.stepDurInMilliSecs = 800;
		RLPanel.enableSpeedControls = true;
		RLPanel.enableSingleStepControl = false;
		
		rlPanel.init(agent, env);
		this.getContentPane().add(rlPanel);
		this.rlPanel.runLocal.addObserver(this);
		
		rlPanel.runLocal.initExp();
		
		rlPanel.runLocal.startExp();
	}

}
