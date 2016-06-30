package br.edu.fjn.ws.test;

import java.util.ArrayList;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import br.edu.fjn.ws.dao.InternshipDAO;
import br.edu.fjn.ws.model.Internship;

public class MyJob implements Job{
	
	@Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
		ArrayList<Internship> internship = InternshipDAO.listAll();
		InternshipDAO dao = new InternshipDAO();
		for(Internship in : internship){
			try {
				long result = DateTest.compareDate(dao.searchId(in.getId()).getDateEvaluation());
				System.out.println("Estamos com "+result+" dias no estágio "+in.getId());
				if(result >= 15){
					if(dao.searchId(in.getId()).getStatus().equals("0")){
						Internship internshipUpdate = dao.searchId(in.getId());
						internshipUpdate.setStatus("1");
						internshipUpdate.setDateEvaluation(DateTest.saveDate());
						dao.updateStatus(internshipUpdate);
					}else{
						System.out.println("O estágio "+in.getId()+" ainda não precisa de avaliação");
					}
				}else{
					System.out.println("O estágio "+in.getId()+" ainda não atingiu o prazo da avaliação!!!");
				}
				
			} catch (Exception e) {
				
			}			
		}
		System.out.println();
		System.out.println();
    }
}
