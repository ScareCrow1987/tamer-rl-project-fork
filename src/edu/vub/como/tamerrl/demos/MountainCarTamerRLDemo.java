package edu.vub.como.tamerrl.demos;

import org.rlcommunity.environments.mountaincar.MountainCar;
import org.rlcommunity.rlglue.codec.AgentInterface;
import org.rlcommunity.rlglue.codec.EnvironmentInterface;

import edu.utexas.cs.tamerProject.agents.tamerrl.TamerRLAgent;
import edu.utexas.cs.tamerProject.applet.RLApplet;
import edu.utexas.cs.tamerProject.applet.RLPanel;
import edu.utexas.cs.tamerProject.applet.RunLocalExperiment;

public class MountainCarTamerRLDemo extends RLApplet {

	private static final long serialVersionUID = 1L;
	
	public void initPanel() {
		
		TamerRLAgent agent = new TamerRLAgent();
		agent.enableGUI=true;
		EnvironmentInterface env = new MountainCar(); 
		
		RunLocalExperiment.finishExpIfNumStepsInOneEp = 10000;
		RunLocalExperiment.numEpisodes = 50;
		RLPanel.enableSpeedControls = true;
		RLPanel.enableSingleStepControl = false;
		
		rlPanel.init(agent, env);
		this.getContentPane().add(rlPanel);
		this.rlPanel.runLocal.addObserver(this);
		
		rlPanel.runLocal.initExp();
		
		rlPanel.runLocal.startExp();
	}

}
