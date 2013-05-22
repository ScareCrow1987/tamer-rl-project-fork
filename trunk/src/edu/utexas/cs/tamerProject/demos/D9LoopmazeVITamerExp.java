package edu.utexas.cs.tamerProject.demos;

import edu.utexas.cs.tamerProject.applet.RLApplet;
import edu.utexas.cs.tamerProject.applet.RLPanel;
import edu.utexas.cs.tamerProject.applet.RunLocalExperiment;
import edu.utexas.cs.tamerProject.applet.TamerApplet;
import edu.utexas.cs.tamerProject.environments.loopmaze.LoopMaze;
import edu.utexas.cs.tamerProject.environments.loopmaze.LoopMazeSecretPath;
import edu.utexas.cs.tamerProject.environments.loopmaze.LoopMazeState;
import edu.utexas.cs.tamerProject.experiments.GeneralExperiment;

import edu.utexas.cs.tamerProject.agents.dynamicProgramming.AsynchDPAgent;
import edu.utexas.cs.tamerProject.agents.dynamicProgramming.DPAgent;

/**
 * This class runs value iteration on a reward function that is being
 * learned by TAMER from live human reward. When the discount factor 
 * for this agent is zero, it's equivalent to a TAMER agent. (However,
 * directly using TamerAgent works on a wider range of environments.)
 * 
 * Note that D5LoopmazeVITamerHelper sets up the agent and environment.
 * 
 * Value iteration will only work with environments that have discrete 
 * states and actions.
 * 
 * In addition to the controls that worked before (when enabled), you
 * can now give reward. '/' key gives +1. 'z' key gives -1. Also, the
 * space bar turns training on and off (i.e., the agent will only update
 * its reward model when training is on).
 * 
 * Further commenting for this and the helper class still needs to be 
 * done.
 * 
 * @author bradknox
 *
 */
public class D9LoopmazeVITamerExp extends TamerApplet{
	
	private static final long serialVersionUID = 6816466628950215810L;
	private static final boolean ADD_FAILURE_STATE = true; // creates a pit in LoopMaze
	GeneralExperiment exp;
	
	public void initPanel() {
		RLApplet.DEBUG_TIME = false;
		
		/*
		 * Instantiate experiment class
		 */
		exp = new D9LoopmazeVITamerHelper();		
		
		/*
		 * Instantiate environment
		 */
		if (ADD_FAILURE_STATE) {
			int[] failLoc = {3, 4};
			LoopMazeState.failLoc = failLoc;
		}
		env = new LoopMaze();
		
		/*
		 * Set experimental parameters
		 */
		RunLocalExperiment.stepDurInMilliSecs = 800;
		RLPanel.enableSpeedControls = true; // false for real exp
		RLPanel.enableSingleStepControl = false; // false for real exp
		
		super.initPanel();
	}
	
	/**
	 *  In Turk experiments, this method is called by parent class TamerApplet
	 *  after the user inputs their user ID and PreExpPanel is finished.
	 */
	protected void prepForStartTask(){
		exp.processTrainerUnique(null, D9LoopmazeVITamerExp.this.trainerUnique);
		
		/*
		 * Init agent
		 */
		//String[] args = AsynchDPExp.getDebugArgsStrArray(); // Use only during debugging??
		agent = exp.createAgent(new String[0], env);

		/*
		 * Set agent parameters
		 */
		agent.setAllowUserToggledTraining(true); // make false for real exp
		agent.setRecordLog(false); // true for real exp
		agent.setRecordRew(false); // true for real exp

		
		/*
		 * Initialize experiment both graphically and in RL Glue 
		 */
		prepPanelsForStartTask();
		rlPanel.runLocal.initExp();	
		
		// At this point, agent.agent_init() has been called, but agent.agent_start() has not.
		
		// Experiment-specific code below.
		if (exp != null) {
			exp.adjustAgentAfterItsInit(new String[0], agent);

		}
		
	}
	
}