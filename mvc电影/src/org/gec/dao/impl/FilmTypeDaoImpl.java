package org.gec.dao.impl;

import org.gec.dao.FilmTypeDao;
import org.gec.entity.Filmtype;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("filmTypeDao")
public class FilmTypeDaoImpl extends BaseDaoImpl<Filmtype> implements FilmTypeDao {

}
