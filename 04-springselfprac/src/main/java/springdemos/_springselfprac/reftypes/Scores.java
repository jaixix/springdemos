package springdemos._springselfprac.reftypes;

public class Scores {
	private int chemistry;
	private int physics;
	private int maths;

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	@Override
	public String toString() {
		return "Scores [chemistry=" + chemistry + ", physics=" + physics + ", maths=" + maths + "]";
	}

}
