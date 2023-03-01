package teste.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Calendar;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class TesteData {

	@Test
	public void testData() {

		try {

			assertEquals("01032023", DateUtils.getDateAtualReportName());
			
			assertEquals("'2023-03-01'", DateUtils.formatDateSql(Calendar.getInstance().getTime()));
			
			assertEquals("2023-03-01", DateUtils.formatDateSqlSimple(Calendar.getInstance().getTime()));
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

}
