package dbms.contracts;
/** Abstract product **/
public abstract class AQuery {

	public String toString() {
		return this.getClass().getSimpleName().toString();
	};
}
