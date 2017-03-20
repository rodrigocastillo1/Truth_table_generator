/*Para mandar desde la consola los parámetros debe hacerse así:
	A\&B, AvB, A\<-\>B, A-\>B, A\!B, dependiendo del caso.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Truth_table_generator{
	
	public static void main(String[] args) {
		System.out.println(expressionReader(args[0]));
		
	}

	public static List expressionReader(String expression){
		String[] availableConnective = {"&", "v", "<->", "->", "!"};
		List<String> expression_array;

		for(String connective : availableConnective){
			if(expression.split(connective).length > 1){
				expression_array = new ArrayList<String>(Arrays.asList(expression.split(connective)));
				expression_array.add(connective);
				return(expression_array);
			}
		}
		return null;
	}
}