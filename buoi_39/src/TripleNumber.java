import java.util.Objects;

public class TripleNumber {

	public int n1;
	public int n2;
	public int n3;
	
	public TripleNumber(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	@Override
	public String toString() {
		return String.format("TripleNumber [n1=%d, n2=%d, n3=%d]", this.n1, this.n2, this.n3);
	}

    @Override
	public int hashCode() {
		return Objects.hash(this.n1);
	}

	@Override
	public boolean equals(Object obj) {
		return this.n1 == ((TripleNumber)obj).n1;
	}

}