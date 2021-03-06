/*******************************************************************************
 * Source File: ContextMatcherTest.java
 ******************************************************************************/
package org.openinfobutton.service.matching;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2010-2013 OpenInfobutton Project, Health Sciences IT, University of Utah<br>
 * Contact: {@code <andrew.iskander@utah.edu>}<br>
 * Biomedical Informatics, 26 South 2000 East<br>
 * Room 5775 HSEB, Salt Lake City, UT 84112<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version Dec 11, 2013
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
{ "/core-data-annotation-context.xml", "/core-data-datasource-context.xml",
		"/core-profile-datasource-context.xml" })
public class ContextMatcherTest
{
	@Autowired
	@Qualifier("simpleJdbcTemplate")
	protected SimpleJdbcTemplate jdbcTemplate;
	
	@Test
	public void assertNumberProfiles() {
		
		assertEquals(countRowsInTable("resource_profiles"), 4);
	}
	
	protected final int countRowsInTable(final String tableName)
	{
		return jdbcTemplate.queryForInt("SELECT COUNT(0) from " + tableName);
	}
}
