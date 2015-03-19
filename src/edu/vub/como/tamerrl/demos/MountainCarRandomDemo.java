package edu.vub.como.tamerrl.demos;

import org.rlcommunity.agents.random.RandomAgent;
import org.rlcommunity.environments.mountaincar.MountainCar;
import org.rlcommunity.rlglue.codec.AgentInterface;
import org.rlcommunity.rlglue.codec.EnvironmentInterface;

import edu.utexas.cs.tamerProject.applet.RLApplet;

public class MountainCarRandomDemo extends RLApplet {

	private static final long serialVersionUID = 1L;
	
	public void initPanel() {
		
		AgentInterface agent = new RandomAgent();
		
		EnvironmentInterface env = new MountainCar(); 
		
		rlPanel.init(agent, env);
		this.getContentPane().add(rlPanel);
		this.rlPanel.runLocal.addObserver(this);
		
		rlPanel.runLocal.initExp();
		
		rlPanel.runLocal.startExp();
	}

}
