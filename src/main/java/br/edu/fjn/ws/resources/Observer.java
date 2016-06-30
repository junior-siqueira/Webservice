package br.edu.fjn.ws.resources;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.enterprise.event.Observes;
import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Internship;
import br.edu.fjn.ws.test.DateTest;

public class Observer {

		public void execute(@Observes VRaptorInitialized event){
			long TEMPO = (100 * 50);
			Timer timer = null;
			if(timer == null){
				timer = new Timer();
				TimerTask tarefa = new TimerTask() {			
					@Override
					public void run() {
						try {
							ArrayList<Internship> internship = InternshipDAO.listAll();
							InternshipDAO dao = new InternshipDAO();
							for(Internship in : internship){
									long result = CompareDate.compareDate(dao.searchId(in.getId()).getDateEvaluation());
									System.out.println("Estamos com "+result+" dias no estágio "+in.getId());
									if(result >= 15){
										if(dao.searchId(in.getId()).getStatus().equals("0")){
											Internship internshipUpdate = dao.searchId(in.getId());
											internshipUpdate.setStatus("1");
											internshipUpdate.setDateEvaluation(CompareDate.saveDate());
											dao.updateStatus(internshipUpdate);
										}else{
											System.out.println("O estágio "+in.getId()+" ainda não precisa de avaliação");
										}
									}else{
										System.out.println("O estágio "+in.getId()+" ainda não atingiu o prazo da avaliação!!!");
									}
								} 		
							System.out.println();
							System.out.println();
						} catch (Exception e) {
							e.printStackTrace();
						}	
					}
				};
				timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
			}
	    }
}
