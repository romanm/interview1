package org.java.jdbc.spring;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class MtlDbEntityManager {
	protected final Log log = LogFactory.getLog(getClass());
	@Autowired	protected SimpleJdbcTemplate simpleJdbc;
	protected EntityManager em;
	@PersistenceContext 
	public void setEntityManager(EntityManager em) {this.em = em;}
	public EntityManager getEntityManager() {return em;}
	protected List<Map<String, Object>> getUserStationList_old(String owuser) {
		String sql="SELECT institute.* " +
		" FROM owuser,tree t1,contactperson,tree t2, institute,tree t3,tree t4" +
		" WHERE owuser=?" +
		" AND t1.idclass=idowuser" +
		" AND t2.id=t1.did AND t2.idclass=idcontactperson" +
		" AND t3.idclass=idinstitute AND t3.id=t4.did AND t4.idclass=idcontactperson";
		log.debug(sql+" -- "+owuser);
		List<Map<String, Object>> userStationList = null;
//		List<Map<String, Object>> userStationList = simpleJdbc.queryForList(sql, owuser);
		return userStationList;
	}
}
