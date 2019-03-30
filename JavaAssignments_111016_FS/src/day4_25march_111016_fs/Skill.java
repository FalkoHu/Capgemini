package day4_25march_111016_fs;

public class Skill extends Match{
	
	private String skillName;

	public Skill() {
		super();
	}
	public Skill(String skillName) {
		super();
		this.skillName = skillName;
	}
	
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		String s = String.format("%-15s", skillName);
		return s;
	}
}
