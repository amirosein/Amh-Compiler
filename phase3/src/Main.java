import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class Main {

	
	static int lastId = 0 ;
	public static Vector<State> states = new Vector<State>() ;
	public static Vector<Transition> transitions =new Vector<Transition>() ; 
	
	public static Vector<String> rules = new Vector<String>() ;
	public static Vector<String> leftRules = new Vector<String>() ;
	public static Vector<String> rightRules = new Vector<String>() ;
	
	public static Vector<String> nonTerminals = new Vector<String>() ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		readInput() ;
		for(String rule : rules){
			parseRule(rule) ;
		}
		
		State state0 = new State();
		for(String rd : closure(leftRules.elementAt(0))) {
			state0.rds.addElement(rd) ;
		}
		state0.id = 0 ;
		states.add(state0) ;
		
		generateTransitions(state0) ;

		writeOutputFile() ;
		
		
	}



	private static void writeOutputFile() throws IOException {
		// TODO Auto-generated method stub
	
		for(State s : states) {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
			writer.append('\n');
			writer.append(" *********************************************************************\n");
			writer.append("\t \t \t \t state "+s.id+" : \n");
			for(String s_rd : s.rds) {
				String[] s_rd_splitted = s_rd.split("r") ;
				int dotPlace=Integer.parseInt(s_rd_splitted[0]) ;
				String leftRule= leftRules.elementAt(Integer.parseInt(s_rd_splitted[1]) ) ;
				String RightRule= rightRules.elementAt(Integer.parseInt(s_rd_splitted[1]) ) ;	
				String sub0 = RightRule.substring(0, dotPlace) ;
				String sub1 = RightRule.substring(dotPlace, RightRule.length()) ;		
				String str1 = leftRule+"->"+sub0.replace("@", "int")+"."+sub1.replace("@", "int") ;
				  writer.append('\n');
				  writer.append(str1);	
			}
			writer.append('\n');
			writer.append("\n \t \t \t \t  transitions : \n");
			boolean handle = true ;
			for(Transition t : transitions) {
				if(t.sourceState == s.id) {
					 writer.append("\n");
					String str2 = "with character "+t.transitionChar+"  go to state "+t.destinationState ;
					writer.append(str2);
					handle=false ;
				}
			}  
			if(handle) {
				 writer.append("\n");
					String str2 = "here is a handle" ;
					writer.append(str2);
			}
			    writer.close();
		}
	    System.err.println("result is written in output.txt");
	  
	}



	private static void generateTransitions(State state) {
		// TODO Auto-generated method stub
		Vector<String> transitionChars = new Vector<String>() ;
		
		for(String rd : state.rds ) {
			int rdLeft =Integer.parseInt(rd.split("r")[0])  ;
			int rdRight =Integer.parseInt(rd.split("r")[1]) ;
			
			String right=rightRules.elementAt(rdRight) ;
			
			if(right.length()==rdLeft)
				continue ;
			char transitionChar = right.charAt(rdLeft) ;
			
			if(! transitionChars.contains(String.valueOf(transitionChar) )) {
				transitionChars.add(String.valueOf(transitionChar)) ;
			}
		}
		
		for(String transitionChar : transitionChars ) {
			doTransition(transitionChar.charAt(0) , state) ;
		}
		state.done =true ;
		return ;
		
	}

	private static void doTransition(char transitionChar, State state) {
		State newState = new State() ;
		Vector<String> transitionRds =new Vector<String>() ;
		Vector<String> toClosures = new Vector<String>() ;
		
		for(String rd : state.rds ) {
			int rdLeft =Integer.parseInt(rd.split("r")[0])  ;
			int rdRight =Integer.parseInt(rd.split("r")[1]) ;
			
			String right=rightRules.elementAt(rdRight) ;
			char x = right.charAt(rdLeft) ;
			
		
			if(x==transitionChar && rdLeft<rightRules.elementAt(rdRight).length()) {
				String newRd = (String.valueOf(rdLeft+1))+"r"+String.valueOf(rdRight)  ;
				newState.rds.add(newRd) ;
				
//				closure e uni ke noqte poshtehe () ;
				if(!(rdLeft+1==right.length())) {
					String toClosure = String.valueOf(right.charAt(rdLeft+1)) ;
					if(!toClosures.contains(toClosure))
						toClosures.add(toClosure) ;
				}
			}	
		}
		//doing the closure
		for(String closureChar : toClosures) {
			if(nonTerminals.contains(closureChar)) {
				Vector<String> closureRds = closure(closureChar) ;
				for(String eachClosureRd : closureRds) {
					newState.rds.add(eachClosureRd) ;
				 }
				}
		}
		
		
//		checkState(states,state)
		boolean toAdd=true ;
		int idState=0 ;
		for(State i : states) {
			boolean p=false ;
			boolean q=false ;
			for(String s : i.rds) {
				if(newState.rds.contains(s)) {
					continue ;
				}
				
				else { 
					p=true ;
					break ;
				}
			}
			if(p) {
				for(String ss : newState.rds ) {
					if(i.rds.contains(ss)) {
						continue ;
					}
						
					else {
						q=true ;
						break ;
					}
				}
			}
			if(q || p)
				toAdd=true ;
			else {
				toAdd=false ;
				idState = i.id ;
				break ;
			}
		}
		Transition newTransition=new Transition() ;
		if(toAdd) {
			lastId++ ;
			newState.id = lastId ;
			states.add(newState) ;
			generateTransitions(newState);
			newTransition.sourceState = state.id ;
			newTransition.destinationState = newState.id ;
			newTransition.transitionChar = String.valueOf(transitionChar).replace("@", "int") ;
			}else {
				newTransition.sourceState = state.id ;
				newTransition.destinationState = idState ;
				newTransition.transitionChar = String.valueOf(transitionChar).replace("@", "int") ;
		}
		transitions.add(newTransition) ;
	}

	private static Vector<String> closure(String nonTerminal) {
		Vector<String> ruleDots = new Vector<String>() ;
		int u=0 ;
		for(String eachLeft : leftRules) {
			if (eachLeft.equalsIgnoreCase(nonTerminal)) {
				int index =u ;
				String leftRuleDot = "0" ;
				String rightRuleDot = String.valueOf(index)  ;
				String ruleDot=leftRuleDot+"r"+rightRuleDot ;
				ruleDots.add(ruleDot) ;
				String right = rightRules.elementAt(index) ;
				char firstRight = right.charAt(0) ;
				if(nonTerminals.contains(String.valueOf(firstRight) )) {
					for(String i : closure(String.valueOf(firstRight))){
						if(!ruleDots.contains(i))
							ruleDots.add(i) ;
					}
					
				}
			}
			u++ ;
		}
		return ruleDots;
		// TODO Auto-generated method stub
	}

	private static void parseRule(String rule) {
		String[] ruleSegment = rule.split("->") ;
		leftRules.add(ruleSegment[0])  ;
		rightRules.add(ruleSegment[1])  ;
		for(String l : leftRules) {
			if(!nonTerminals.contains(l)) {
				nonTerminals.add(l) ;
			}
		}
	}

	private static void readInput() {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		FileReader fr = null;
		try {

			fr = new FileReader("input.txt");
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				String x=sCurrentLine.replace("int","@") ;
				rules.add(x) ;
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		
	}

	}
}
