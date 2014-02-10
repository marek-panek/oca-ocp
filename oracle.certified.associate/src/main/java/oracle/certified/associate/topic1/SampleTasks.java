package oracle.certified.associate.topic1;

/**
 * Test your knowledge:
 * <ol>
 * <li>What will be printed out if the following code is run with the
 * {@code java SampleTasks hello world} command?
 * </li>
 * <li>
 * Which of the following statements will compile without syntax or runtime
 * errors if they replace the comment line?
 * <ol type='a'>
 * 	<li>sc.i = 5;</li>
 * 	<li>int j = sc.i;</li>
 * 	<li>sc.i = 5.0;</li>
 * 	<li>System.out.println(sc.i);</li>
 * </ol>
 * </li>
 * </ol>
 */
public class SampleTasks {
	public int i;
	
	// In Java all tables have 0-relative indexes.
	// Instead of 'String[] argv' we can use 'String... argv'.
	// This will print: world
	public static void main(String[] argv) {
		System.out.println(argv[1]);
		
		SampleTasks st = new SampleTasks();
		// Comment line
		st.i = 5;
		int j = st.i;
		// st.i = 5.0; // Type mismatch: cannot convert from double to int
		System.out.println(st.i);
	}
}
