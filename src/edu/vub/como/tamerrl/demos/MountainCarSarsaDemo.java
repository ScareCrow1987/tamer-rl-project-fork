package edu.vub.como.tamerrl.demos;

import java.util.Date;

import org.rlcommunity.environments.mountaincar.MountainCar;
import org.rlcommunity.rlglue.codec.EnvironmentInterface;

import edu.utexas.cs.tamerProject.agents.GeneralAgent;
import edu.utexas.cs.tamerProject.agents.sarsaLambda.SarsaLambdaAgent;
import edu.utexas.cs.tamerProject.applet.RLApplet;
import edu.utexas.cs.tamerProject.applet.RLPanel;
import edu.utexas.cs.tamerProject.applet.RunLocalExperiment;
public class MountainCarSarsaDemo extends RLApplet {

	private static final long serialVersionUID = 1L;
	
	public void initPanel() {
		
		SarsaLambdaAgent agent = new SarsaLambdaAgent();
		/*Date d=new Date();
		GeneralAgent.canWriteToFile = true;
		GeneralAgent.RLLIBRARY_PATH = "C:/Users/ScareCrow.Remnant/workspace/RLShaperExperimenter/";
		agent.setExpName("sarsa-"+d.getTime());
		
		agent.setRecordRew(false);
		agent.setRecordLog(true);
		agent.envName = "Mountain-Car";	
		agent.initParams(agent.envName);*/
		
		EnvironmentInterface env = new MountainCar(); 
		
		//RunLocalExperiment.print_csv_format = true;
		RunLocalExperiment.finishExpIfNumStepsInOneEp = 10000;
		RunLocalExperiment.numEpisodes = 100;
		RLPanel.enableSpeedControls = true;
		RLPanel.enableSingleStepControl = false;
		
		rlPanel.init(agent, env);
		this.getContentPane().add(rlPanel);
		this.rlPanel.runLocal.addObserver(this);
		
		rlPanel.runLocal.initExp();
		rlPanel.runLocal.startExp();
	}
}
