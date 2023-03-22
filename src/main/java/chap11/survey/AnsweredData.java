package chap11.survey;

import java.util.List;

public class AnsweredData {

	private List<String> responses;
	private Respondent res;
	
	public List<String> getResponses() {
		return responses;
	}
	public void setResponses(List<String> responses) {
		this.responses = responses;
	}
	public Respondent getRes() {
		return res;
	}
	public void setRes(Respondent res) {
		this.res = res;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(this.responses.get(0) + " ::: " +this.responses.get(1) + " ::: " + this.responses.get(2));
	}
}
